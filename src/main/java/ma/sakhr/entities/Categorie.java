package ma.sakhr.entities;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@ManyToOne
	private Categorie categorieParent;
	@OneToMany(mappedBy = "categorieParent" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	private List<Categorie> categorisParent;
	public Categorie() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Categorie getCategorieParent() {
		return categorieParent;
	}
	public void setCategorieParent(Categorie categorieParent) {
		this.categorieParent = categorieParent;
	}
	public List<Categorie> getCategorisParent() {
		return categorisParent;
	}
	public void setCategorisParent(List<Categorie> categorisParent) {
		this.categorisParent = categorisParent;
	}
	
	

}
