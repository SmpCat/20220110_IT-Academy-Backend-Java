package controller;

import java.util.ArrayList;
import java.util.List;

import model.EComptador;
import model.FacadeComptadorProducte;
import model.Floristeria;
import model.IComptadorProducte;
import view.View;

public class Controller {
	
	private List<Floristeria> floristeries;
	private IComptadorProducte facadeComptador;
	private View view;
	
	public Controller() {
		floristeries = new ArrayList<Floristeria>();
		facadeComptador = new FacadeComptadorProducte();
		view = new View();
	}
	
	private void crearFloristeria() {
		
		facadeComptador.obtenirComptador(EComptador.FLORISTERIA);
		Floristeria floristeria = new Floristeria();
		floristeria.setNomFloristeria(view.getNomFloristeria());
		floristeries.add(floristeria);
	}
	
	private void afegirArbre() {

	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(view.menuPrincipal()){
            	case 0: 
            		//Sortir de l'aplicació
            		view.escriureMissagte("Gràcies per haver fet servir l'aplicació");
            		sortir = true;
            		break;
                case 1:
                	//Crear Floristeria
                	crearFloristeria();
                	break;
                case 2:
                	//Afegir Arbre
                	afegirArbre();
                	break;
                case 3: 
                	//Afegir Flor
                	
                	break;
                case 4: 
                	//Afegir Decoració
                	
                	break;
                case 5: 
                	//Stock de Productes i Quantitats
                	break;
                case 6: 
                	//Retirar Arbre
                	
                	break;
                case 7: 
                	//Retirar Flor
                	
                	break;
                case 8: 
                	//Retirar Decoració
                	
                	break;
                case 9: 
                	//Stock de Quantitats
                	
                	break;
                case 10: 
                	//Valor Total Floristeria
                	
                	break;
                case 11: 
                	//Crear Ticket de Compra
                	
                	break;
                case 12: 
                	//Mostrar Llistes de Compra
                	
                	break;
                case 13: 
                	//Mostrar Valor Total de Ventes
                	
                	break;
                default:
            }
        }while(!sortir);   
	}
}
