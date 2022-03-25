package joc_de_daus.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import joc_de_daus.model.entity.Jugador;
import joc_de_daus.model.entity.Tirada;

@Repository
public interface ITiradaRepository extends MongoRepository<Tirada, String> {
	
	long countByJugador(Jugador jugador);
	
	Iterable<Tirada> findAllByJugador(Jugador jugador);
	
	void deleteByJugador(Jugador jugador);
	
}
