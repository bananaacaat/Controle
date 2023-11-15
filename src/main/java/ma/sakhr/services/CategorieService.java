package ma.sakhr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.sakhr.IDao.IDao;
import ma.sakhr.entities.Categorie;
import ma.sakhr.repository.CategorieRepository;

@Service
public class CategorieService implements IDao<Categorie> {
	@Autowired
	CategorieRepository specialiteRepository;

	@Override
	public Categorie create(Categorie o) {
		return specialiteRepository.save(o);
	}

	@Override
	public List<Categorie> findAll() {
		return specialiteRepository.findAll();
	}

	@Override
	public Categorie update(Categorie o) {
		return specialiteRepository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			specialiteRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Categorie findById(Long id) {
		return specialiteRepository.findById(id).orElse(null);
	}

	
}