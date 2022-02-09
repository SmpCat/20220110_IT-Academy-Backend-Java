package view;

import tools.Teclado;

public class View {
	
	public byte menuPrincipal() {
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do{
            System.out.println("MEN� PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicaci�");
            System.out.println("\t1.- Afegir comando");
            System.out.println("\t2.- Eliminar comando");
            System.out.println("\t3.- Llistar comandos");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opci� v�lida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String afegirComando() {
		return (Teclado.leerString("Si us plau, escriu un comando: "));	
	}
	
	public int eliminarComando() {
		return (Teclado.leerInt("Si us plau, escriu la posici� del comando que vols eliminar: "));	
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
