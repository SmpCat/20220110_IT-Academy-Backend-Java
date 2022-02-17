package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
	
	private Date data;
	private List<Compra> ticket;
	
	public Ticket() {
		ticket = new ArrayList<Compra>();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Compra> getTicket() {
		return ticket;
	}

	public void setTicket(List<Compra> ticket) {
		this.ticket = ticket;
	}
}
