package ma.sakhr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.sakhr.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	
	
	
  
}
