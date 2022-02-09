package S103n1Exercici2;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void imprimirMonths(Set<String> months) {
		for (String month : months) {
		    System.out.print(" " + month);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		String[] nameMonths= {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
				              "Setembre", "Octubre", "Novembre", "Desembre"};
		Set<String> months = new HashSet<String>();
		
		//Omplir la llista months
		for(byte x = 0; x < 12; x++) {
			months.add(nameMonths[x]);
		}
		
		//Imprimir la llista months
		System.out.println("Els mesos de l'any són:");
		imprimirMonths(months);
		
		//Re-omplir la llista months
		for(byte x = 0; x < 12; x++) {
			months.add(nameMonths[x]);
		}
		
		//Imprimir la llista months
		System.out.println("Els mesos amb intent de DUPLICATS són:");
		imprimirMonths(months);
	}
}
