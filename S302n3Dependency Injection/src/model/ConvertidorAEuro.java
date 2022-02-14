package model;

public class ConvertidorAEuro implements IConvertidorDeMoneda {
	
	private double valorDivisa = 1;
	
	public ConvertidorAEuro() {
		
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
