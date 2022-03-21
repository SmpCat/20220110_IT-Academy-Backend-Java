package joc_de_daus.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import joc_de_dau.dto.JugadorDTO;
import joc_de_daus.model.entity.Jugador;
import joc_de_daus.model.entity.Tirada;
import joc_de_daus.model.repository.IJugadorRepository;
import joc_de_daus.model.repository.ITiradaRepository;

@Service
public class JugadorService implements IJugadorService {

	@Autowired
    IJugadorRepository jugadorRepository;
	
	@Autowired
    ITiradaRepository tiradaRepository;

	@Override
	@Transactional
	public Jugador altaJugador(Jugador jugador) throws Exception {
		
		validarJugador(jugador);
		if (jugador.getNom().isEmpty()) {
			jugador.setNom("ANÒNIM");
		}
		jugador.setDataRegistre(new Date());
		return jugadorRepository.save(jugador);
	}

	@Override
	@Transactional
	public Jugador modificarNomJugador(Jugador jugadorRequest) throws Exception {
		
		Jugador jugador = null;
		Optional<Jugador> jugadorOptional = jugadorRepository.findById(jugadorRequest.getId());
		if (jugadorOptional.isPresent()) {
			jugador = jugadorOptional.get();
			validarJugador(jugadorRequest);
			jugador.setNom(jugadorRequest.getNom());
			if (jugador.getNom().isEmpty()) {
				jugador.setNom("ANÒNIM");
			}
		} else {
			throw new Exception("Error: El jugador amb id '" + jugadorRequest.getId() + "' no exixteix.");
		}
		return jugador;
	}
	
	@Override
	@Transactional
	public Tirada tirarDaus(Long idJugador) throws Exception {
		
		Tirada tirada = null;
		
		Optional<Jugador> jugadorOptional = jugadorRepository.findById(idJugador);
		if(jugadorOptional.isPresent()) {
			Jugador jugador = jugadorOptional.get();
			tirada = new Tirada();
			tirada.setJugador(jugador);
			tirada.setValorDau1(aleatori(1,6));
			tirada.setValorDau2(aleatori(1,6));
			tiradaRepository.save(tirada);
		} else {
			throw new Exception("Error: El jugador amb id '" + idJugador + "' no exixteix.");
		}
		
		return tiradaRepository.save(tirada);
	}

