package crud.entity;

public class EmpleatDTO extends APersonaDTO {
	
	private String feina;
	
	public EmpleatDTO() {
		super();
	}

	public EmpleatDTO(Integer id, String nom, String feina) {
		super(id, nom);
		setFeina(feina);
	}

	public String getFeina() {
		return feina;
	}

	public void setFeina(String feina) {
		this.feina = feina;
	}
}
