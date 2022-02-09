package model;

public class ProducerAgenda {

	private ProducerAgenda() {
		
	}
	
	public static IAbstractFactoryAgenda getAgenda(EnumTipusAgenda tipus) {
		
		IAbstractFactoryAgenda instance = null;
		
		switch (tipus) {
			case ESPANYA:
				instance = new FactoryAgendaEspanyola();
				break;
			case ITALIA:
				instance = new FactoryAgendaItaliana();
				break;
			default:
		}
		
		return instance;
	}
}
