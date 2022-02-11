package controller;

import model.ProducerAgenda;
import model.IAbstractAdre�a;
import model.IAbstractTelefon;
import model.EnumTipusAgenda;
import view.View;

public class Controller {
	
	private View view;
	
	public Controller() {
		view = new View();
	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(view.menuPrincipal()){
            	case 0: 
            		view.escriureMissagte("Gr�cies per haver fet servir l'aplicaci�");
            		sortir = true;
            		break;
                case 1: 
                	IAbstractAdre�a adre�aEspanyola = ProducerAgenda.getAgenda(EnumTipusAgenda.ESPANYA).crearAdre�a();
                	view.escriureMissagte(adre�aEspanyola.formatejarAdre�a(view.llegirAdre�a()));
                	break;
                case 2:
                	IAbstractAdre�a adre�aItaliana = ProducerAgenda.getAgenda(EnumTipusAgenda.ITALIA).crearAdre�a();
                	view.escriureMissagte(adre�aItaliana.formatejarAdre�a(view.llegirAdre�a()));
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
