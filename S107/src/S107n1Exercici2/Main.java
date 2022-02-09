package S107n1Exercici2;

public class Main {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("Importe = 500 €");
		
		Factura facturaConIva = new FacturaConIva();
		facturaConIva.setImporte(500);
		System.out.println("Factura con IVA (21%) = " + facturaConIva.calcularTotal() + " €");
		
		Factura facturaSinIva = new FacturaSinIva();
		facturaSinIva.setImporte(500);
		System.out.println("Factura sin IVA (21%) = " + facturaSinIva.calcularTotal() + " €");

	}

}
