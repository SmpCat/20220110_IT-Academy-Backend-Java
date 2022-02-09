package S103n1Exercici3;

public class Generadora {
	
	private static byte comptador = -1;
	private final static String[] PERSONATGES= {"Capitán América", "IronMan", "Thor", 
			"Viuda Negra", "Halcon", "Black Panther"};
	public static final byte TOTAL_PERSONATGES = 6;
	
	public Generadora() {
		
	}
	
	public static String seguentPersonatge() {
		comptador ++;
		if (comptador > 5) {
			comptador = 0;
		}
		return PERSONATGES[comptador];
	}
}
