package model;

public class VehicleOperationFrenar implements IVehicleOperation {
	
	Vehicle vehicle;
	
	public VehicleOperationFrenar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.frenar();
	}
}
