package joc_de_daus.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import joc_de_daus.model.entity.Usuari;

@Repository
public interface IUsuariRepository extends CrudRepository<Usuari, Long> {
	
	Usuari findByUsername(String username);
}
