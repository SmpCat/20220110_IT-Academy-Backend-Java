package model;

public class TelefonItalia implements IAbstractTelefon {

	public TelefonItalia() {
	
	}

	@Override
	public String formatejarTelefon(String telefon) {
		telefon = "+39 " + telefon;
		return telefon;
	}

}
