package joc_de_daus.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tirada {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private Byte valorDau1;
	private Byte valorDau2;
	@ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name = "id_jugador")
	@JsonIgnore
	private Jugador jugador;
	
	public Tirada() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getValorDau1() {
		return valorDau1;
	}

	public void setValorDau1(Byte valorDau1) {
		this.valorDau1 = valorDau1;
	}

	public Byte getValorDau2() {
		return valorDau2;
	}

	public void setValorDau2(Byte valorDau2) {
		this.valorDau2 = valorDau2;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Tirada [id=" + id + ", valorDau1=" + valorDau1 + ", valorDau2=" + valorDau2 + ", jugador=" + jugador
				+ "]";
	}
}
