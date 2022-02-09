package S106n1Exercici4;

import java.util.List;

public class GenericMethods {
	
	public GenericMethods() {
		
	}

	public static <T> void f (List<T> llista) {
		System.out.println(llista.toString());
	}
}