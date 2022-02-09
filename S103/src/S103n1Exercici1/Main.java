package S103n1Exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void imprimirMonths(List<Month> months) {
		for (Month month : months) {
		    System.out.print(" " + month.getName());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		String[] nameMonths= {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
				              "Setembre", "Octubre", "Novembre", "Desembre"};
		List<Month> months = new ArrayList<Month>();
		
		
		for(byte x = 0; x < 12; x++) {
			if (x != 7) {
				Month month = new Month();
				month.setName(nameMonths[x]);
				months.add(month);
			}
		}
		
		System.out.println("Els mesos SENSE incloure Agost són:");
		imprimirMonths(months);
		
		Month month = new Month();
		month.setName(nameMonths[7]);
		months.add(7,month);
		
		System.out.println("Els mesos INCLOENT Agost són:");
		imprimirMonths(months);
	
	}
}
