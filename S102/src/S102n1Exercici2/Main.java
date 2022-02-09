package S102n1Exercici2;

public class Main {

	public static void main(String[] args) {
		
		ConstructorExcepcio constructorExcepcio = new ConstructorExcepcio();
		constructorExcepcio = null;
		try {
			constructorExcepcio.generarExcepcio("Excepció Generada");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("clàusula 'finally'");
		}			
	}
}
