package ma.sakhr.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.sakhr.IDao.IDao;
import ma.sakhr.entities.Article;
import ma.sakhr.entities.Categorie;
import ma.sakhr.repository.ArticleRepository;

@Service
public class ArticleService implements IDao<Article> {
    @Autowired
    ArticleRepository categorieRepository;

    @Override
    public Article create(Article o) {
        return categorieRepository.save(o);
    }

    @Override
    public List<Article> findAll() {
        return categorieRepository.findAll();
    }

    @Override
    public Article update(Article o) {
        return categorieRepository.save(o);
    }

    @Override
    public boolean delete(Article o) {
        try {
            categorieRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Article findById(Long id) {
        return categorieRepository.findById(id).orElse(null);
    }
    
    public List<Article> findByCategorie(Categorie categorie) {
        return ArticleRepository.findByCategorie(categorie);
    }
    
    public List<Article> findByDateEmbaucheBetween(Date dateDebut, Date dateFin) {
        return ArticleRepository.findByDateEmbaucheBetween(dateDebut, dateFin);
    }
    
}