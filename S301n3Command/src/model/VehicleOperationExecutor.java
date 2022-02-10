package model;

import java.util.ArrayList;
import java.util.List;

public class VehicleOperationExecutor{

	private List<IVehicleOperation> vehicleOperations;
	
	public VehicleOperationExecutor() {
		vehicleOperations = new ArrayList<IVehicleOperation>();
	}
	
	public void addOperation(IVehicleOperation vehicleOperation) {
		vehicleOperations.add(vehicleOperation);
	}
	
	public void executeOperation() {
		
		for(IVehicleOperation vehicleOperation: this.vehicleOperations) {
			vehicleOperation.execute();
		}
		
		this.vehicleOperations.clear();
	}
}
