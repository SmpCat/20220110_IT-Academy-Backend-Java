package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Persistencia implements IPersistencia {
	
	private static FileOutputStream fos;
    private static ObjectOutputStream sortida;
    private static FileInputStream fis;
	private static ObjectInputStream entrada;
	
	public void guardarFloristeria(String directori, Floristeria novaFloristeria) {

		
		List<Floristeria> floristeries = new ArrayList<Floristeria>();

		try {

			fis = new FileInputStream(directori);
			entrada = new ObjectInputStream(fis);

			Floristeria floristeriaFitxer = (Floristeria) entrada.readObject();

			while (floristeriaFitxer != null) {
				
				if(!floristeriaFitxer.getNomFloristeria().equals(novaFloristeria.getNomFloristeria())) {
					floristeries.add(floristeriaFitxer);
				}
				
				floristeriaFitxer = (Floristeria) entrada.readObject();	
			}

		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
		} catch (IOException e) {
			//System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				
				fos = new FileOutputStream(directori);
				sortida = new ObjectOutputStream(fos);
				
				for(Floristeria floristeria: floristeries) {
					sortida.writeObject(floristeria);
				}
				
				sortida.writeObject(novaFloristeria);

				if(fos!=null) {
					fos.close();
				}
				if(sortida!=null) {
					sortida.close();
				}
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
	}
	
	public  Floristeria getFloristeria(String directori, String nomFloristeria) {
		
		boolean existeixFloristeria = false;
		Floristeria floristeriaFitxer = null;
		
		try {
			fis = new FileInputStream(directori);
			entrada = new ObjectInputStream(fis);

			floristeriaFitxer = (Floristeria) entrada.readObject();

			while (floristeriaFitxer != null && !existeixFloristeria) {
				
				if(floristeriaFitxer.getNomFloristeria().equals(nomFloristeria)) {
					existeixFloristeria = true;
				} else {
					floristeriaFitxer = (Floristeria) entrada.readObject();	
				}
			}

		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			//System.out.println(e.getMessage());
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
		
		if(existeixFloristeria == false) {
			floristeriaFitxer = null;
		}
		return floristeriaFitxer;
	}
	
	public List<String> getLListarFloristeries(String directori) {
		
		boolean existeixFloristeria = false;
		Floristeria floristeriaFitxer = new Floristeria();
		List<String> nomFloristeriesFitxer = new ArrayList<String>();
		
		try {
			fis = new FileInputStream(directori);
			entrada = new ObjectInputStream(fis);

			floristeriaFitxer = (Floristeria) entrada.readObject();

			while (floristeriaFitxer != null) {
				
				nomFloristeriesFitxer.add(floristeriaFitxer.getNomFloristeria());
				floristeriaFitxer = (Floristeria) entrada.readObject();	
		
			}

		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			//System.out.println(e.getMessage());
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
		
		if(existeixFloristeria == false) {
			floristeriaFitxer = null;
		}
		return nomFloristeriesFitxer;
	}
	
	public boolean eliminarFloristeria(String directori, String nomFloristeriaAEliminar) {

		boolean floristeriaAEliminar = false;
		List<Floristeria> floristeries = new ArrayList<Floristeria>();

		try {

			fis = new FileInputStream(directori);
			entrada = new ObjectInputStream(fis);

			Floristeria floristeriaFitxer = (Floristeria) entrada.readObject();

			while (floristeriaFitxer != null) {
				
				if(!floristeriaFitxer.getNomFloristeria().equals(nomFloristeriaAEliminar)) {
					floristeries.add(floristeriaFitxer);
				} else {
					floristeriaAEliminar = true;
				}
				
				floristeriaFitxer = (Floristeria) entrada.readObject();	
			}

		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
		} catch (IOException e) {
			//System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				
				fos = new FileOutputStream(directori);
				sortida = new ObjectOutputStream(fos);
					
				for(Floristeria floristeria: floristeries) {
					sortida.writeObject(floristeria);
				}

				if(fos!=null) {
					fos.close();
				}
				if(sortida!=null) {
					sortida.close();
				}
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
		return floristeriaAEliminar;
	}
}
