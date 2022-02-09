package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 4;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Afegir Adreça Espanyola");
            System.out.println("\t2.- Afegir Adreça Italiana");
            System.out.println("\t3.- Afegir Telèfon Espanyol");
            System.out.println("\t4.- Afegir Telèfon Italià");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String llegirAdreça() {
		return (Teclado.leerString("Si us plau, escrigui l'adreça: "));	
	}
	
	public String llegirTelefon() {
		return (Teclado.leerString("Si us plau, escrigui el telèfon: "));	
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
