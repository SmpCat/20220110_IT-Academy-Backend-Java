package white_collar.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import white_collar.Application;
import white_collar.model.entity.Botiga;
import white_collar.model.entity.Quadre;
import white_collar.model.service.IBotigaService;

@RestController
public class BotigaController {

	@Autowired
	IBotigaService botigaService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@PostMapping(value = "shops")
	public ResponseEntity<Botiga> altaBotiga(Botiga botigaRequest){
		
		try {
			Botiga botiga = botigaService.altaBotiga(botigaRequest);
			return new ResponseEntity<>(botiga, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value = "shops")
	public ResponseEntity<Iterable<Botiga>> llistarBotigues(){
		
		try {
			Iterable<Botiga> botigues = botigaService.llistarBotigues();
			return new ResponseEntity<>(botigues, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(value = "shops/{id}/pictures")
	public ResponseEntity<Botiga> afegirQuadreBotiga( @PathVariable("id") Long id, Quadre quadreRequest) {
		
		try {
			Botiga botiga = botigaService.afegirQuadreBotiga(id, quadreRequest);
			return new ResponseEntity<>(botiga, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value = "shops/{id}/pictures")
	public ResponseEntity<List<Quadre>> llistarQuadresBotiga( @PathVariable("id") Long id) {
		
		try {
			List<Quadre> quadres = botigaService.llistarQuadresBotiga(id);
			return new ResponseEntity<>(quadres, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(value = "shops/{id}/pictures")
	public ResponseEntity<Botiga> eliminarQuadresBotiga( @PathVariable("id") Long id) {
		
		try {
			Botiga botiga = botigaService.eliminarQuadresBotiga(id);
			return new ResponseEntity<>(botiga, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
