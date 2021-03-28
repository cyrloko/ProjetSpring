package fr.demo.beans;

import org.springframework.stereotype.Component;

import fr.demo.interfaces.Article;
import lombok.Data;

@Data
@Component
public class ArticleImpl implements Article {

	String libelle;
	int prix;
}
