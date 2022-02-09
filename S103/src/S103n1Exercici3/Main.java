package S103n1Exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		//Omplir els diferents tipus de Collections
		for (byte x = 1; x <= Generadora.TOTAL_PERSONATGES * 2; x++) {
			String personatge = Generadora.seguentPersonatge();
			
			arrayList.add(personatge);
			linkedList.add(personatge);
			hashSet.add(personatge);
			linkedHashSet.add(personatge);
			treeSet.add(personatge);
		}
		
		//Imprimir ArrayList
		System.out.println("ArrayList:");
		for (String personatge:arrayList) {
			System.out.print(" " + personatge);
		}
		System.out.println();
		
		//Imprimir LinkedList
		System.out.println("LinkedList:");
		for (String personatge:linkedList) {
			System.out.print(" " + personatge);
		}
		System.out.println();
		
		//Imprimir HashSet
		System.out.println("HashSet:");
		for (String personatge:hashSet) {
			System.out.print(" " + personatge);
		}
		System.out.println();
		
		//Imprimir LinkedHashSet
		System.out.println("LinkedHashSet:");
		for (String personatge:linkedHashSet) {
			System.out.print(" " + personatge);
		}
		System.out.println();
		
		//Imprimir TreeSet
		System.out.println("TreeSet:");
		for (String personatge:treeSet) {
			System.out.print(" " + personatge);
		}
	}
}
