package S301n1Singleton;

public class Controller {
	
	View view;
	UndoSingleton instance;

	public Controller() {
		view = new View();
		instance = UndoSingleton.getInstance();
	}
	
	public void tractarPeticions() {
		
		boolean sortir = false;
		
		do{
	        switch(view.menuPrincipal()){
	        	case 0: 
	        		System.out.println("Gràcies per utilitzar l'aplicació");
	        		sortir = true;
	        		break;
	            case 1:
	            	afegirComanda();
	            	break;
	            case 2: 
	            	eliminarComanda();
	            	break;
	            case 3: 
	            	llistarComandes();
	            	break;
	        }
	    }while(!sortir);   
	}
	
	public void afegirComanda() {
		instance.afegirComanda(view.llegirComanda());
	}
	
	public void eliminarComanda() {
		int posicio, numeroDeComandesInsertades;
		
		numeroDeComandesInsertades = instance.getNumeroDeComandesInsertades();
		
		if (numeroDeComandesInsertades > 0) {
			
			do{
				posicio = view.eliminarComanda();
				
	            if(posicio < 1 || posicio > numeroDeComandesInsertades) {
	                System.out.println("Error: La posició de la comanda a eliminar és incorrecte ");
	            }
	        } while (posicio < 1 || posicio > numeroDeComandesInsertades);
			
			instance.eliminarComanda(posicio-1);
				
		} else {
			System.out.println("Error: No hi ha cap comanda per eliminar ");
		}
	}
	
	public void llistarComandes() {
		
		if (instance.getNumeroDeComandesInsertades() > 0) {
			instance.llistarComandes();
		} else {
			System.out.println("Error: No hi ha cap comanda per llistar ");
		}	
	}
}
