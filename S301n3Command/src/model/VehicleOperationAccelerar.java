package model;

public class VehicleOperationAccelerar implements IVehicleOperation {
	
	Vehicle vehicle;
	
	public VehicleOperationAccelerar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.accelerar();	
	}
}
