package model;

public class ConvertidorAYuan implements IConvertidorDeMoneda {
	
	private double valorDivisa = 7.20;
	
	public ConvertidorAYuan() {
		
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
