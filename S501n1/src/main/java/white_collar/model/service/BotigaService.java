package white_collar.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import white_collar.model.entity.Botiga;
import white_collar.model.entity.Quadre;
import white_collar.model.repository.IBotigaRepository;

@Service
public class BotigaService implements IBotigaService {

	@Autowired
    IBotigaRepository botigaRepository;
	
	@Override
	@Transactional
	public Botiga altaBotiga(Botiga botiga) throws Exception {
		return botigaRepository.save(botiga);
	}

	@Override
	@Transactional(readOnly=true)
	public Iterable<Botiga> llistarBotigues() throws Exception {
		return botigaRepository.findAll();
	}

	@Override
	@Transactional
	public Botiga afegirQuadreBotiga(Long idBotiga, Quadre quadre) throws Exception {
		
		Botiga botiga = null;
		
		Optional<Botiga> botigaOptional = botigaRepository.findById(idBotiga);
		if (botigaOptional.isPresent()) {
			botiga = botigaOptional.get();
			if (botiga.getQuadres().size() < botiga.getCapacitat()) {
				quadre.setDataEntrada(new Date());
				quadre.setBotiga(botiga);
				List<Quadre> quadres = botiga.getQuadres();
				quadres.add(quadre);
				botiga.setQuadres(quadres);
				botiga = botigaRepository.save(botiga);
			} else {
				throw new Exception("Error: Número de quadres afegits: " + botiga.getQuadres().size() + 
						            " . Capacitat màxima: " + botiga.getCapacitat());			            
			}
        } else {
        	throw new Exception("Error: La botiga no està donada d'alta");
        }
		return botiga;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Quadre> llistarQuadresBotiga(Long idBotiga) throws Exception {
		
		List<Quadre> quadres = null;
		
		Optional<Botiga> botiga = botigaRepository.findById(idBotiga);
		if (botiga.isPresent()) {
			quadres = botiga.get().getQuadres();
        }
		return quadres;
	}

	@Override
	@Transactional
	public Botiga eliminarQuadresBotiga(Long idBotiga) throws Exception {
	
		Botiga botiga = null;
		
		Optional<Botiga> botigaOptional = botigaRepository.findById(idBotiga);
		if (botigaOptional.isPresent()) {
			botiga = botigaOptional.get();
			
			/* Esborrar físicament els quadres de la BBDD
			List<Quadre> quadres = botiga.getQuadres();
			for (Quadre quadre: quadres) {
				quadreRepository.delete(quadre);
			}
			*/
			
			botiga.setQuadres(new ArrayList<Quadre>());
			botigaRepository.save(botiga);
		} else {
        	botiga = botigaOptional.get();
        }
		
		return botiga;
	}
}
