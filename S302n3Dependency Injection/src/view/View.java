package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 7;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Introduïr article");
            System.out.println("\t2.- Veure articles amb preu en Euros");
            System.out.println("\t3.- Veure articles amb preu en Dolars");
            System.out.println("\t4.- Veure articles amb preu en Libras Esterlinas");
            System.out.println("\t5.- Veure articles amb preu en Rublo Ruso");
            System.out.println("\t6.- Veure articles amb preu en Yenes Japonesos");
            System.out.println("\t7.- Veure articles amb preu en Yuans Xinesos");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String obtenirNomArticle() {
        String nomArticle;
        boolean error;

        do{
        	error = false;
            nomArticle = Teclado.leerString("Si us plau, escriu el nom de l'article: ");
            String nomArticleNormalitzat = nomArticle.replaceAll("\\s+","");
			
			if (nomArticleNormalitzat.isEmpty()) {
				error = true;
				escriureMissagte("Error: El nom de l'article és erroni.");
			}
			
		} while (error);
        return nomArticle;
    }
	
	public Double obtenirPreuArticle() {
        
		return (Teclado.leerDouble("Si us plau, escriu el preu de l'article: "));       
    }
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
