package model;

public class Flor extends AProducte {
	
	private static final long serialVersionUID = 1L;
	private String color;
	
	public Flor() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flor [color=" + color + ", getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}
}
