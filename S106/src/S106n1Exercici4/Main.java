package S106n1Exercici4;

import java.util.ArrayList;
import java.util.List;

import S106n1Exercici1.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("72032363T", "Josep Garcia", 35);
		Persona persona2 = new Persona("67932956O", "Marta López", 56);
		Persona persona3 = new Persona("15096543E", "Marc González", 43);
		List<Persona> llistaPersona = new ArrayList<Persona>();
		llistaPersona.add(persona1);
		llistaPersona.add(persona2);
		llistaPersona.add(persona3);
		GenericMethods.f(llistaPersona);
		System.out.println();
		
		List<Integer> llistaInteger = new ArrayList<Integer>();
		llistaInteger.add(1);
		llistaInteger.add(2);
		llistaInteger.add(3);
		GenericMethods.f(llistaInteger);
		System.out.println();
	}
}
