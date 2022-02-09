package S106n1Exercici1;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("72032363T", "Pere Mas", 35);
		Persona persona2 = new Persona("54324533J", "Marc Vila", 45);
		Persona persona3 = new Persona("35433225V", "Josep Garcia", 56);
		NoGenericMethods<Persona> persones = new NoGenericMethods<Persona>();
		persones.setObj1(persona1);
		persones.setObj2(persona2);
		persones.setObj3(persona3);
		System.out.println(persones.getObj1().toString());
		System.out.println(persones.getObj2().toString());
		System.out.println(persones.getObj3().toString());
		
		NoGenericMethods<Integer> numeros = new NoGenericMethods<Integer>(1, 2, 3);
		System.out.println(numeros.getObj1().toString());
		System.out.println(numeros.getObj2().toString());
		System.out.println(numeros.getObj3().toString());
		
		NoGenericMethods<String> paraules = new NoGenericMethods<String>("paraula1", "paraula3", "paraula3");
		System.out.println(paraules.getObj1().toString());
		System.out.println(paraules.getObj2().toString());
		System.out.println(paraules.getObj3().toString());
	}
}
