package model;

public class TargetaDeCredit implements IPasarelaDePagament {

	public TargetaDeCredit() {
	
	}

	@Override
	public void pagar() {
		System.out.println("Pagament amb 'Targeta de crèdit'");
	}

}
