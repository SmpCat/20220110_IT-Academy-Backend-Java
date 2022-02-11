package controller;

import model.AgenciaDeBorsa;
import model.AgentDeBorsa;
import model.ETipusEvent;
import view.View;

public class Controller {
	
	private AgentDeBorsa agentDeBorsa;
	private View view;
	
	public Controller() {
		agentDeBorsa = new AgentDeBorsa();
		view = new View();
	}
	
	public void altaEventsAgencia(AgenciaDeBorsa agenciaDeBorsa) {
		
		switch(view.menuEvents()){
            
			case 0:
				//Sortir
				break;
            case 1:
                //Alta event PUJAR BORSA
                agenciaDeBorsa.afegirEventANotificar(ETipusEvent.PUJAR_BORSA);
                break;
            case 2:
            	//Alta event BAIXADA DE BORSA
            	agenciaDeBorsa.afegirEventANotificar(ETipusEvent.BAIXAR_BORSA);
            	break;
            case 3: 
            	//Alta de tots els events
            	agenciaDeBorsa.afegirEventANotificar(ETipusEvent.PUJAR_BORSA);
            	agenciaDeBorsa.afegirEventANotificar(ETipusEvent.BAIXAR_BORSA);
            	break;
            default:   
		}  
	}
	
	public void altaAgencia() {
		
		boolean error;
		AgenciaDeBorsa agenciaDeBorsa = new AgenciaDeBorsa();
		
		do {
			error = false;
			String nomAgencia = view.afegirAgencia();
			String nomAgenciaNormalitzat = nomAgencia.replaceAll("\\s+","");
			
			if (nomAgenciaNormalitzat.isEmpty()) {
				error = true;
				view.escriureMissagte("Error: L'Agència introduïda és errònia.");
			}
			else {
				agenciaDeBorsa.setNomAgencia(nomAgencia);
				altaEventsAgencia(agenciaDeBorsa);
				agentDeBorsa.registrarAgencia(agenciaDeBorsa);
			}
		} while (error);
    
	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(view.menuPrincipal()){
            	case 0: 
            		view.escriureMissagte("Gràcies per haver fet servir l'aplicació");
            		sortir = true;
            		break;
                case 1:
                	//Alta d'Agència
                	altaAgencia();
                	break;
                case 2:
                	//Notificar Pujada de Borsa
                	agentDeBorsa.notificarEvent(ETipusEvent.PUJAR_BORSA);
                	break;
                case 3: 
                	//Notificar Baixada de Borsa
                	agentDeBorsa.notificarEvent(ETipusEvent.BAIXAR_BORSA);
                	break;
                default:
            }
        }while(!sortir);   
	}
}
