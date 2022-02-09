package model;

public class AdreçaItaliana implements IAbstractAdreça {

	public AdreçaItaliana() {
		
	}

	@Override
	public String formatejarAdreça(String adreça) {
		adreça = adreça + ", Pais: Italia";
		return adreça;
	}

}
