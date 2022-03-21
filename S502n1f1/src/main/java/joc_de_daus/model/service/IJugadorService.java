package joc_de_daus.model.service;

import joc_de_dau.dto.JugadorDTO;
import joc_de_daus.model.entity.Jugador;
import joc_de_daus.model.entity.Tirada;

public interface IJugadorService {
	
	public Jugador altaJugador(Jugador jugador) throws Exception;
	public Jugador modificarNomJugador(Jugador jugador) throws Exception;
	public Tirada tirarDaus(Long idJugador) throws Exception;
	public void eliminarTiradesJugador(Long idJugador) throws Exception;
	public Iterable<JugadorDTO> llistarJugadors() throws Exception;
	public Iterable<Tirada> llistarTiradesJugador(Long idJugador) throws Exception;
	public float obtenirPercentatgeMigExitTotalJugadors() throws Exception; 
	public Jugador obtenirJugadorPitjorPercentatge() throws Exception;
	public Jugador obtenirJugadorMillorPercentatge() throws Exception;
}
