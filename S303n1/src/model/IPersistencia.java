package model;

import java.util.List;

public interface IPersistencia {

	public void guardarFloristeria(String directori, Floristeria novaFloristeria);
	public Floristeria getFloristeria(String directori, String nomFloristeria);
	public List<String> getLListarFloristeries(String directori);
	public boolean eliminarFloristeria(String directori, String nomFloristeriaAEliminar);

}
