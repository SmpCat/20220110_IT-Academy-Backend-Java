package S103n1Exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import S103n1Exercici3.Generadora;

public class Main {
	
	public static void main(String[] args) {
		
		List<Personatge> arrayList = new ArrayList<Personatge>();
		List<Personatge> linkedList = new LinkedList<Personatge>();
		Set<Personatge> hashSet = new HashSet<Personatge>();
		Set<Personatge> linkedHashSet = new LinkedHashSet<Personatge>();
		Set<Personatge> treeSet = new TreeSet<Personatge>();
		
		//Omplir les diferents Collections amb objectes PERSONATGES
		for (byte x = 1; x <= Generadora.TOTAL_PERSONATGES * 2; x++) {
			Personatge personatge = GenerarPersonatge.seguentPersonatge();
			
			arrayList.add(personatge);
			linkedList.add(personatge);
			hashSet.add(personatge);
			linkedHashSet.add(personatge);
			treeSet.add(personatge);
		}
	
		//Imprimir les diferents Collections
		System.out.println("ArrayList:");
		GestionarCollection.imprimirObjects(arrayList);
		System.out.println("LinkedList:");
		GestionarCollection.imprimirObjects(linkedList);
		System.out.println("HashSet:");
		GestionarCollection.imprimirObjects(hashSet);
		System.out.println("LinkedHashSet:");
		GestionarCollection.imprimirObjects(linkedHashSet);
		System.out.println("TreeSet:");
		GestionarCollection.imprimirObjects(treeSet);
	}
}
