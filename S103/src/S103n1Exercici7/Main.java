package S103n1Exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<>();
		
		//Omplir HashMap
		hashMap.put("900", "Value900");
		hashMap.put("5", "Value5");
		hashMap.put("7", "Value7");
		hashMap.put("3", "Value3");
		hashMap.put("2", "Value2");
		hashMap.put("1", "Value1");
		hashMap.put("8", "Value8");

        //Imprimir HashMap
		System.out.print("HashMap: ");
        for (String clau : hashMap.keySet()) {
	        System.out.print(" (" + clau + "," + hashMap.get(clau) + ")"); 
	    }
        System.out.println();
        
        //Imprimir TreeMap
        System.out.print("TreeMap: ");
        Map<String, String> treeMap = new TreeMap<>(hashMap); //Es crea treeMap a partir de hashMap
        for (String clau : treeMap.keySet()) {
        	System.out.print(" (" + clau + "," + treeMap.get(clau) + ")"); 
        }
        System.out.println();
        
        //Imprimir LinkedHashMap
        System.out.print("LinkedHashMap: ");
        Map<String, String> linkedHashMap = new LinkedHashMap<>(hashMap); //Es crea linkedHashMap a partir de hashMap
        for (String clau : linkedHashMap.keySet()) {
        	System.out.print(" (" + clau + "," + linkedHashMap.get(clau) + ")"); 
        }
        System.out.println();
        
        //Omplir HashSet a partir de HashMap
        Set<String> hashSet = new HashSet<>();
        for (String clau : hashMap.keySet()) {
        	 hashSet.add(hashMap.get(clau));
	    }

        //Imprimir HashSet
        System.out.print("HashSet: ");
        for (String valor : hashSet) {
        	System.out.print(" "+ valor); 
        }
        System.out.println();
      
        //Imprimir LinkedHashSet
        System.out.print("LinkedHashSet: ");
        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet); //Es crea linkedHashSet a partir de hashSet
        for (String valor : linkedHashSet) {
        	System.out.print(" "+ valor); 
        }
        System.out.println();    
	}
}
