package S106n1Exercici3;

import S106n1Exercici1.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("72032363T", "Josep Garcia", 35);
		GenericMethods.f(persona, "hola", 20);
		System.out.println();
		GenericMethods.f("adeu", persona);
		System.out.println();	
	}
}
