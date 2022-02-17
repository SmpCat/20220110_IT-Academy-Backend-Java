package model;

import java.io.Serializable;

public final class ComptadorProducte implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static int idFloristeria;
	private static int idArbre;
	private static int idFlor;
	private static int idDecoracioFusta;
	private static int idDecoracioTicket;
	private static int idTicket;
	
	public ComptadorProducte() {
	}

	public static int getIdFloristeria() {
		return idFloristeria;
	}

	public static void setIdFloristeria(int idFloristeria) {
		ComptadorProducte.idFloristeria = idFloristeria;
	}

	public static int getIdArbre() {
		return idArbre;
	}

	public static void setIdArbre(int idArbre) {
		ComptadorProducte.idArbre = idArbre;
	}

	public static int getIdFlor() {
		return idFlor;
	}

	public static void setIdFlor(int idFlor) {
		ComptadorProducte.idFlor = idFlor;
	}

	public static int getIdDecoracioFusta() {
		return idDecoracioFusta;
	}

	public static void setIdDecoracioFusta(int idDecoracioFusta) {
		ComptadorProducte.idDecoracioFusta = idDecoracioFusta;
	}

	public static int getIdDecoracioTicket() {
		return idDecoracioTicket;
	}

	public static void setIdDecoracioTicket(int idDecoracioTicket) {
		ComptadorProducte.idDecoracioTicket = idDecoracioTicket;
	}

	public static int getIdTicket() {
		return idTicket;
	}

	public static void setIdTicket(int idTicket) {
		ComptadorProducte.idTicket = idTicket;
	}

	public void inicialitzarComptadors() {
		ComptadorProducte.idArbre = 0;
		ComptadorProducte.idFlor = 0;
		ComptadorProducte.idDecoracioFusta = 0;
		ComptadorProducte.idDecoracioTicket = 0;
		ComptadorProducte.idTicket = 0;
	}
}
