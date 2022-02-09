package S301n1Singleton;

public class View {
	
	public byte menuPrincipal(){
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Afegir comanda");
            System.out.println("\t2.- Eliminar comanda");
            System.out.println("\t3.- Llistar comandes");
            
            opcio = Teclado.leerByte("Opció?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Error: Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String llegirComanda() {
		String comanda, comandaNormalitzada;
		
		do{
			comanda = Teclado.leerString("Si us plau, entri una comanda?: ");
			comandaNormalitzada = comanda.replaceAll("\\s","");
			
            if(comandaNormalitzada.isEmpty()) {
                System.out.println("Error: La comanda no pot estar buida ");
            }
        } while(comandaNormalitzada.isEmpty());
		
		return comanda;
	}
	
	public byte eliminarComanda() {
		
		return (Teclado.leerByte("Si us plau, entri la posció de la comanda a eliminar?: "));
	}
}
