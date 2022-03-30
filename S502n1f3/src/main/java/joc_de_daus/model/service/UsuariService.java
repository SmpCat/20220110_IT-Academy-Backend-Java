package joc_de_daus.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import joc_de_daus.model.entity.Usuari;
import joc_de_daus.model.repository.IUsuariRepository;

@Service
public class UsuariService implements IUsuariService {

	@Autowired
    IUsuariRepository usuariRepository;
	
	@Override
	@Transactional
	public Usuari altaUsuari(Usuari usuariRequest) throws Exception {
		
		if (usuariRepository.findByUsername(usuariRequest.getUsername()) != null) {
			throw new Exception("Error: El username " + "'" + usuariRequest.getUsername() + "'" + " ja existeix");
		} else {
			return usuariRepository.save(usuariRequest);
		}
		
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuari> llistarUsuaris() throws Exception {

		List<Usuari> usuaris = (List<Usuari>) usuariRepository.findAll();
		
		if (usuaris.size() == 0) {
			throw new Exception("Error: No existeix cap usuari donat d'alta");
		}
		return usuaris;
	}

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuari usuari = usuariRepository.findByUsername(username);
		
		if (usuari == null) {
			throw new UsernameNotFoundException("Error: L'usuari " + "'" + username + "'" + " no existeix");
		}
		return usuari;
	}
}
