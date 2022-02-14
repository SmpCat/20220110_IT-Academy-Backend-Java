package model;

public class ConvertidorAYen implements IConvertidorDeMoneda {
	
	private double valorDivisa = 130.58;
	
	public ConvertidorAYen() {
		
	}

	public double getValorDivisa() {
		return valorDivisa;
	}

	public void setValorDivisa(double valorDivisa) {
		this.valorDivisa = valorDivisa;
	}
	
	@Override
	public double calcularValor(double preu) {
		return preu * valorDivisa;
	}
}
