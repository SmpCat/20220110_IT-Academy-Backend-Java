package S105n1Exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GestinarDirectori {
	
	public GestinarDirectori() {
		
	}
	
	private String obtenirDataModificacioFitxer (File file) {
		
		long ms = file.lastModified();
    	Date d = new Date(ms);
    	Calendar c = new GregorianCalendar(); 
    	c.setTime(d);
    	String dia = Integer.toString(c.get(Calendar.DATE));
    	String mes = Integer.toString(c.get(Calendar.MONTH));
    	String any = Integer.toString(c.get(Calendar.YEAR));
    	
    	return dia + "/" + mes + "/" + any;
	}
	
	private void imprimirArbreDirectoris (File directori, String separador) {
		
		File[] fitxers = directori.listFiles();
		 
	    if(fitxers != null){
	    	Arrays.sort(fitxers);
	    	
	        for (int i = 0; i < fitxers.length; i++) {
	            
	        	String data = obtenirDataModificacioFitxer(fitxers[i]);
	        	
	            if (fitxers[i].isDirectory()) {
	            	System.out.println(separador + "> (D) " + fitxers[i].getName() + " (Data modificació: " + data + ")");
	                String nuevo_separador = separador + "--";
	                imprimirArbreDirectoris(fitxers[i], nuevo_separador);
	            } else {
	            	System.out.println(separador + "> (F) " + fitxers[i].getName() + " (" + data + ")");
	            }
	        }
	    }
	}

	public void llistarArbreDirectoris (String nomDirectori) {
		
		File directori = new File(nomDirectori);
		
		if (directori.exists()) {
			imprimirArbreDirectoris (directori, "-");
		} else {
			System.out.println ("El directori no existeix");
		}
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

