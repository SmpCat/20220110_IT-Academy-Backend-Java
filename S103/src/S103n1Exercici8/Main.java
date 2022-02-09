package S103n1Exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	private static Map<String, String> linkedHashMap = new LinkedHashMap<>();
	
	public static void omplirlinkedHashMap() {
		
		linkedHashMap.clear();
		linkedHashMap.put("8", "Value8");
		linkedHashMap.put("3", "Value3");
		linkedHashMap.put("2", "Value2");
		linkedHashMap.put("1", "Value1");
		linkedHashMap.put("4", "Value4");
		linkedHashMap.put("9", "Value9");
		linkedHashMap.put("3", "Value33");
	}
	
	public static void main(String[] args) {
		
		//Omplir LinkedHashMap
		omplirlinkedHashMap();
		
        //Imprimir LinkedHashMap desordenat
		System.out.print("LinkedHashMap desordenat: ");
        for (String clau : linkedHashMap.keySet()) {
	        System.out.print(" (" + clau + "," + linkedHashMap.get(clau) + ")"); 
	    }
        System.out.println();
        
        //Imprimir HashMap ordenat
        System.out.print("HashMap ordenat: ");
        Map<String, String> hashMap = new HashMap<>(linkedHashMap); //Es crea hashMap a partir de linkedHashMap
        for (String clau : hashMap.keySet()) {
        	System.out.print(" (" + clau + "," + hashMap.get(clau) + ")"); 
        }
        System.out.println();
        
        //Imprimir LinkedHashMap
      	System.out.print("LinkedHashMap ordenat: ");
      	linkedHashMap = new LinkedHashMap<>(hashMap); //Es crea linkedHashMap a partir de HashMap
      	for (String clau : linkedHashMap.keySet()) {
      		System.out.print(" (" + clau + "," + linkedHashMap.get(clau) + ")"); 
      	}
      	System.out.println();
      	
      	//Omplir LinkedHashMap
      	omplirlinkedHashMap();
      	System.out.println();
      	
      	//Imprimir LinkedHashMap desordenat
      	System.out.print("LinkedHashMap desordenat: ");
      	for (String clau : linkedHashMap.keySet()) {
      		System.out.print(" (" + clau + "," + linkedHashMap.get(clau) + ")"); 
      	}
      	System.out.println();
      	
      	//Omplir ArrayList a partir de linkedHashMap
      	List<ClauValor> arrayList = new ArrayList<ClauValor>();
        for (String clau : linkedHashMap.keySet()) {
        	ClauValor clauValor = new ClauValor(clau, linkedHashMap.get(clau));
        	arrayList.add(clauValor);
        }
        
        //Ordenar ArrayList
        Collections.sort(arrayList);
      	
        //Imprimir ArrayList ordenat
        System.out.print("ArrayList ordenat: ");
        for (ClauValor clauValor:arrayList) {
        	System.out.print(" (" + clauValor.getClau() + "," + clauValor.getValor() + ")"); 
      	}
        System.out.println();
      	
        //Carregar LinkedHashMap a partir de ArrayList
        linkedHashMap.clear();
      	for (ClauValor clauValor:arrayList) {
      		linkedHashMap.put(clauValor.getClau(), clauValor.getValor());
      	}
      	
      	//Imprimir LinkedHashMap ordenat
      	System.out.print("LinkedHashMap ordenat: ");
        for (String clau : linkedHashMap.keySet()) {
        	System.out.print(" (" + clau + "," + linkedHashMap.get(clau) + ")"); 
      	}
        System.out.println();
	}
}
