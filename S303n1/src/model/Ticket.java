package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Date data;
	private List<AProducte> ticket;
	
	public Ticket() {
		data = new Date();
		ticket = new ArrayList<AProducte>();
	}
	
	public Ticket(List<AProducte> compra) {
		data = new Date();
		ticket = new ArrayList<AProducte>(compra);
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<AProducte> getTicket() {
		return ticket;
	}

	public void setTicket(List<AProducte> ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Ticket [data=" + data + ", ticket=" + ticket + "]";
	}
}
