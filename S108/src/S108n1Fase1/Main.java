package S108n1Fase1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> nomsPropis = Arrays.asList("Ana", "Ada", "Maria", "Alba", "Lucia", "America");
		List<String> nomsPropisResultatFiltracio = MetodesLambdas.metode1(nomsPropis);
		System.out.println(nomsPropisResultatFiltracio);
		
		List<Integer> numeros = Arrays.asList(3, 44, 2, 35, 12, 90, 105, 6, 442);
		String cadenaResultat = MetodesLambdas.metode2(numeros);
		System.out.println(cadenaResultat);
	
		List<String> cadenes = Arrays.asList("hola", "molí", "ferro", "cirera", "molotov", "ciri", "caravana", "original");
		List<String> cadenesResultatFiltracio = MetodesLambdas.metode3(cadenes);
		System.out.println(cadenesResultatFiltracio);
		
		List<String> cadenesResultatFiltracio2 = MetodesLambdas.metode4(cadenes);
		System.out.println(cadenesResultatFiltracio2);
		
		List<String> mesosAny = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
				"Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		MetodesLambdas.metode5(mesosAny);
		
		MetodesLambdas.metode6(mesosAny);

	}

}
