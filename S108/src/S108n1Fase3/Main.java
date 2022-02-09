package S108n1Fase3;

public class Main {

	public static void main(String[] args) {
		
		
		IRetornaReverse iRetornaReverse = (cadena) -> {
			StringBuilder strb = new StringBuilder(cadena);
			cadena = strb.reverse().toString();
			return cadena;
        };
        String cadenaGirada = iRetornaReverse.reverse("supercalifragilístico");
        System.out.println(cadenaGirada);
	}
}
