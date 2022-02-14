package controller;

import model.Article;
import model.ConvertidorADolar;
import model.ConvertidorAEuro;
import model.ConvertidorALibraEsterlina;
import model.ConvertidorARubloRuso;
import model.ConvertidorAYen;
import model.ConvertidorAYuan;
import model.GestorArticles;
import model.IConvertidorDeMoneda;
import view.View;

public class Controller {
	
	private GestorArticles gestorArticles;
	private IConvertidorDeMoneda convertidorDeMoneda;
	private View view;
	
	public Controller() {
		gestorArticles = new GestorArticles();
		view = new View();
	}
	
	public void tractarPeticions() {
		boolean sortir = false;
       
        do{
            switch(view.menuPrincipal()){
            	case 0: 
            		view.escriureMissagte("Gràcies per haver fet servir l'aplicació");
            		sortir = true;
            		break;
                case 1:
                	//Introduïr article en Euro
                	Article article= new Article();
                	article.setNom(view.obtenirNomArticle());
                	article.setPreu(view.obtenirPreuArticle());
                	gestorArticles.afegirArticle(article);
                	break;
                case 2:
                	//Veure preu articles en Euro
                	convertidorDeMoneda = new ConvertidorAEuro();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                case 3: 
                	//Veure preu articles en Dolars
                	convertidorDeMoneda = new ConvertidorADolar();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                case 4: 
                	//Veure preu articles en Libra Esterlina
                	convertidorDeMoneda = new ConvertidorALibraEsterlina();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                case 5: 
                	//Veure preu articles en Rublo Ruso
                	convertidorDeMoneda = new ConvertidorARubloRuso();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                case 6: 
                	//Veure preu articles en Yen
                	convertidorDeMoneda = new ConvertidorAYen();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                case 7: 
                	//Veure preu articles en Yuan
                	convertidorDeMoneda = new ConvertidorAYuan();
                	gestorArticles.mostrarArticles(convertidorDeMoneda);
                	break;
                default:
            }
        }while(!sortir);   
	}
}
