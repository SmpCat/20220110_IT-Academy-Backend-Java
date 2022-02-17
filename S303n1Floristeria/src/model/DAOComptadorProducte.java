package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAOComptadorProducte {

	FileInputStream fis = null;
	ObjectInputStream entrada = null;
	FileOutputStream fos = null;
	ObjectOutputStream sortida = null;

	public void crearFitxerInicialitzat() {

		try {
			fos = new FileOutputStream("C:/Users/A121106/OneDrive - Atos/Escritorio/Salva/Formación/Ajuntament de Barcelona/Formació IT Academy/20220110 Backend Java/PersistenciaS303/Comptador.ser");                                                 
			sortida = new ObjectOutputStream(fos);

			ComptadorProducte.setIdFloristeria(0);
			ComptadorProducte.setIdArbre(0);
			sortida.writeObject(ComptadorProducte.class);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (sortida != null) {
					sortida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public int obtenirComptadorProducte(EComptador idComptador) {

		try {

			fis = new FileInputStream("C:/Users/A121106/OneDrive - Atos/Escritorio/Salva/Formación/Ajuntament de Barcelona/Formació IT Academy/20220110 Backend Java/PersistenciaS303/Comptador.ser");
			entrada = new ObjectInputStream(fis);

			ComptadorProducte comptadorProducte = (ComptadorProducte) entrada.readObject();
			System.out.println(comptadorProducte.getIdFloristeria());
			System.out.println(comptadorProducte.getIdArbre());
			System.out.println(comptadorProducte.getIdDecoracioFusta());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			crearFitxerInicialitzat();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return 0;
	}

	public int incrementarComptadorProducte(EComptador idComptador) {
		// TODO Auto-generated method stub
		return 0;
	}
}
