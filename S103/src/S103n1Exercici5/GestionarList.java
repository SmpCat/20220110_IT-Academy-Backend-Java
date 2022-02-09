package S103n1Exercici5;

import java.util.List;
import java.util.ListIterator;

public class GestionarList {

	public GestionarList() {

	}
	
	public static List<Integer> afegirValors(List<Integer> arrayList1, List<Integer> arrayList2) {
		
		ListIterator<Integer> listIterator1 = arrayList1.listIterator(arrayList1.size());
		
		while(listIterator1.hasPrevious()) {
			arrayList2.add(listIterator1.previous());
		}
		
		return arrayList2;	 
	}

}
