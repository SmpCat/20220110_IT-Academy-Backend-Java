package S102n1Exercici5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        boolean correcto = false;
        int numero = 0;
        final Scanner lectura = new Scanner(System.in);

        do {
            System.out.print("Escriu un número: ");
            try {
                numero = lectura.nextInt();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de format.");
            }
            lectura.nextLine();
        } while (!correcto);
        
        System.out.println("El número " + numero + " és correcte!");
        lectura.close();
    }
}
