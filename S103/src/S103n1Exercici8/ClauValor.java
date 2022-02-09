package S103n1Exercici8;

public class ClauValor implements Comparable<ClauValor> {
	
	private String clau;
	private String valor;
	
	public ClauValor() {
		
	}
	
	public ClauValor(String clau, String valor) {
		super();
		this.clau = clau;
		this.valor = valor;
	}
	
	public String getClau() {
		return clau;
	}

	public void setClau(String clau) {
		this.clau = clau;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(ClauValor clauValor) {
		return this.clau.compareTo(clauValor.getClau());
	}
}
