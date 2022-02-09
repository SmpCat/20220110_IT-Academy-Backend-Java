package S102n1Exercici4;

public class Main {

	public static void main(String[] args) {

		try {
			throw new GestioException("Excepció generada explícitament"); 
		} catch(GestioException gestioException) {
		    System.out.println("Missatge Excepció: " + gestioException.getMessage());
		    System.out.println("Classe de l'excepció " + gestioException.getClass());
		}
	}
}
