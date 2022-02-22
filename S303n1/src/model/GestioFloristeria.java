package model;

import java.util.ArrayList;
import java.util.List;
import tools.Config;
import tools.Formatea;
import view.View;

public class GestioFloristeria implements IGestioFloristeria {
	
	private View view;
	private Floristeria floristeriaEnCurs;
	private IPersistencia persistencia;
	
	public GestioFloristeria() {
		view = new View();
		persistencia = new Persistencia();
	}
	
	@Override
	public String getNomFloristeria() {
		return floristeriaEnCurs.getNomFloristeria();
	}
	
	@Override
	public void llistarFloristeries() {
		view.llistarNoms(persistencia.getLListarFloristeries(Config.DIRECTORI));
	}
	
	@Override
	public void escollirFloristeria() {
		
		String nomNovaFloristeria = view.getNom("la floristeria");
		
		Floristeria floristeriaFitxer = persistencia.getFloristeria(Config.DIRECTORI, nomNovaFloristeria);
		if (floristeriaFitxer == null) {
			floristeriaEnCurs = new Floristeria();
			floristeriaEnCurs.setNomFloristeria(nomNovaFloristeria);
			persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
		} else {
			floristeriaEnCurs = floristeriaFitxer;	
		}
	}
	
	@Override
	public void eliminarFloristeria() {
		
		String nomFloristeriaAEliminar = view.getNom("la floristeria a eliminar");
		
		if (persistencia.eliminarFloristeria(Config.DIRECTORI, nomFloristeriaAEliminar)) {
			view.escriureMissagte("La Floristeria " + "'" + nomFloristeriaAEliminar + "'" + " ha estat eliminada amb èxit");
		} else {
			view.escriureMissagte("Error: La Floristeria " + "'" + nomFloristeriaAEliminar + "'" + " no existeix");
		}	
	}

