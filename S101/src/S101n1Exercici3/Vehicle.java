package S101n1Exercici3;

public class Vehicle {

	static {
	    System.out.println("Es carrega la classe 'Vehicle'");	
	}
	
	public Vehicle() {
		System.out.println("Es crea un objecte 'vehicle' instanciant a la classe 'Vehicle'");
	}
	
	public void iniciar() {
		System.out.println("S'executa el mètode 'iniciar' de l'objecte 'vehicle'");
	}
	
	public void accelerar() {
		System.out.println("S'executa el mètode no static 'accelerar' de l'objecte 'vehicle'");
	}
	
	public static void parar() {
		System.out.println("S'executa el mètode static 'parar' de la classe 'Vehicle'");
	}	
	
}
