package S301n2AbstractFactory;

public class FactoryVehicleBenzina implements IAbstractFactoryVehicle {
	
	public FactoryVehicleBenzina() {
		
	}
	
	@Override
	public IAbstractCotxe crearCotxe() {
		return new CotxeBenzina();
	}

	@Override
	public IAbstractMoto crearMoto() {
		return new MotoBenzina();
	}

}
