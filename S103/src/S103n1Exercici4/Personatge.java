package S103n1Exercici4;

import java.util.Objects;

public class Personatge implements Comparable<Personatge> {
	
	private String nom;
	
	public Personatge() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int compareTo(Personatge personatge) {
		return this.nom.compareTo(personatge.getNom());
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personatge other = (Personatge) obj;
		return Objects.equals(nom, other.nom);
	}
}
