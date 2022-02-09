package S106n1Exercici2;

import S106n1Exercici1.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("72032363T", "Josep Garcia", 35);
		
		GenericMethods.f(persona, "hola", 10);
		System.out.println();
		GenericMethods.f("adeu", 20, persona);
		System.out.println();
	}
}