	@Override
	public void afegirArbre() {
		
		Arbre arbre = new Arbre();
		arbre.setNom(view.getNom("l'arbre"));
		arbre.setAltura(view.getAltura());
		arbre.setPreu(view.getPreu("l'arbre"));
		floristeriaEnCurs.getArbres().add(arbre);
		floristeriaEnCurs.setStockArbres(floristeriaEnCurs.getStockArbres() + 1);
		floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() + arbre.getPreu());
		persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
	}

	@Override
	public void afegirFlor() {
		
		Flor flor = new Flor();
		flor.setNom(view.getNom("la flor"));
		flor.setColor(view.getColor());
		flor.setPreu(view.getPreu("la flor"));
		floristeriaEnCurs.getFlors().add(flor);
		floristeriaEnCurs.setStockFlors(floristeriaEnCurs.getStockFlors() + 1);
		floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() + flor.getPreu());
		persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
	}

	@Override
	public void afegirDecoracioFusta() {
		
		DecoracioFusta decoracioFusta = new DecoracioFusta();
		decoracioFusta.setNom(view.getNom("la decoració de fusta"));
		decoracioFusta.setPreu(view.getPreu("la decoració de fusta"));
		floristeriaEnCurs.getDecoracionsFusta().add(decoracioFusta);
		floristeriaEnCurs.setStockDecoracionsFusta(floristeriaEnCurs.getStockDecoracionsFusta() + 1);
		floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() + decoracioFusta.getPreu());
		persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
		
	}

	@Override
	public void afegirDecoracioPlastic() {
		
		DecoracioPlastic decoracioPlastic = new DecoracioPlastic();
		decoracioPlastic.setNom(view.getNom("la decoració de plàstic"));
		decoracioPlastic.setPreu(view.getPreu("la decoració de plàstic"));
		floristeriaEnCurs.getDecoracionsPlastic().add(decoracioPlastic);
		floristeriaEnCurs.setStockDecoracionsPlastic(floristeriaEnCurs.getStockDecoracionsPlastic() + 1);
		floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() + decoracioPlastic.getPreu());
		persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);

	}

	@Override
	public void getStockDeProductes() {
		view.getStockDeProductes(floristeriaEnCurs);
	}

	public AProducte retirarElement(List<AProducte> productes, String nomABuscar) {
		
		AProducte producteRetirat = null;
		
		for (int i = 0; i < productes.size() && producteRetirat == null; i++) {
			
			if (productes.get(i).getNom().contentEquals(nomABuscar)) {
				producteRetirat = productes.get(i);
				productes.remove(i);
			}
		}
		return producteRetirat;
	}
	
	@Override
	public void retirarArbre() {
		
		boolean error= false;
		
		if (floristeriaEnCurs.getStockArbres() < 1) {
			error = true;
			view.escriureMissagte("Error: No hi ha arbres en stock");
		}
		
		if (!error) {
			String nomArbreARetirar = view.getNom("l'arbre a retirar");
			
			AProducte producteRetirat = retirarElement(floristeriaEnCurs.getArbres(), nomArbreARetirar);
			if (producteRetirat != null) {
				floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteRetirat.getPreu());
				floristeriaEnCurs.setStockArbres(floristeriaEnCurs.getStockArbres() - 1);
				persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
				view.escriureMissagte("L'arbre " + "'" + nomArbreARetirar + "' " + "s'ha retirat correctament");
			} else {
				view.escriureMissagte("Error: No s'ha trobat l'arbre " + "'" + nomArbreARetirar + "'");
			}
		}
	}

	@Override
	public void retirarFlor() {
		
		boolean error= false;
		
		if (floristeriaEnCurs.getStockFlors() < 1) {
			error = true;
			view.escriureMissagte("Error: No hi ha flors en stock");
		}
		
		if (!error) {
			String nomFlorARetirar = view.getNom("la flor a retirar");
			
			AProducte producteRetirat = retirarElement(floristeriaEnCurs.getFlors(), nomFlorARetirar);
			if (producteRetirat != null) {
				floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteRetirat.getPreu());
				floristeriaEnCurs.setStockFlors(floristeriaEnCurs.getStockFlors() - 1);
				persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
				view.escriureMissagte("La flor " + "'" + nomFlorARetirar + "' " + "s'ha retirat correctament");
			} else {
				view.escriureMissagte("Error: No s'ha trobat la flor " + "'" + nomFlorARetirar + "'");
			}
		}
	}

	@Override
	public void retirarDecoracioFusta() {
		
		boolean error= false;
		
		if (floristeriaEnCurs.getStockDecoracionsFusta() < 1) {
			error = true;
			view.escriureMissagte("Error: No hi ha Decoracions de Fusta en stock");
		}
		
		if (!error) {
			String nomDecoracioFustaARetirar = view.getNom("la Decoració de Fusta a retirar");
			
			AProducte producteRetirat = retirarElement(floristeriaEnCurs.getDecoracionsFusta(), nomDecoracioFustaARetirar);
			if (producteRetirat != null) {
				floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteRetirat.getPreu());
				floristeriaEnCurs.setStockDecoracionsFusta(floristeriaEnCurs.getStockDecoracionsFusta() - 1);
				persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
				view.escriureMissagte("La Decoració de Fusta " + "'" + nomDecoracioFustaARetirar + "' " + "s'ha retirat correctament");
			} else {
				view.escriureMissagte("Error: No s'ha trobat la Decoració de Fusta " + "'" + nomDecoracioFustaARetirar + "'");
			}
		}
	}

	@Override
	public void retirarDecoracioPlastic() {

		boolean error= false;
		
		if (floristeriaEnCurs.getStockDecoracionsPlastic() < 1) {
			error = true;
			view.escriureMissagte("Error: No hi ha Decoracions de Plàstic en stock");
		}
		
		if (!error) {
			String nomDecoracioPlasticARetirar = view.getNom("la Decoració de Plàstic a retirar");
			
			AProducte producteRetirat = retirarElement(floristeriaEnCurs.getDecoracionsPlastic(), nomDecoracioPlasticARetirar);
			if (producteRetirat != null) {
				floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteRetirat.getPreu());
				floristeriaEnCurs.setStockDecoracionsPlastic(floristeriaEnCurs.getStockDecoracionsPlastic() - 1);
				persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
				view.escriureMissagte("La Decoració de Plàstic " + "'" + nomDecoracioPlasticARetirar + "' " + "s'ha retirat correctament");
			} else {
				view.escriureMissagte("Error: No s'ha trobat la Decoració de Plàstic " + "'" + nomDecoracioPlasticARetirar + "'");
			}
		}
	}

	@Override
	public void getStockDeQuantitats() {
		view.getStockDeQuantitats(floristeriaEnCurs);
	}
	
	@Override
	public void getValorTotalStock() {
		view.getValorTotalFloristeria(Formatea.euro(floristeriaEnCurs.getValorTotalStock()), getNomFloristeria());
	}
	
	@Override
	public void crearTicket() {
		
		boolean sortir = false;
		
		List<AProducte> compra = new ArrayList<AProducte>();
		List<AProducte> arbres = new ArrayList<AProducte>(floristeriaEnCurs.getArbres());
		List<AProducte> flors = new ArrayList<AProducte>(floristeriaEnCurs.getFlors());
		List<AProducte> decoracionsFusta = new ArrayList<AProducte>(floristeriaEnCurs.getDecoracionsFusta());
		List<AProducte> decoracionsPlastic = new ArrayList<AProducte>(floristeriaEnCurs.getDecoracionsPlastic());
		
        do{
        	switch(view.menuCompra(getNomFloristeria())){
            	case 0: 
            		//Cancel·lar compra
            		view.escriureMissagte("Compra cancel·lada");
            		sortir = true;
            		break;
                case 1:
                	//Generar Ticket
                	generarTicket(compra);
                	sortir = true;
                	break;
                case 2:
                	//Comprar Arbre
                	comprarProducte(compra, arbres, "l'arbre a comprar");
                	break;
                case 3: 
                	//Comprar Flor
                	comprarProducte(compra, flors, "la flor a comprar");
                	break;
                case 4: 
                	//Comprar Decoració Fusta
                	comprarProducte(compra, decoracionsFusta, "la Decoració de Fusta a comprar");
                	break;
                case 5: 
                	//Comprar Decoració Plàstic
                	comprarProducte(compra, decoracionsPlastic, "la Decoració de Plàstic a comprar");
                	break;
                default:
            }
        	
        }while(!sortir);
	}
	
	public void getTickets() {
		
		for(Ticket ticket:floristeriaEnCurs.getTickets()) {
			view.escriureMissagte(ticket.toString());
		}
	}
	
	public void getValorTotalVendes() {
		
		double valorTotalVendes = 0;
		
		for(Ticket ticket:floristeriaEnCurs.getTickets()) {
			for(AProducte producte:ticket.getTicket()) {
				valorTotalVendes = valorTotalVendes + producte.getPreu();
			}
		}
		view.getValorTotalVendes(Formatea.euro(valorTotalVendes), getNomFloristeria());
	}
	
	private void comprarProducte(List<AProducte> compra, List<AProducte> productes, String tipusProducte) {
		
		boolean producteTrobat = false;
		
		
		String nomProducteAComprar = view.getNom(tipusProducte);
		
		for (int i = 0; i < productes.size() && !producteTrobat; i++) {
			
			if (productes.get(i).getNom().contentEquals(nomProducteAComprar)) {
				compra.add(productes.get(i));
				producteTrobat = true;
			} 
		}
		
		if (producteTrobat) {
			view.escriureMissagte("El producte " + "'" + nomProducteAComprar + "'" + " s'ha afegit a la llista de la compra");
			retirarElement(productes, nomProducteAComprar);
			
		} else {
			view.escriureMissagte("Error: El producte " + "'" + nomProducteAComprar + "'" + " no s'ha trobat");
		}
	}
	
	private void generarTicket(List<AProducte> compra) {
		
		if (compra.size() > 0) {
			
	    	floristeriaEnCurs.getTickets().add(new Ticket(compra));
	    	
	    	for (AProducte producteCompra:compra) {
	    		
	    		if (producteCompra instanceof Arbre) {
	    			producteCompra = retirarElement(floristeriaEnCurs.getArbres(), producteCompra.getNom());
	    			if (producteCompra != null) {
		    			floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteCompra.getPreu());
		    			floristeriaEnCurs.setStockArbres(floristeriaEnCurs.getStockArbres() - 1);
	    			}
	    		}
	    		else if (producteCompra instanceof Flor) {
	    			producteCompra = retirarElement(floristeriaEnCurs.getFlors(), producteCompra.getNom());
	    			if (producteCompra != null) {
		    			floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteCompra.getPreu());
		    			floristeriaEnCurs.setStockFlors(floristeriaEnCurs.getStockFlors() - 1);
	    			}
	    		}
	    		else if (producteCompra instanceof DecoracioFusta) {
	    			producteCompra = retirarElement(floristeriaEnCurs.getDecoracionsFusta(), producteCompra.getNom());
	    			if (producteCompra != null) {
		    			floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteCompra.getPreu());
		    			floristeriaEnCurs.setStockDecoracionsFusta(floristeriaEnCurs.getStockDecoracionsFusta() - 1);
	    			}
	    		}
	    		else if (producteCompra instanceof DecoracioPlastic) {
	    			producteCompra = retirarElement(floristeriaEnCurs.getDecoracionsPlastic(), producteCompra.getNom());
	    			if (producteCompra != null) {
		    			floristeriaEnCurs.setValorTotalStock(floristeriaEnCurs.getValorTotalStock() - producteCompra.getPreu());
		    			floristeriaEnCurs.setStockDecoracionsPlastic(floristeriaEnCurs.getStockDecoracionsPlastic() - 1);
	    			}
	    		}
	    	}
	    	persistencia.guardarFloristeria(Config.DIRECTORI, floristeriaEnCurs);
	    	view.escriureMissagte("El ticket s'ha generat correctament");
	    	
		} else {
			view.escriureMissagte("Error: No s'ha fet cap compra");
		}
	}
}
