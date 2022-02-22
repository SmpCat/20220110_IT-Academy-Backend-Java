package model;

public class Arbre extends AProducte {
	
	private static final long serialVersionUID = 1L;
	private double altura;
	
	public Arbre() {
		super();
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Arbre [altura=" + altura + ", getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}
}
