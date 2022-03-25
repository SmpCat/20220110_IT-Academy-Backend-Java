package joc_de_daus.model.entity;

import java.util.Date;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Jugador {
	
	@Id
	private String id;
	@Size(max = 45, message = "Error: El nom ha de tenir una longitut de com a màxim 45 caracters")
	private String nom;
	private Date dataRegistre;

	public Jugador() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nom=" + nom + ", dataRegistre=" + dataRegistre + "]";
	}
}
