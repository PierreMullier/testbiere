package fr.market.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.market.dao.PanierRepository;
import fr.market.entities.Commande;
import fr.market.entities.Panier;

@RestController
@CrossOrigin("*")
public class PanierRest {
	@Autowired
	public PanierRepository panierRepo;
	
	@GetMapping("/paniers")
	public List<Panier> getAllPanier(){
		return (List<Panier>) panierRepo.findAll();
	}
	
	@DeleteMapping("panier/{id}")
	public boolean deletepanier(@PathVariable Long id) {
		Optional<Panier> f1 = panierRepo.findById(id);
		if(f1.isEmpty()) {
			return false;
		}else {
			panierRepo.deleteById(id);
		}
		
		return true;
	}
	@GetMapping("panier/commande/{id}")
	public List<Panier> getPanierByCommandeId(@PathVariable Long id){
		return (List<Panier>) panierRepo.findByCommandeId(id);
	}
}
