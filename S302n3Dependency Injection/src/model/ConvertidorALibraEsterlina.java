package model;

public class ConvertidorALibraEsterlina implements IConvertidorDeMoneda {
	
	private double valorDivisa = 0.84;
	
	public ConvertidorALibraEsterlina() {
		
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
