package controller;

import model.ProducerAgenda;
import model.IAbstractAdreça;
import model.IAbstractTelefon;
import model.EnumTipusAgenda;
import view.View;

public class Controller {
	
	private View view = new View();
	
	public Controller() {
	
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
                	IAbstractAdreça adreçaEspanyola = ProducerAgenda.getAgenda(EnumTipusAgenda.ESPANYA).crearAdreça();
                	view.escriureMissagte(adreçaEspanyola.formatejarAdreça(view.llegirAdreça()));
                	break;
                case 2:
                	IAbstractAdreça adreçaItaliana = ProducerAgenda.getAgenda(EnumTipusAgenda.ITALIA).crearAdreça();
                	view.escriureMissagte(adreçaItaliana.formatejarAdreça(view.llegirAdreça()));
                	break;
                case 3: 
                	IAbstractTelefon telefonEspanyol = ProducerAgenda.getAgenda(EnumTipusAgenda.ESPANYA).crearTelefon();
                	view.escriureMissagte(telefonEspanyol.formatejarTelefon(view.llegirTelefon()));
                	break;
                case 4:
                	IAbstractTelefon telefonItalia = ProducerAgenda.getAgenda(EnumTipusAgenda.ITALIA).crearTelefon();
                	view.escriureMissagte(telefonItalia.formatejarTelefon(view.llegirTelefon()));
                	break;
                default:
            }
        }while(!sortir);   
	}
}
