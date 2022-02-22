package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Floristeria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nomFloristeria;
	private int stockArbres, stockFlors, stockDecoracionsFusta, stockDecoracionsPlastic;
	private double valorTotalStock;
	private List<AProducte> arbres;
	private List<AProducte> flors;
	private List<AProducte> decoracionsFusta;
	private List<AProducte> decoracionsPlastic;
	private List<Ticket> tickets;
	
	public Floristeria() {
		nomFloristeria = null;
		stockArbres = 0;
		stockFlors = 0;
		stockDecoracionsFusta = 0;
		stockDecoracionsPlastic = 0;
		valorTotalStock = 0;
		arbres = new ArrayList<AProducte>();
		flors = new ArrayList<AProducte>();
		decoracionsFusta = new ArrayList<AProducte>();
		decoracionsPlastic = new ArrayList<AProducte>();
		tickets = new ArrayList<Ticket>();
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

	public int getStockDecoracionsFusta() {
		return stockDecoracionsFusta;
	}

	public void setStockDecoracionsFusta(int stockDecoracionsFusta) {
		this.stockDecoracionsFusta = stockDecoracionsFusta;
	}

	public int getStockDecoracionsPlastic() {
		return stockDecoracionsPlastic;
	}

	public void setStockDecoracionsPlastic(int stockDecoracionsPlastic) {
		this.stockDecoracionsPlastic = stockDecoracionsPlastic;
	}

	public double getValorTotalStock() {
		return valorTotalStock;
	}

	public void setValorTotalStock(double valorTotalStock) {
		this.valorTotalStock = valorTotalStock;
	}

	public List<AProducte> getArbres() {
		return arbres;
	}

	public void setArbres(List<AProducte> arbres) {
		this.arbres = arbres;
	}

	public List<AProducte> getFlors() {
		return flors;
	}

	public void setFlors(List<AProducte> flors) {
		this.flors = flors;
	}

	public List<AProducte> getDecoracionsFusta() {
		return decoracionsFusta;
	}

	public void setDecoracionsFusta(List<AProducte> decoracionsFusta) {
		this.decoracionsFusta = decoracionsFusta;
	}

	public List<AProducte> getDecoracionsPlastic() {
		return decoracionsPlastic;
	}

	public void setDecoracionsPlastic(List<AProducte> decoracionsPlastic) {
		this.decoracionsPlastic = decoracionsPlastic;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Floristeria [nomFloristeria=" + nomFloristeria + ", stockArbres=" + stockArbres + ", stockFlors="
				+ stockFlors + ", stockDecoracionsFusta=" + stockDecoracionsFusta + ", stockDecoracionsPlastic="
				+ stockDecoracionsPlastic + ", valorTotalStock=" + valorTotalStock + ", arbres=" + arbres + ", flors="
				+ flors + ", decoracionsFusta=" + decoracionsFusta + ", decoracionsPlastic=" + decoracionsPlastic + ", tickets="
				+ tickets + "]";
	}
}
