package model;

public class FactoryAgendaItaliana implements IAbstractFactoryAgenda {

	public FactoryAgendaItaliana() {
		
	}

	@Override
	public IAbstractTelefon crearTelefon() {
		return new TelefonItalia();
	}

	@Override
	public IAbstractAdreça crearAdreça() {
		return new AdreçaItaliana();
	}

}
