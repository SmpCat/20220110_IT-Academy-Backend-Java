package S106n1Exercici3;

public class GenericMethods {
	
	public GenericMethods() {
		
	}

	public static <T, U, K> void f (T obj1, U obj2, K... obj3) {
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}