package white_collar.model.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Quadre {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Error: Nom no informat")
	@Size(min = 1, max = 100, message = "Error: El nom ha de tenir una longitut d'entre 1 i 100")
	private String nom;
	@NotNull(message = "Error: Preu no informat")
    @Min(value = 0, message = "Error: El preu mínim és zero")
	private Double preu;
	private String autor;
	private Date dataEntrada;
	@ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name = "id_botiga")
	@JsonIgnore
	private Botiga botiga;
	
	public Quadre() {
		
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

	public Double getPreu() {
		return preu;
	}

	public void setPreu(Double preu) {
		this.preu = preu;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Botiga getBotiga() {
		return botiga;
	}

	public void setBotiga(Botiga botiga) {
		this.botiga = botiga;
	}

	@Override
	public String toString() {
		return "Quadre [id=" + id + ", nom=" + nom + ", preu=" + preu + ", autor=" + autor + ", dataEntrada="
				+ dataEntrada + ", botiga=" + botiga + "]";
	}
}
