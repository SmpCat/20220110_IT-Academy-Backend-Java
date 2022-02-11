package model;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeBorsa {
	
	private String nomAgencia;
	private List<ETipusEvent> tipusEventsANotificar;
	
	public AgenciaDeBorsa() {
		this.nomAgencia = null;
		tipusEventsANotificar = new ArrayList<ETipusEvent>();
	}

	public String getNomAgencia() {
		return nomAgencia;
	}

	public void setNomAgencia(String nomAgencia) {
		this.nomAgencia = nomAgencia;
	}
	
	public void afegirEventANotificar(ETipusEvent tipusEvent) {
		this.tipusEventsANotificar.add(tipusEvent);
	}
	
	public void notificar(ETipusEvent tipusEvent) {
		
		for (ETipusEvent tipusEventANotificar: tipusEventsANotificar) {
			if (tipusEventANotificar.equals(tipusEvent)) {
				System.out.println("Notificada l'Agència " + this.nomAgencia + 
						" respecte a l'event " + tipusEvent);
			}
		}	
	}	
}
