package S105n1Exercici3;

public class Main {

	public static void main(String[] args) {
		
		String nomDirectori = "C:/Program Files/";
		String nomFitxerEscriptura= "C:/Users/A121106/OneDrive - Atos/Documentos/directoris.txt";
		
		GestinarDirectori gestionarDirectori = new GestinarDirectori();
		gestionarDirectori.llistarArbreDirectoris(nomDirectori, nomFitxerEscriptura);
		
	}

}
