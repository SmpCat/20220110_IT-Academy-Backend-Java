package controller;

import model.GestioFloristeria;
import model.IGestioFloristeria;
import view.View;

public class Controller {
	
	private View view;
	private IGestioFloristeria gestioFloristeria;

	public Controller() {
		view = new View();
		gestioFloristeria = new GestioFloristeria();
	}
	
	public void tractarPeticions() {
		
		boolean sortir = false;
		gestioFloristeria.escollirFloristeria();
		
        do{
            switch(view.menuPrincipal(gestioFloristeria.getNomFloristeria())){
            	case 0: 
            		//Sortir de l'aplicació
            		view.escriureMissagte("Gràcies per haver fet servir l'aplicació");
            		sortir = true;
            		break;
                case 1:
                	//Llistar Floristeries
                	gestioFloristeria.llistarFloristeries();
                	break;
                case 2:
                	//Escollir Floristeria de Treball
                	gestioFloristeria.escollirFloristeria();
                	break;
                case 3: 
                	//Eliminar Floristeria
                	gestioFloristeria.eliminarFloristeria();
                	break;
                case 4: 
                	//Afegir Arbre
                	gestioFloristeria.afegirArbre();
                	break;
                case 5: 
                	//Afegir Flor
                	gestioFloristeria.afegirFlor();
                	break;
                case 6: 
                	//Afegir Decoració Fusta
                	gestioFloristeria.afegirDecoracioFusta();
                	break;
                case 7: 
                	//Afegir Decoració Plàstic
                	gestioFloristeria.afegirDecoracioPlastic();
                	break;
                case 8: 
                	//Stock de Productes i Quantitats
                	gestioFloristeria.getStockDeProductes();
                	break;
                case 9: 
                	//Retirar Arbre
                	gestioFloristeria.retirarArbre();
                	break;
                case 10: 
                	//Retirar Flor
                	gestioFloristeria.retirarFlor();
                	
                	break;
                case 11: 
                	//Retirar Decoració de Fusta
                	gestioFloristeria.retirarDecoracioFusta();
                	break;
                case 12: 
                	//Retirar Decoració de Plàstic
                	gestioFloristeria.retirarDecoracioPlastic();
                	break;
                case 13: 
                	//Stock de Quantitats
                	gestioFloristeria.getStockDeQuantitats();
                	break;
                case 14: 
                	//Valor Total Floristeria
                	gestioFloristeria.getValorTotalStock();
                	break;
                case 15: 
                	//Crear Ticket de Compra
                	gestioFloristeria.crearTicket();
                	break;
                case 16: 
                	//Mostrar Llistes de Compra
                	gestioFloristeria.getTickets();
                	break;
                case 17: 
                	//Mostrar Valor Total de Vendes
                	gestioFloristeria.getValorTotalVendes();
                	break;
                default:
            }
        }while(!sortir);   
	}
}
