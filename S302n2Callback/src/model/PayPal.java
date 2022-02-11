package model;

public class PayPal implements IPasarelaDePagament {

	public PayPal() {

	}

	@Override
	public void pagar() {
		System.out.println("Pagament amb 'Paypal'");
	}

}
