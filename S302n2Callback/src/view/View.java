package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Pagament amb Targeta de crèdit");
            System.out.println("\t2.- Pagament amb PayPal");
            System.out.println("\t3.- Pagament amb Compte Corrent");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public byte menuEvents() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do{
            System.out.println("ALTA D'EVENTS A NOTIFICAR:");
            System.out.println("\t0.- Sortir");
            System.out.println("\t1.- Alta event 'PUJAR BORSA'");
            System.out.println("\t2.- Alta event 'BAIXADA DE BORSA'");
            System.out.println("\t3.- Alta de tots els events");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String afegirAgencia() {
		return (Teclado.leerString("Si us plau, escriu el nom de l'Agència: "));	
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
