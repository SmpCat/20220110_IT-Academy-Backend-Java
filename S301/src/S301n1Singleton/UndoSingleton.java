package S301n1Singleton;

import java.util.ArrayList;
import java.util.List;

public class UndoSingleton {
	
	private List<String> comandes = new ArrayList<String>();
	
	private static UndoSingleton instance;
	
	private UndoSingleton() {
		
	}
	
	protected int getNumeroDeComandesInsertades() {
		return comandes.size();
	}
	
	public static UndoSingleton getInstance() {
		
		if (instance == null) {
			instance = new UndoSingleton();
		}
		return instance;
	}
	
	public void afegirComanda(String comanda) {
		comandes.add(comanda);
	}
	
	public void eliminarComanda(int posicio) {
		comandes.remove(posicio);
	}
	
	public void llistarComandes() {
		for(byte x= 0; x < comandes.size(); x++) {
			System.out.println((x + 1) + ". " + comandes.get(x));
		}
	}
}

	
