package model;

public class ConvertidorADolar implements IConvertidorDeMoneda {
	
	private double valorDivisa = 1.13;
	
	public ConvertidorADolar() {
		
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
