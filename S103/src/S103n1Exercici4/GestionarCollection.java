package S103n1Exercici4;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

public class GestionarCollection {

	public GestionarCollection() {
	
	}
	
	//Obtenir els valors dels atributs d'un objecte
	private static void obtenirValorsAtributsObject(Object object) {
		
		Field [] attributes =  object.getClass().getDeclaredFields();

	    for (Field field : attributes) {
	    	String name = field.getName();
	        field.setAccessible(true); // Los atributos privados deben establecer permisos de acceso
	        try {
	        	Object value = field.get(object); 
		        if (value != null) {
		            System.out.print(" " + name + "=" + value);
		        }
	        } catch (Exception e) {
	        	System.out.println(e.getStackTrace());
	        }
	    }
	}
	
	//Mètode genèric per imprimir qualsevol tipus de Collection passada per paràmetres
	public static void imprimirObjects(Collection<?> co) {
		Iterator<?> it = co.iterator();
		while (it.hasNext()) {
			 Object obj = it.next();
			 System.out.print (" " + obj.toString());
			 obtenirValorsAtributsObject(obj);
			 System.out.println();
		}
		System.out.println();
	}
}
