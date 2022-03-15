package white_collar.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import white_collar.model.entity.Botiga;

@Repository
public interface IBotigaRepository extends CrudRepository<Botiga, Long> {

}
