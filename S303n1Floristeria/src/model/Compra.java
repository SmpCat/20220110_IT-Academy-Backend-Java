package model;

public class Compra {
	
	private AProducte producte;
	private int quantitat;
	
	public Compra() {
		
	}
	
	public AProducte getProducte() {
		return producte;
	}

	public void setProducte(AProducte producte) {
		this.producte = producte;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}
}
