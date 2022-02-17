package model;

public class Arbre extends AProducte {
	
	private int idFloristeria;
	private int idArbre;
	private double altura;
	
	public Arbre() {
		super();
	}
	
	public int getIdFloristeria() {
		return idFloristeria;
	}

	public void setIdFloristeria(int idFloristeria) {
		this.idFloristeria = idFloristeria;
	}

	public int getIdArbre() {
		return idArbre;
	}


	public void setIdArbre(int idArbre) {
		this.idArbre = idArbre;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
