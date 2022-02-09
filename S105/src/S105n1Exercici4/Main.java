package S105n1Exercici4;

public class Main {

	public static void main(String[] args) {
		
		String nomFitxerLectura = "C:/Users/A121106/OneDrive - Atos/Documentos/directoris.txt";
		
		GestinarDirectori gestionarDirectori = new GestinarDirectori();
		gestionarDirectori.llegirFitxer(nomFitxerLectura);	
	}

}
