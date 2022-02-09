package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 4;

        do{
            System.out.println("MEN� PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicaci�");
            System.out.println("\t1.- Afegir Adre�a Espanyola");
            System.out.println("\t2.- Afegir Adre�a Italiana");
            System.out.println("\t3.- Afegir Tel�fon Espanyol");
            System.out.println("\t4.- Afegir Tel�fon Itali�");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opci� v�lida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String llegirAdre�a() {
		return (Teclado.leerString("Si us plau, escrigui l'adre�a: "));	
	}
	
	public String llegirTelefon() {
		return (Teclado.leerString("Si us plau, escrigui el tel�fon: "));	
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
