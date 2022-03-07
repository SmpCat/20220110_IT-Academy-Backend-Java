package crud.service;

import java.util.List;

import crud.entity.EmpleatDTO;

public interface IGestioEmpleats {

	public double readSalari(String feina);
	public List<EmpleatDTO> readEmpleats(String feina);
	public List<EmpleatDTO> readEmpleats();
	public EmpleatDTO updateEmpleat(EmpleatDTO empleat);
	public EmpleatDTO createEmpleat(EmpleatDTO empleat);
	public int deleteEmpleat(Integer idEmpleat);
}
