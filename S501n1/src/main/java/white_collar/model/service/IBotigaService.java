package white_collar.model.service;

import java.util.List;

import white_collar.model.entity.Botiga;
import white_collar.model.entity.Quadre;

public interface IBotigaService {
	
	public Botiga altaBotiga(Botiga botiga) throws Exception;
	public Iterable<Botiga> llistarBotigues() throws Exception;
	public Botiga afegirQuadreBotiga(Long idBotiga, Quadre quadre) throws Exception;
	public List<Quadre> llistarQuadresBotiga(Long idBotiga) throws Exception;
	public Botiga eliminarQuadresBotiga(Long idBotiga) throws Exception;
}
