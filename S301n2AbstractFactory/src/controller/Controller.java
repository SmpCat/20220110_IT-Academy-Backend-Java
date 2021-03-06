package controller;

import model.ProducerAgenda;
import model.IAbstractAdreša;
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
            		view.escriureMissagte("GrÓcies per haver fet servir l'aplicaciˇ");
            		sortir = true;
            		break;
                case 1: 
                	IAbstractAdreša adrešaEspanyola = ProducerAgenda.getAgenda(EnumTipusAgenda.ESPANYA).crearAdreša();
                	view.escriureMissagte(adrešaEspanyola.formatejarAdreša(view.llegirAdreša()));
                	break;
                case 2:
                	IAbstractAdreša adrešaItaliana = ProducerAgenda.getAgenda(EnumTipusAgenda.ITALIA).crearAdreša();
                	view.escriureMissagte(adrešaItaliana.formatejarAdreša(view.llegirAdreša()));
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
