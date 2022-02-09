package S105n1Exercici5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialitzacio {

	public Serialitzacio() {
	
		
	}
	
	public void serialitzar (String directori) {
		
		FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Persona persona;

        try {
            //Es crea el fitxer
            fileOutputStream = new FileOutputStream(directori);                                                 
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
   
            //Es creen els objectes persona i s'escriuen al fitxer
            persona = new Persona("12345678A", "Marc González", 30);
            objectOutputStream.writeObject(persona);
            persona= new Persona("98765432B", "Pere Mestres", 28);
            objectOutputStream.writeObject(persona);
            persona = new Persona("78234212Z", "Salva Martínez", 35);
            objectOutputStream.writeObject(persona);
    
        } catch (FileNotFoundException e) {
        	System.out.println(e.getMessage() + " al mètode serialització");                                                
        
        } catch (IOException e) {
        	System.out.println(e.getMessage());    
        
        } finally {
           
        	try {
        		if (fileOutputStream!=null) {
        			fileOutputStream.close();
                }
                if (objectOutputStream!=null) {
                	objectOutputStream.close();
                }
            
        	} catch (IOException e) {
        		System.out.println(e.getMessage());    
            }
        }
	}
	
	public void deserialitzarFitxer (String directori) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(directori);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Object object = objectInputStream.readObject();

			while (object != null) {

				if (object instanceof Persona) {
					Persona persona = (Persona) object;
					System.out.println(persona.toString());
				}
				object = objectInputStream.readObject();
			}
			objectInputStream.close(); 
			
		} catch (Exception e) {
			   
		}
	}
}
