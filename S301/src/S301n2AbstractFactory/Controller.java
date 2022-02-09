package S301n2AbstractFactory;

public class Controller {
	
	View view;
	IAbstractFactoryVehicle factoryVehicle;
	IAbstractCotxe cotxeBenzina, cotxeElectric;
	IAbstractMoto motoBenzina, motoElectrica;
	
	public Controller() {
		view = new View();
		
		factoryVehicle = FactoryVehicleProducer.getVehicleFactory(TipusVehicle.BENZINA);
		cotxeBenzina = factoryVehicle.crearCotxe();
		motoBenzina = factoryVehicle.crearMoto();
		
		factoryVehicle = FactoryVehicleProducer.getVehicleFactory(TipusVehicle.ELECTRIC);
		cotxeElectric = factoryVehicle.crearCotxe();
		motoElectrica = factoryVehicle.crearMoto();
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
	            	cotxeBenzina.arrencar();
	            	break;
	            case 2: 
	            	cotxeElectric.arrencar();
	            	break;
	            case 3: 
	            	motoBenzina.arrencar();
	            	break;
	            case 4:
	            	motoElectrica.arrencar();
	            	break;
	            default:
	        }
	    }while(!sortir);   
	}
}