	@Override
	@Transactional
	public void eliminarTiradesJugador(Long idJugador) throws Exception {
		
		Optional<Jugador> jugadorOptional = jugadorRepository.findById(idJugador);
		if (jugadorOptional.isPresent()) {
			jugadorOptional.get().setTirades(new ArrayList<Tirada>());
		} else {
			throw new Exception("Error: El jugador amb id '" + idJugador + "' no exixteix.");
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Iterable<JugadorDTO> llistarJugadors() throws Exception {
		
		List<JugadorDTO> jugadorsDTO = new ArrayList<JugadorDTO>();
		ModelMapper modelMapper = new ModelMapper();
		
		Iterable<Jugador> jugadors = jugadorRepository.findAll();
		
		for(Jugador jugador:jugadors) {
			JugadorDTO jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
			Float numeroTotalDeTirades = (float) tiradaRepository.countByJugador(jugador);
			if (numeroTotalDeTirades > 0) {
				Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASet(jugador);
				Float percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
				jugadorDTO.setPercentatgeMigEncerts(percentatgeMigEncerts);
			} else {
				jugadorDTO.setPercentatgeMigEncerts(null);
			}
			jugadorsDTO.add(jugadorDTO);
		}
		return jugadorsDTO;
	}
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Tirada> llistarTiradesJugador(Long idJugador) throws Exception {
		
		Iterable<Tirada> tirades = null;
		
		Optional<Jugador> jugadorOptional = jugadorRepository.findById(idJugador);
		if(jugadorOptional.isPresent()) {
			tirades = tiradaRepository.findAllByJugador(jugadorOptional.get());
		} else {
			throw new Exception("Error: El jugador amb id '" + idJugador + "' no exixteix.");
		}
		
		return tirades;
	}

	@Override
	@Transactional(readOnly=true)
	public float obtenirPercentatgeMigExitTotalJugadors() throws Exception {
		
		Float percentatgeMigEncerts = null;
		Float numeroTotalDeTirades = (float) tiradaRepository.countNotNull();
		
		if (numeroTotalDeTirades > 0) {
			Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASetNotNull();
			percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
		} else {
			throw new Exception("Error: No existeix cap tirada, o bé totes, han estan eliminades.");
		}
		return percentatgeMigEncerts;
	}

	@Override
	@Transactional(readOnly=true)
	public Jugador obtenirJugadorPitjorPercentatge() throws Exception {
		
		Boolean primerJugadorValid = false;
		JugadorDTO jugadorDTO = new JugadorDTO();
		ModelMapper modelMapper = new ModelMapper();
		
		Iterator<Jugador> jugadors = jugadorRepository.findAll().iterator();
		
		// Obtenir el primer jugador amb tirades realitzades
		while (jugadors.hasNext() && !primerJugadorValid) {
			Jugador jugador = jugadors.next();
			Float numeroTotalDeTirades = (float) tiradaRepository.countByJugador(jugador);
			if (numeroTotalDeTirades > 0) {
				Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASet(jugador);
				Float percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
				jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
				jugadorDTO.setPercentatgeMigEncerts(percentatgeMigEncerts);
				primerJugadorValid = true;
			}
		}
		
		// Obtenir la resta de jugadors i comparar cadascú amb el que té el pitjor percentatge d'èxit
		while (jugadors.hasNext()) {
			Jugador jugador = jugadors.next();
			Float numeroTotalDeTirades = (float) tiradaRepository.countByJugador(jugador);
			if (numeroTotalDeTirades > 0) {
				Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASet(jugador);
				Float percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
				if (percentatgeMigEncerts < jugadorDTO.getPercentatgeMigEncerts()) {
					jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
					jugadorDTO.setPercentatgeMigEncerts(percentatgeMigEncerts);
				}
			}
		}
		return jugadorDTO;
	}

	@Override
	@Transactional(readOnly=true)
	public Jugador obtenirJugadorMillorPercentatge() throws Exception {

		Boolean primerJugadorValid = false;
		JugadorDTO jugadorDTO = new JugadorDTO();
		ModelMapper modelMapper = new ModelMapper();
		
		Iterator<Jugador> jugadors = jugadorRepository.findAll().iterator();
		
		// Obtenir el primer jugador amb tirades realitzades
		while (jugadors.hasNext() && !primerJugadorValid) {
			Jugador jugador = jugadors.next();
			Float numeroTotalDeTirades = (float) tiradaRepository.countByJugador(jugador);
			if (numeroTotalDeTirades > 0) {
				Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASet(jugador);
				Float percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
				jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
				jugadorDTO.setPercentatgeMigEncerts(percentatgeMigEncerts);
				primerJugadorValid = true;
			}
		}
		
		// Obtenir la resta de jugadors i comparar cadascú amb el que té el major percentatge d'èxit
		while (jugadors.hasNext()) {
			Jugador jugador = jugadors.next();
			Float numeroTotalDeTirades = (float) tiradaRepository.countByJugador(jugador);
			if (numeroTotalDeTirades > 0) {
				Float numeroDeTiradesGuanyades = (float) tiradaRepository.countValorDausIgualASet(jugador);
				Float percentatgeMigEncerts = (numeroDeTiradesGuanyades * 100) / numeroTotalDeTirades;
				if (percentatgeMigEncerts > jugadorDTO.getPercentatgeMigEncerts()) {
					jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
					jugadorDTO.setPercentatgeMigEncerts(percentatgeMigEncerts);
				}
			}
		}
		return jugadorDTO;
	}
	
	private void validarJugador(Jugador jugador) throws Exception {
		
		if (!jugador.getNom().isEmpty()) {
			if (jugadorRepository.findByNom(jugador.getNom()) != null) {
				throw new Exception("Error: El nom del jugador '" + jugador.getNom() + "' ja exixteix.");	
			}
		} 
	}
	
	private byte aleatori(int min, int max) {
		
		return (byte) Math.floor(Math.random()*(max - min + 1)+ min);
	}
}
