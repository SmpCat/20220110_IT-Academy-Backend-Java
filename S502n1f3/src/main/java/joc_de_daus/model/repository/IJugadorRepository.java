package joc_de_daus.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joc_de_daus.model.entity.Jugador;

@Repository
public interface IJugadorRepository extends CrudRepository<Jugador, Long> {
	
	Jugador findByNom(String nom);
}
