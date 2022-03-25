package joc_de_daus.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Document
public class Tirada {
	
	@Id
	private String id;
	private Byte valorDau1;
	private Byte valorDau2;
	@DBRef
	@JsonIgnore
	private Jugador jugador;
	
	public Tirada() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
