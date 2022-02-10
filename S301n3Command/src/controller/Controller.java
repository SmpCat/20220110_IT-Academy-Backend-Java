package controller;

import model.Avio;
import model.Bicicleta;
import model.Cotxe;
import model.IVehicleOperation;
import model.Vaixell;
import model.Vehicle;
import model.VehicleOperationAccelerar;
import model.VehicleOperationArrencar;
import model.VehicleOperationExecutor;
import model.VehicleOperationFrenar;
import view.View;

public class Controller {
	
	private Vehicle cotxe, bicicleta, avio, vaixell;
	private IVehicleOperation vehicleOperation;
	private VehicleOperationExecutor vehicleOperationExecutor;
	private View view = new View();
	
	public Controller() {
		cotxe = new Cotxe("cotxe");
		bicicleta = new Bicicleta("bicicleta");
		avio = new Avio("avió");
		vaixell = new Vaixell("vaixell");
		vehicleOperationExecutor = new VehicleOperationExecutor();	
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
                	vehicleOperation = new VehicleOperationArrencar(cotxe);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationAccelerar(cotxe);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationFrenar(cotxe);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperationExecutor.executeOperation();
                	
                	break;
                case 2:
                	vehicleOperation = new VehicleOperationArrencar(bicicleta);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationAccelerar(bicicleta);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationFrenar(bicicleta);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperationExecutor.executeOperation();
                	
                	break;
                case 3: 
                	vehicleOperation = new VehicleOperationArrencar(avio);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationAccelerar(avio);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationFrenar(avio);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperationExecutor.executeOperation();
                	
                	break;
                case 4:
                	vehicleOperation = new VehicleOperationArrencar(vaixell);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationAccelerar(vaixell);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperation = new VehicleOperationFrenar(vaixell);
                	vehicleOperationExecutor.addOperation(vehicleOperation);
                	
                	vehicleOperationExecutor.executeOperation();
                	
                	break;
                default:
            }
        }while(!sortir);   
	}
}
