package model;

public class BotigaDeSabates {
	
	AbstractPagament pagament;
	
	public BotigaDeSabates() {
		pagament = new Pagament();	
	}
	
	public void pagament(IPasarelaDePagament pasarelaDePagament) {
		pagament.pagarAmb(pasarelaDePagament);
	}
}
