package S101n1Exercici7;

public class Main {

	public static void main(String[] args) {
		Frog frog = new Frog();
		
		((Amphibian) frog).moure();
		((Amphibian) frog).respirar();
		((Amphibian) frog).menjar();
		//((Amphibian) frog).saltar(); //Error
	}

}
