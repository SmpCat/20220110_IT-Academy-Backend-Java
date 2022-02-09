package S101n1Exercici8;

public class Main {

	public static void main(String[] args) {
		Frog frog = new Frog();
		
		frog.moure();
		frog.respirar();
		frog.menjar();
		frog.saltar();
		
		((Amphibian) frog).moure();
		((Amphibian) frog).respirar();
		((Amphibian) frog).menjar();
		//((Amphibian) frog).saltar(); //Error
	}

}
