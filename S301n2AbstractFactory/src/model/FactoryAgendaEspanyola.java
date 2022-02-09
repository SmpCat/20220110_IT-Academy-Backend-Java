package model;

public class FactoryAgendaEspanyola implements IAbstractFactoryAgenda {

	public FactoryAgendaEspanyola() {
		
	}

	@Override
	public IAbstractTelefon crearTelefon() {
		return new TelefonEspanyol();
	}

	@Override
	public IAbstractAdreça crearAdreça() {
		return new AdreçaEspanyola();
	}

}
