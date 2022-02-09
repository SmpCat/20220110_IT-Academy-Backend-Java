package S106n1Exercici1;

import java.util.Objects;

public class Persona implements Comparable <Persona> {

	private String nif;
    private String nom;
    private int edat;

    public Persona() {
    }

	public Persona(String nif, String nom, int edat) {
		this.nif = nif;
		this.nom = nom;
		this.edat = edat;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nom=" + nom + ", edat=" + edat + "]";
	}

	@Override
	public int compareTo(Persona persona) {
		return this.nif.compareTo(persona.getNif());
	}

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}
}