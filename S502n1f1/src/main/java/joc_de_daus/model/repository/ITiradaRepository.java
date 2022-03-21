package joc_de_daus.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import joc_de_daus.model.entity.Jugador;
import joc_de_daus.model.entity.Tirada;

@Repository
public interface ITiradaRepository extends CrudRepository<Tirada, Long> {
	
	long countByJugador(Jugador jugador);
	
	@Query("SELECT COUNT(t) FROM Tirada t WHERE t.jugador != null")
	long countNotNull();
	
	@Query("SELECT COUNT(t) FROM Tirada t WHERE t.jugador = ?1 and t.valorDau1 + t.valorDau2 = 7")
	long countValorDausIgualASet(Jugador jugador);
	
	@Query("SELECT COUNT(t) FROM Tirada t WHERE t.jugador !=null and t.valorDau1 + t.valorDau2 = 7")
	long countValorDausIgualASetNotNull();
	
	Iterable<Tirada> findAllByJugador(Jugador jugador);
	
	void deleteByJugador(Jugador jugador);
	
}
