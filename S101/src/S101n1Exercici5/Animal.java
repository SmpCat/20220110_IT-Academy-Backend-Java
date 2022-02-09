package S101n1Exercici5;

public class Animal {

	public Animal() {
		
	}
	
	public void correr() {
		System.out.println("Sense paràmetres");
	}
	
	public void correr(int a) {
		System.out.println("Un paràmetre: " + a );
	}
	
	public void correr(int a, int b) {
		System.out.println("Dos paràmetres " + a + " " + b);
	}
}
