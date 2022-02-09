package S301n2AbstractFactory;

public class FactoryVehicleProducer {
	
	public FactoryVehicleProducer() {

	}
	
	public static IAbstractFactoryVehicle getVehicleFactory (TipusVehicle tipusVehicle) {
		
		IAbstractFactoryVehicle factoryVehicle = null;
		
		switch(tipusVehicle) {
			case BENZINA:
				factoryVehicle = new FactoryVehicleBenzina();
				break;
			case ELECTRIC:
				factoryVehicle = new FactoryVehicleElectric();
				break;
			default:
		}
		return factoryVehicle;
	}	
}
