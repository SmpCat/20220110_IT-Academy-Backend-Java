package model;

public class Adre�aItaliana implements IAbstractAdre�a {

	public Adre�aItaliana() {
		
	}

	@Override
	public String formatejarAdre�a(String adre�a) {
		adre�a = adre�a + ", Pais: Italia";
		return adre�a;
	}

}
