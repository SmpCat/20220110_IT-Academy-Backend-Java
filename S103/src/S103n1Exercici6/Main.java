package S103n1Exercici6;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	
	private static final int DIMENSIO =10;
	
	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		//Omplir la llista linkedList
		for (int x = 1; x <= DIMENSIO; x++) {
			linkedList.add(x);
		}
		
		//Imprimir la llista linkedList
		System.out.print("LinkedList: ");
		for (Integer x:linkedList) {
			System.out.print(" " + x);
		}
		System.out.println();
		
		//Afegir valors a linkedList inserint-los a la meitat de la llista linkedList
		int x = -1;
		ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size()/2);
		while (listIterator.hasNext() && x >= -10) {
			listIterator.add(x);
			x = x - 1;
		}
		
		//Imprimir el resultat posterior a la insercció
		listIterator = linkedList.listIterator();
		System.out.print("LinkedList: ");
		while(listIterator.hasNext()) {
			System.out.print(" " + listIterator.next().toString());
		}
		System.out.println();
	}
}
