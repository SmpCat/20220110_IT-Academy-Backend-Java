package model;

public class ConvertidorARubloRuso implements IConvertidorDeMoneda {
	
	private double valorDivisa = 86.31;
	
	public ConvertidorARubloRuso() {
		
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
