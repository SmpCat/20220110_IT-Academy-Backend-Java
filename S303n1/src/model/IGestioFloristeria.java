package model;

public interface IGestioFloristeria {
	
	public String getNomFloristeria();
	public void llistarFloristeries();
	public void escollirFloristeria();
	public void eliminarFloristeria();
	public void afegirArbre();
	public void afegirFlor();
	public void afegirDecoracioFusta();
	public void afegirDecoracioPlastic();
	public void getStockDeProductes();
	public void retirarArbre();
	public void retirarFlor();
	public void retirarDecoracioFusta();
	public void retirarDecoracioPlastic();
	public void getStockDeQuantitats();
	public void getValorTotalStock();
	public void crearTicket();
	public void getValorTotalVendes();
	public void getTickets();
}
