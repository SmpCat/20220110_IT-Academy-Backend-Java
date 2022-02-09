package controller;

import model.SingletonUndo;
import view.View;

public class Controller {
	
	private View view;
	private SingletonUndo singletonUndo;
	
	public Controller() {
		this.view = new View();
		this.singletonUndo = SingletonUndo.getInstance();
	}
	
	public void afegirComando() {
		
		boolean error;
		
		do {
			error = false;
			String comando = view.afegirComando();
			String comandoNormalitzat = comando.replaceAll("\\s+","");
			if (comandoNormalitzat.isEmpty()) {
				error = true;
				view.escriureMissagte("Error: El comando introduït és erroni.");
			}
			else {
				singletonUndo.afegirComando(comando);
			}
		} while (error);
	}
	
	public void llistarComandos() {
		
		if (singletonUndo.getNumeroComandos() == 0) {
			view.escriureMissagte("Error: El número de comandos a llistar és zero");
		} else {
			singletonUndo.llistarComandos();
		}
	}
	
	public void eliminarComando() {
		
		boolean error;
		
		if (singletonUndo.getNumeroComandos() > 0) {
			
			do {
				error = false;
				int posicio = view.eliminarComando();
				if (posicio < 1 || posicio > singletonUndo.getNumeroComandos()) {
					error = true;
					view.escriureMissagte("Error: La posició del comando a eliminar és incorrecta");
				} else {
					singletonUndo.eliminarComando(posicio - 1);
				}
			} while (error);
			
		} else {
			view.escriureMissagte("Error: El número de comandos a eliminar és zero");
		}
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
                	afegirComando();
                	break;
                case 2: 
                	eliminarComando();
                	break;
                case 3: 
                	llistarComandos();
                	break;
                default:
            }
        }while(!sortir);   
	}
}
