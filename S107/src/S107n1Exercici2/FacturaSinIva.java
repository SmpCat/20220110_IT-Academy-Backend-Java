package S107n1Exercici2;

public class FacturaSinIva extends Factura {

	public FacturaSinIva() {

	}
	
	@Override
	public double calcularTotal() {
		return this.getImporte();

	}
}
