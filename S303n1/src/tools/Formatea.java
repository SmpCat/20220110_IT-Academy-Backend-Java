package tools;

import java.text.DecimalFormat;

public class Formatea {

	public Formatea() {
		
	}
	
	public static String euro(double valor) {
		
		DecimalFormat formatea = new DecimalFormat("###,###.##");
		return formatea.format(valor);
	}
}
