package ma.sakhr.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.sakhr.entities.Article;
import ma.sakhr.entities.Categorie;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	static List<Article> findByCategorie(Categorie categorie) {
		return null;
	}
	static List<Article> findByDateEmbaucheBetween(Date dateDebut, Date dateFin) {
		return null;
	}

}
