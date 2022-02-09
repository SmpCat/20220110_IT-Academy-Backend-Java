package S104n1Exercici2;

public class CalculoNif {

	private static final String lLETRES_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";

	public CalculoNif() {

	}	

	public static char calcularLletra(String aux) {
		return lLETRES_NIF.charAt(Integer.parseInt(aux) % 23);
	}
	
	private static boolean isNumeric (String str) {
		return str.matches("[+-]?\\d*(\\.\\d+)?");
	}
	
	public static boolean calculaNif(String nif) {
		
		boolean nifCorrecte = true;
		String num = null;
		char lletra = 0;
		
		if (nif.length() < 2 || nif.length() > 9 ) {
			nifCorrecte = false;
		} else {
			num = nif.substring(0, nif.length() - 1);
			lletra = nif.substring(nif.length() - 1, nif.length()).toUpperCase().charAt(0);
		}
		
		if (nifCorrecte) {
			if (!isNumeric(num) || calcularLletra(num) != lletra) {
				nifCorrecte = false;
			}
		}
		
		return nifCorrecte;
	}
}

