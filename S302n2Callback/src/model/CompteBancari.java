package model;

public class CompteBancari implements IPasarelaDePagament {

	public CompteBancari() {
	
	}

	@Override
	public void pagar() {
		System.out.println("Pagament amb 'Compte Bancari'");
	}

}
