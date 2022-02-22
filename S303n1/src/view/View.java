package view;

import java.util.List;
import model.Floristeria;
import tools.Teclado;

public class View {
	
	public byte menuPrincipal(String nomFloristeria) {
        
		byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 17;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Sortir de l'aplicació");
            System.out.println("\t1.- Llistar Floristeries");
            System.out.println("\t2.- Canviar Floristeria de treball");
            System.out.println("\t3.- Eliminar Floristeria");
            System.out.println("\t4.- Afegir Arbre");
            System.out.println("\t5.- Afegir Flor");
            System.out.println("\t6.- Afegir Decoració Fusta");
            System.out.println("\t7.- Afegir Decoració Plàstic");
            System.out.println("\t8.- Stock de Productes");
            System.out.println("\t9.- Retirar Arbre");
            System.out.println("\t10.- Retirar Flor");
            System.out.println("\t11.- Retirar Decoració de Fusta");
            System.out.println("\t12.- Retirar Decoració de Plàstic");
            System.out.println("\t13.- Stock de Quantitats");
            System.out.println("\t14.- Valor Total de l'Stock");
            System.out.println("\t15.- Comprar Productes");
            System.out.println("\t16.- Mostrar Llistes de Compra");
            System.out.println("\t17.- Mostrar Valor Total de Vendes");
            
            opcio = Teclado.leerByte(nomFloristeria + "...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
	
	public String getNom(String item) {
		
		String nom;
        boolean error;

        do{
        	error = false;
            nom = Teclado.leerString("Si us plau, escrigui el nom de " + item + "...?: ");
            String nomNormalitzat = nom.replaceAll("\\s+","");
			
			if (nomNormalitzat.isEmpty()) {
				error = true;
				escriureMissagte("Error: El nom de " + item + " és erroni.");
			}
			
		} while (error);
        return nom;
	}
	
	public double getPreu(String item) {
		return (Teclado.leerDouble("Si us plau, escrigui el preu de " + item + "...?: "));
	}
	
	public double getAltura() {
		return (Teclado.leerDouble("Si us plau, escrigui l'alçada de l'arbre:...?: "));
	}
	
	public String getColor() {
		
		String colorFlor;
        boolean error;

        do{
        	error = false;
            colorFlor = Teclado.leerString("Si us plau, escrigui el color de la flor:...?: ");
            String colorFlorNormalitzat = colorFlor.replaceAll("\\s+","");
			
			if (colorFlorNormalitzat.isEmpty()) {
				error = true;
				escriureMissagte("Error: El color de la flor és erroni.");
			}
			
		} while (error);
        return colorFlor;
	}
	
	public void getStockDeProductes(Floristeria floristeria) {
		
		escriureMissagte("Arbres: " + floristeria.getArbres().toString());
		escriureMissagte("Flors: " + floristeria.getFlors().toString());
		escriureMissagte("Decoracions de Fusta: " + floristeria.getDecoracionsFusta().toString());
		escriureMissagte("Decoracions de Plàstic: " + floristeria.getDecoracionsPlastic().toString());
		
	}
	
	public void getStockDeQuantitats(Floristeria floristeria) {
	
		escriureMissagte("Número Total d'Arbres: " + floristeria.getStockArbres());
		escriureMissagte("Número Total de Flors: " + floristeria.getStockFlors());
		escriureMissagte("Número Total de Decoracions de Fusta: " + floristeria.getStockDecoracionsFusta());
		escriureMissagte("Número Total de Decoracions de Plàstic: " + floristeria.getStockDecoracionsPlastic());
	}
	
	public void llistarNoms(List<String> noms) {
		
		escriureMissagte("Les Floristeries actives són:");
		if (noms.size() > 0) {
			for(String nom:noms) {
				escriureMissagte("\t" + nom);
			}
		} else {
			escriureMissagte("\t No hi ha cap Floristeria activa");
		}
	}
	
	public void getValorTotalFloristeria(String valorTotalStock, String nomFloristeria) {
		escriureMissagte("'" + nomFloristeria + "': "+ "El valor total de l'stock actual és de: " + valorTotalStock);
	}
	
	public void getValorTotalVendes(String valorTotalVendes, String nomFloristeria) {
		escriureMissagte("'" + nomFloristeria + "': "+ "El valor total de les vendes és de: " + valorTotalVendes);
	}
	
	public void escriureMissagte(String missatge) {
		System.out.println(missatge);
	}
	
	public byte menuCompra(String nomFloristeria) {
        
		byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 5;

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("\t0.- Cancel·lar Compra");
            System.out.println("\t1.- Generar Ticket");
            System.out.println("\t2.- Comprar Arbre");
            System.out.println("\t3.- Comprar Flor");
            System.out.println("\t4.- Comprar Decoració de Fusta");
            System.out.println("\t5.- Comprar Decoració de Plàstic");
            
            opcio = Teclado.leerByte(nomFloristeria + "...?: ");
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida ");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
