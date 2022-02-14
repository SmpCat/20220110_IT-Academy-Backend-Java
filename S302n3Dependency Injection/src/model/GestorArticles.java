package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class GestorArticles {
	
	private List<Article> articles = new ArrayList<Article>();
	
	public GestorArticles() {
		
	}
	
	public void afegirArticle(Article article) {
		this.articles.add(article);
	}
	
	public void mostrarArticles(IConvertidorDeMoneda convertidorDeMoneda) {
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for (Article article: articles) {
			System.out.print("Nom: " + article.getNom() + " ");
			System.out.println("Preu: " + df.format(convertidorDeMoneda.calcularValor(article.getPreu())));
		}
	}
}
