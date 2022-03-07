package crud.entity;

public class FeinaDTO {
	
	private String nom;
	private double salari;
	
	public FeinaDTO() {
	}

	public FeinaDTO(String nom, double salari) {
		
		this.nom = nom;
		this.salari = salari;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalari() {
		return salari;
	}

	public void setSalari(double salari) {
		this.salari = salari;
	}
}
