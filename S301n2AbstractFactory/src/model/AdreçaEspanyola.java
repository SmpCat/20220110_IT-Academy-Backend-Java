package model;

public class Adre�aEspanyola implements IAbstractAdre�a {

	public Adre�aEspanyola() {
		
	}

	@Override
	public String formatejarAdre�a(String adre�a) {
		adre�a = adre�a + ", Pais: Espanya";
		return adre�a;
	}

}
