package model;

import java.util.ArrayList;
import java.util.List;

public class AgentDeBorsa {
	
	List<AgenciaDeBorsa> agenciesDeBorsa;
	
	public AgentDeBorsa() {
		agenciesDeBorsa = new ArrayList<AgenciaDeBorsa>();
	}
	
	public void registrarAgencia(AgenciaDeBorsa agenciaDeBorsa) {
		agenciesDeBorsa.add(agenciaDeBorsa);
	}
	
	public void notificarEvent(ETipusEvent tipusEvent) {
		
		for (AgenciaDeBorsa agenciaDeBorsa : agenciesDeBorsa) {
            agenciaDeBorsa.notificar(tipusEvent);
        }
	}
}
