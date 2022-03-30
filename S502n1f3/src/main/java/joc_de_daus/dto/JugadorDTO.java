package joc_de_daus.dto;

import joc_de_daus.model.entity.Jugador;

public class JugadorDTO extends Jugador {
	
	private Float percentatgeMigEncerts;
	
	public JugadorDTO() {
		super();
	}

	public Float getPercentatgeMigEncerts() {
		return percentatgeMigEncerts;
	}

	public void setPercentatgeMigEncerts(Float percentatgeMigEncerts) {
		this.percentatgeMigEncerts = percentatgeMigEncerts;
	}

	@Override
	public String toString() {
		return "JugadorDTO [percentatgeMigEncerts=" + percentatgeMigEncerts + ", toString()=" + super.toString() + "]";
	}
}
