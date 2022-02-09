package S107n1Exercici2;

public class FacturaConIva extends Factura {
	
	public FacturaConIva() {
		
	}
	
	@Override
	public double calcularTotal() {
		return this.getImporte()*1.21;
	}
}
