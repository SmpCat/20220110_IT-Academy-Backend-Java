package S103n1Exercici5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	
	private static final int DIMENSIO =10;
	
	public static void main(String[] args) {
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		List<Integer> arrayList2 = new ArrayList<Integer>();

		//Omplir arrayList1 i arrayList2
		for (int x = 0; x < DIMENSIO; x++) {
			arrayList1.add(x);
			arrayList2.add(x+100);
		}
		
		//Imprimir arrayList1
		System.out.print("Lista ArrayList1: ");
		ListIterator<Integer> listIterator1 = arrayList1.listIterator();
		while(listIterator1.hasNext()) {
			System.out.print(" " + listIterator1.next().toString());
		}
		System.out.println();
		
		//Imprimir arrayList2
		System.out.print("Lista ArrayList2: ");
		ListIterator<Integer> listIterator2 = arrayList2.listIterator();
		while(listIterator2.hasNext()) {
			System.out.print(" " + listIterator2.next().toString());
		}
		System.out.println();
		
		//Cridar al mètode per afegir valors inversos passant-li les dues llistes com a paràmetre
		arrayList2 = GestionarList.afegirValors(arrayList1, arrayList2);
		
		//Imprimir el nou contingut d'arrayList2
		System.out.print("Lista ArrayList2: ");
		ListIterator<Integer> listIterator = arrayList2.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(" " + listIterator.next().toString());
		}
	}
}
