package white_collar.model.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Botiga {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Error: Nom no informat")
	@Size(min = 1, max = 100, message = "Error: El nom ha de tenir una longitut d'entre 1 i 100")
	private String nom;
	@NotNull(message = "Error: Capacitat no informada")
	@Min(value = 0, message = "Error: La capacitat mínima és zero")
	private Integer capacitat;
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = false)
	@JoinColumn(name = "id_botiga")
	private List<Quadre> quadres;
	
	public Botiga() {
		
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

	public Integer getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(Integer capacitat) {
		this.capacitat = capacitat;
	}
	
	public List<Quadre> getQuadres() {
		return quadres;
	}

	public void setQuadres(List<Quadre> quadres) {
		this.quadres = quadres;
	}
	
	@Override
	public String toString() {
		return "Botiga [id=" + id + ", nom=" + nom + ", capacitat=" + capacitat + ", quadres=" + quadres + "]";
	}
}
