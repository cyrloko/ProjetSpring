package fr.demo.beans;

import org.springframework.stereotype.Component;

import fr.demo.interfaces.Article;
import fr.demo.interfaces.Commande;
import lombok.Data;

@Data
@Component
public class CommandeImpl implements Commande {

	@Override
	public boolean ajouterArticle(Article art) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerArticle(Article art) {
		// TODO Auto-generated method stub
		return false;
	}

}
