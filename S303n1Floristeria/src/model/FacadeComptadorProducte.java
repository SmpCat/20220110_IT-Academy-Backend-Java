package model;

public class FacadeComptadorProducte implements IComptadorProducte {
	
	DAOComptadorProducte daoComptadorProducte;
	
	public FacadeComptadorProducte() {
		daoComptadorProducte = new DAOComptadorProducte();
	}
	
	@Override
	public int obtenirComptador(EComptador idComptador) {
		return daoComptadorProducte.obtenirComptadorProducte(idComptador);
    }

	@Override
	public int incrementarComptador(EComptador idComptador) {
		return daoComptadorProducte.incrementarComptadorProducte(idComptador);
	}
}
