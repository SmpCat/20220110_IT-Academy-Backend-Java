package model;

import java.util.ArrayList;
import java.util.List;

public class SingletonUndo {
	
	private static SingletonUndo instance;
	private List<String> comandos = new ArrayList<String>();
	
	public SingletonUndo() {
		
	}
	
	public static SingletonUndo  getInstance() {
		if (instance == null) {
			instance = new SingletonUndo();
		} 
		return instance;
	}
	
	public void afegirComando(String comando) {
		this.comandos.add(comando);
	}
	
	public void eliminarComando(int posicio) {
		this.comandos.remove(posicio);
	}
	
	public void llistarComandos() {
		for (int x = 0; x < this.comandos.size(); x++) {
			System.out.println((x + 1) + ". " + this.comandos.get(x));
		}
	}
	
	public int getNumeroComandos() {
		return this.comandos.size();
	}
}
