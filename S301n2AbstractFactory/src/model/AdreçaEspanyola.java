package model;

public class AdreçaEspanyola implements IAbstractAdreça {

	public AdreçaEspanyola() {
		
	}

	@Override
	public String formatejarAdreça(String adreça) {
		adreça = adreça + ", Pais: Espanya";
		return adreça;
	}

}
