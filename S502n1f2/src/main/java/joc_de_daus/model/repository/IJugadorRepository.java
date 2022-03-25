package joc_de_daus.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import joc_de_daus.model.entity.Jugador;

@Repository
public interface IJugadorRepository extends MongoRepository<Jugador, String> {
	
	Jugador findByNom(String nom);
}
