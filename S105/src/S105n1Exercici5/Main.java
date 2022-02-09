package S105n1Exercici5;

public class Main {

	public static void main(String[] args) {
		
		String directori = "C:/Users/A121106/OneDrive - Atos/Documentos/personas.ser";
		
		Serialitzacio serialitzar = new Serialitzacio();
		serialitzar.serialitzar(directori);
		serialitzar.deserialitzarFitxer(directori);
    }
}
