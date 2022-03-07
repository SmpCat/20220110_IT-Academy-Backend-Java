package crud.service;

import java.util.ArrayList;
import java.util.List;
import crud.entity.EmpleatDTO;
import crud.entity.FeinaDTO;

public class GestioEmpleats implements IGestioEmpleats {
	
	private List<EmpleatDTO> empleats;
	private List<FeinaDTO> feines;
	
	public GestioEmpleats() {
		
		empleats = new ArrayList<EmpleatDTO>();
		empleats.add(new EmpleatDTO(1, "Pepe", "Mecànic"));
		empleats.add(new EmpleatDTO(2, "Joan", "Enginyer"));
		empleats.add(new EmpleatDTO(3, "Marc", "Forner"));
		empleats.add(new EmpleatDTO(4, "Lucas", "Policia"));
		empleats.add(new EmpleatDTO(5, "Matias", "Enginyer"));
		
		feines = new ArrayList<FeinaDTO>();
		feines.add(new FeinaDTO("Mecànic", 1500.00));
		feines.add(new FeinaDTO("Enginyer", 2500.00));
		feines.add(new FeinaDTO("Forner", 1700.00));
		feines.add(new FeinaDTO("Policia", 1900.00));
	}
	
	@Override
	public double readSalari(String feinaRequest) {
		
		FeinaDTO feina = null;
		
		for (Integer i = 0; i < feines.size() && feina == null; i++) {
		
			if (feines.get(i).getNom().equals(feinaRequest)) {
				feina = feines.get(i);
			}
		}
		
		if (feina != null) {
			return feina.getSalari();
		} else {
			return -1;
		}	
	}
	
	@Override
	public List<EmpleatDTO> readEmpleats(String feina) {
		
		List<EmpleatDTO> empleatsFeina = new ArrayList<EmpleatDTO>();
		
		for (EmpleatDTO empleat:empleats) {
			
			if (empleat.getFeina().equals(feina)) {
				empleatsFeina.add(empleat);
			}
		}
		
		return empleatsFeina;
	}

	@Override
	public List<EmpleatDTO> readEmpleats() {
		return empleats;
	}

	@Override
	public EmpleatDTO updateEmpleat(EmpleatDTO empleatRequest) {
		
		EmpleatDTO empleat = null;
		int posicioArray = buscarId(empleatRequest.getId());
		
		if ( posicioArray >= 0) {
			if (validarEmpleat(empleatRequest)) {
				empleats.add(empleatRequest);
				empleats.remove(posicioArray);
				empleat = empleatRequest;
			}
		}
	
		return empleat;
	}

	@Override
	public EmpleatDTO createEmpleat(EmpleatDTO empleatRequest) {
		
		EmpleatDTO empleat = null;
		int posicioArray = buscarId(empleatRequest.getId());
		
		if (posicioArray < 0) {
			if (validarEmpleat(empleatRequest)) {
				empleats.add(empleatRequest);
				empleat = empleatRequest;
			}
		}
	
		return empleat;
	}

	@Override
	public int deleteEmpleat(Integer idEmpleat) {
		
		int posicioArray = buscarId(idEmpleat);
		
		if ( posicioArray >= 0) {
			empleats.remove(posicioArray);
		}
	
		return posicioArray;
	}
	
	private boolean validarEmpleat(EmpleatDTO empleat) {
		
		boolean validar = true;
	
		if (empleat.getId() == null || empleat.getNom() == null || empleat.getFeina() == null) {
			validar= false;
		}
		
		if (validar) {
			if (empleat.getNom().isEmpty()) {
				validar = false;
			}
		}
		
		if (validar) {
			if(buscarFeina(empleat.getFeina()) < 0) {
				validar = false;
			}
		}
		
		return validar;
	}
	
	private int buscarId(Integer idEmpleat) {
		
		int posicioArray = -1;
		
		for (Integer i = 0; i < empleats.size() && posicioArray < 0; i++) {
			
			if (empleats.get(i).getId().equals(idEmpleat)) {
				posicioArray = i;
			}
		}
	
		return posicioArray;
	}
	
	private int buscarFeina(String feina) {
		
		int posicioArray = -1;
		
		for (Integer i = 0; i < feines.size() && posicioArray < 0; i++) {
		
			if (feines.get(i).getNom().equals(feina)) {
				posicioArray = i;
			}
		}
		
		return posicioArray;
	}
}
