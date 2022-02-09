package S105n1Exercici1;

import java.io.File;
import java.util.Arrays;

public class GestinarDirectori {
	
	public GestinarDirectori() {
		
	}

	public void llistarDirectori(String nomDirectori) {
		
		File directori = new File(nomDirectori);
		
		if (directori.exists()) {
			
			File[] fitxers = directori.listFiles();
			
			if(fitxers != null){
				Arrays.sort(fitxers);
			
				for (int i = 0; i < fitxers.length; i++) {
		            System.out.println("> " + fitxers[i].getName());
				}
			}
			
		} else {
			System.out.println ("El directori no existeix");
		}
	}
}

