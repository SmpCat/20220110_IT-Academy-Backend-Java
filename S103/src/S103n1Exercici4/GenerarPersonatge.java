package S103n1Exercici4;

public class GenerarPersonatge {
	
	private static byte comptador = -1;
	private final static String[] PERSONATGES= {"Capitán América", "IronMan", "Thor", 
			"Viuda Negra", "Halcon", "Black Panther"};
	public static final byte TOTAL_PERSONATGES = 6;
	
	public GenerarPersonatge() {
		
	}
	
	public static Personatge seguentPersonatge() {
		
		comptador ++;
		
		if (comptador > 5) {
			comptador = 0;
		}
		
		Personatge personatge = new Personatge();
		personatge.setNom(PERSONATGES[comptador]);
		return personatge;
	}
}
