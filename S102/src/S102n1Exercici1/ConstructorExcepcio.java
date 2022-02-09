package S102n1Exercici1;

public class ConstructorExcepcio {
	
	public ConstructorExcepcio()  {
		
	}
	
	public void generarExcepcio(String missatge) throws Exception {
		throw new Exception(missatge);
	}
}
