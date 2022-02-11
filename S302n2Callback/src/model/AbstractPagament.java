package model;

import java.util.Optional;

public abstract class AbstractPagament{
	
	public AbstractPagament() {
		
	}
	
	public final void pagarAmb(IPasarelaDePagament callback) {
	    Optional.ofNullable(callback).ifPresent(IPasarelaDePagament::pagar);
	    retornaControl();
	  }
	
	public abstract void retornaControl();

}
