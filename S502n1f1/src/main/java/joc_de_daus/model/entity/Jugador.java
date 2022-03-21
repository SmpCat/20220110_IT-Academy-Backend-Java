package joc_de_daus.model.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Jugador {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Size(max = 45, message = "Error: El nom ha de tenir una longitut de com a màxim 45 caracters")
	private String nom;
	private Date dataRegistre;
	
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = false)
	@JoinColumn(name = "id_jugador")
	private List<Tirada> tirades;
	
	public Jugador() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Tirada> getTirades() {
		return tirades;
	}

	public void setTirades(List<Tirada> tirades) {
		this.tirades = tirades;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nom=" + nom + ", dataRegistre=" + dataRegistre + ", tirades=" + tirades + "]";
	}
}
