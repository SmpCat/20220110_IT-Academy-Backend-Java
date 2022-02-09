package S105n1Exercici5;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nif;
    private String nom;
    private int edat;

    public Persona() {
    }

	public Persona(String nif, String nom, int edat) {
		super();
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
}