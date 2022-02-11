package controller;

import model.Pagament;
import model.IPasarelaDePagament;
import model.AbstractPagament;
import model.BotigaDeSabates;
import model.CompteBancari;
import model.PayPal;
import model.TargetaDeCredit;
import view.View;

public class Controller {
	
	BotigaDeSabates botigaDeSabates;
	IPasarelaDePagament pasarelaDePagament;
	private View view;
	
	public Controller() {
		botigaDeSabates = new BotigaDeSabates();
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
                	//Alta mitjan�ant Targeta de cr�dit
                	pasarelaDePagament = new TargetaDeCredit();
                	botigaDeSabates.pagament(pasarelaDePagament);
                	break;
                case 2:
                	//Alta mitjan�ant PayPal
                	pasarelaDePagament = new PayPal();
                	botigaDeSabates.pagament(pasarelaDePagament);
                	break;
                case 3: 
                	//Alta mitjan�ant Compte Bancari
                	pasarelaDePagament = new CompteBancari();
                	botigaDeSabates.pagament(pasarelaDePagament);
                	break;
                default:
            }
        }while(!sortir);   
	}
}
