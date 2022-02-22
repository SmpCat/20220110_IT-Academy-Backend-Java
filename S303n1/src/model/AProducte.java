package model;

import java.io.Serializable;

public abstract class AProducte implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nom;
	private double preu;
	
	public AProducte() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
}
