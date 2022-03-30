package joc_de_daus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import joc_de_daus.Application;
import joc_de_daus.model.entity.Usuari;
import joc_de_daus.model.service.IUsuariService;

@RestController
public class UsuariController {

	@Autowired
	IUsuariService usuariService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	// POST: /users/registrar : crea un usuari
	@PostMapping(value = "users/registrar")
	public ResponseEntity<Usuari> altaUsuari(@RequestBody Usuari usuariRequest){
			
		try {
			usuariRequest.setPassword(bCryptPasswordEncoder.encode(usuariRequest.getPassword()));
			Usuari usuari = usuariService.altaUsuari(usuariRequest);
			return new ResponseEntity<>(usuari, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /users/: retorna el llistat de tots  els usuaris   
	@GetMapping(value = "users")
	public ResponseEntity<Iterable<Usuari>> llistarUsuaris(){
			
		try {
			Iterable<Usuari> usuaris = usuariService.llistarUsuaris();
			return new ResponseEntity<>(usuaris, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// GET /users/{username}: retorna un usuari   
	@GetMapping(value = "users/{username}")
	public ResponseEntity<UserDetails> obtenirUsuari(@PathVariable("username") String username){
				
		try {
			UserDetails usuari = usuariService.loadUserByUsername(username);
			return new ResponseEntity<>(usuari, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}