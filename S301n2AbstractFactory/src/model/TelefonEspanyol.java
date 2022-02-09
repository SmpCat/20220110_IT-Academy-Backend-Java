package model;

public class TelefonEspanyol implements IAbstractTelefon {

	public TelefonEspanyol() {
		
	}

	@Override
	public String formatejarTelefon(String telefon) {
		telefon = "+34 " + telefon;
		return telefon;
	}

}
