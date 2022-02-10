package model;

public class VehicleOperationArrencar implements IVehicleOperation {
	
	Vehicle vehicle;
	
	public VehicleOperationArrencar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.arrencar();
	}
}
