package joc_de_daus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import joc_de_dau.dto.JugadorDTO;
import joc_de_daus.Application;
import joc_de_daus.model.entity.Jugador;
import joc_de_daus.model.entity.Tirada;
import joc_de_daus.model.service.IJugadorService;

@RestController
public class JugadorController {

	@Autowired
	IJugadorService jugadorService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	// POST: /players : crea un jugador 
	@PostMapping(value = "players")
	public ResponseEntity<Jugador> altaJugador(Jugador jugadorRequest){
		
		try {
			Jugador jugador = jugadorService.altaJugador(jugadorRequest);
			return new ResponseEntity<>(jugador, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// PUT /players : modifica el nom del jugador 
	@PutMapping(value = "players")
	public ResponseEntity<Jugador> modificarNomJugador(Jugador jugadorRequest) {
	
		try {
			Jugador jugador = jugadorService.modificarNomJugador(jugadorRequest);
			return new ResponseEntity<>(jugador, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// POST /players/{id}/games/ : un jugador específic realitza una tirada  dels daus.  
	@PostMapping(value = "players/{id}/games")
	public ResponseEntity<Tirada> tirarDaus(@PathVariable("id") Long id){
		
		try {
			Tirada tirada = jugadorService.tirarDaus(id);
			return new ResponseEntity<>(tirada, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// DELETE /players/{id}/games: elimina les tirades del jugador
	@DeleteMapping(value = "players/{id}/games")
	public ResponseEntity<HttpStatus> eliminarTiradesJugador(@PathVariable("id") Long idJugador) {
		
		try {
			jugadorService.eliminarTiradesJugador(idJugador);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /players/: retorna el llistat de tots  els jugadors del sistema  amb el seu  percentatge mig  d’èxits   
	@GetMapping(value = "players")
	public ResponseEntity<Iterable<JugadorDTO>> llistarJugadors(){
		
		try {
			Iterable<JugadorDTO> jugadors = jugadorService.llistarJugadors();
			return new ResponseEntity<>(jugadors, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /players/{id}/games: retorna el llistat de jugades per un jugador.  
	@GetMapping(value = "players/{id}/games")
	public ResponseEntity<Iterable<Tirada>> llistarTiradesJugador(@PathVariable("id") Long id) {
		
		try {
			Iterable<Tirada> tirades = jugadorService.llistarTiradesJugador(id);
			return new ResponseEntity<>(tirades, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /players/ranking
	@GetMapping(value = "players/ranking")
	public ResponseEntity<Float> obtenirPercentatgeMigExitTotalJugadors() {
		
		try {
			Float percentatgeMigExitTotalJugadors = jugadorService.obtenirPercentatgeMigExitTotalJugadors();
			return new ResponseEntity<>(percentatgeMigExitTotalJugadors, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /players/ranking/loser
	@GetMapping(value = "players/ranking/loser")
	public ResponseEntity<Jugador> obtenirJugadorPitjorPercentatge() {
		
		try {
			Jugador jugador = jugadorService.obtenirJugadorPitjorPercentatge();
			return new ResponseEntity<>(jugador, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /players/ranking/winner
	@GetMapping(value = "players/ranking/winner")
	public ResponseEntity<Jugador> obtenirJugadorMillorPercentatge() {
		
		try {
			Jugador jugador = jugadorService.obtenirJugadorMillorPercentatge();
			return new ResponseEntity<>(jugador, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
