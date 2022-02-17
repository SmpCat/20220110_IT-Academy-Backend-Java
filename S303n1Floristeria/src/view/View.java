package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 13;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Crear Floristeria");
            System.out.println("\t2.- Afegir Arbre");
            System.out.println("\t3.- Afegir Flor");
            System.out.println("\t4.- Afegir Decoració");
            System.out.println("\t5.- Stock de Productes i Quantitats");
            System.out.println("\t6.- Retirar Arbre");
            System.out.println("\t7.- Retirar Flor");
            System.out.println("\t8.- Retirar Decoració");
            System.out.println("\t9.- Stock de Quantitats");
            System.out.println("\t10.- Valor Total Floristeria");
            System.out.println("\t11.- Crear Ticket de Compra");
            System.out.println("\t12.- Mostrar Llistes de Compra");
            System.out.println("\t13.- Mostrar Valor Total de Ventes");
            
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String getNomFloristeria() {
		
		String nomFloristeria;
        boolean error;

        do{
        	error = false;
            nomFloristeria = Teclado.leerString("Si us plau, escrigui el nom de la Floristeria: ");
            String nomFloristeriaNormalitzat = nomFloristeria.replaceAll("\\s+","");
			
			if (nomFloristeriaNormalitzat.isEmpty()) {
				error = true;
				escriureMissagte("Error: El nom de la floristeria és erroni.");
			}
			
		} while (error);
        return nomFloristeria;
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
