package S301n2AbstractFactory;

public class View {
	
	public byte menuPrincipal(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 4;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Arrencar cotxe benzina");
            System.out.println("\t2.- Arrencar cotxe elèctric");
            System.out.println("\t3.- Arrencar moto benzina");
            System.out.println("\t4.- Arrencar moto elèctrica");
            
            
            opcio = Teclado.leerByte("Opció?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Error: Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
