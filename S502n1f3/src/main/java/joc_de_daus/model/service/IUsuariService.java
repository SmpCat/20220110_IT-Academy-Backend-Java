package joc_de_daus.model.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import joc_de_daus.model.entity.Usuari;

public interface IUsuariService extends UserDetailsService {

	public Usuari altaUsuari(Usuari usuari) throws Exception;
	public Iterable<Usuari> llistarUsuaris() throws Exception;
}
