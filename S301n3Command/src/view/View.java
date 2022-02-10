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
            System.out.println("\t1.- Mostrar operacions cotxe");
            System.out.println("\t2.- Mostrar operacions bicicleta");
            System.out.println("\t3.- Mostrar operacions avi�");
            System.out.println("\t4.- Mostrar operacions vaixell");
           
            opcio = Teclado.leerByte("...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opci� v�lida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
}
