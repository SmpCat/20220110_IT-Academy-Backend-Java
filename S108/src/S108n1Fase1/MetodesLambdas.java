package S108n1Fase1;

import java.util.List;
import java.util.stream.Collectors;

public class MetodesLambdas {
	
	public static List<String> metode1(List<String> nomsPropis) {
		
		List<String> resultatFiltracio = nomsPropis.stream()
				.filter(nom -> nom.startsWith("A") && nom.length() == 3)
				.collect(Collectors.toList());

		return resultatFiltracio;
	}
	
	public static String metode2(List<Integer> numeros) {
		return numeros.stream()
				.map(numero -> (numero % 2 == 0) ? "e" + numero : "o" + numero)
				.collect(Collectors.joining(","));
	}
   
	public static List<String> metode3(List<String> llistaCadenes) {

		List<String> resultatFiltracio = llistaCadenes.stream()
				.filter(cadena-> cadena.contains("o") || cadena.contains("O"))
				.collect(Collectors.toList());

		return resultatFiltracio;
	}
	
	public static List<String> metode4(List<String> llistaCadenes) {

		List<String> resultatFiltracio = llistaCadenes.stream()
				.filter(cadena-> cadena.contains("o") || cadena.contains("O"))
				.filter(cadena -> cadena.length() > 5)
				.collect(Collectors.toList());

		return resultatFiltracio;
	}
	
	public static void metode5(List<String> mesos) {
		mesos.forEach( (mes) -> System.out.println(mes) );
	}
	
	public static void metode6(List<String> mesos) {
		mesos.forEach(System.out::println );
	}
}
