package S101n1Exercici4;

public class Vehicle {
	private static final int VAR_CONSTANT=10;
	private final int var1=20;
	private static int var2;
	
	public Vehicle() {
		System.out.println("static final 'VAR_CONSTANT' = " + Vehicle.VAR_CONSTANT);
		System.out.println("final 'var1' = " + var1);
		var2 = Vehicle.VAR_CONSTANT;
		var2+=var1;
		System.out.println("static 'var2' = " + var2);
	}
}
