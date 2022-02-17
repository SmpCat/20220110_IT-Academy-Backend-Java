package model;

import java.io.Serializable;

public class Floristeria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idFloristeria;
	private String nomFloristeria;
	private int stockArbres, stockFlors, stockDecoracio;
	private double valorTotalStock;
	
	public Floristeria() {
	}
	
	public int getIdFloristeria() {
		return idFloristeria;
	}

	public void setIdFloristeria(int idFloristeria) {
		this.idFloristeria = idFloristeria;
	}

	public String getNomFloristeria() {
		return nomFloristeria;
	}

	public void setNomFloristeria(String nomFloristeria) {
		this.nomFloristeria = nomFloristeria;
	}

	public int getStockArbres() {
		return stockArbres;
	}

	public void setStockArbres(int stockArbres) {
		this.stockArbres = stockArbres;
	}

	public int getStockFlors() {
		return stockFlors;
	}

	public void setStockFlors(int stockFlors) {
		this.stockFlors = stockFlors;
	}

	public int getStockDecoracio() {
		return stockDecoracio;
	}

	public void setStockDecoracio(int stockDecoracio) {
		this.stockDecoracio = stockDecoracio;
	}

	public double getValorTotalStock() {
		return valorTotalStock;
	}

	public void setValorTotalStock(double valorTotalStock) {
		this.valorTotalStock = valorTotalStock;
	}
}
