package model;

public class FactoryAgendaEspanyola implements IAbstractFactoryAgenda {

	public FactoryAgendaEspanyola() {
		
	}

	@Override
	public IAbstractTelefon crearTelefon() {
		return new TelefonEspanyol();
	}

	@Override
	public IAbstractAdre�a crearAdre�a() {
		return new Adre�aEspanyola();
	}

}
