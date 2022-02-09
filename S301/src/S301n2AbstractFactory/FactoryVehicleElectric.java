package S301n2AbstractFactory;

public class FactoryVehicleElectric implements IAbstractFactoryVehicle {
	
	public FactoryVehicleElectric() {
		
	}

	@Override
	public IAbstractCotxe crearCotxe() {
		return new CotxeElectric();
	}

	@Override
	public IAbstractMoto crearMoto() {
		return new MotoElectrica();
	}

}
