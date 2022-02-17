package model;

public abstract class AProducte {
	
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
