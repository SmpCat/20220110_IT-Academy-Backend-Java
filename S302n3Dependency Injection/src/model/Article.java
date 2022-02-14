package model;

public class Article {
	
	private String nom;
	private Double preu;
	
	public Article() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPreu() {
		return preu;
	}

	public void setPreu(Double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Article [nom=" + nom + ", preu=" + preu + "]";
	}
	
}
