package fr.market.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.market.dao.ProduitRepository;
import fr.market.entities.Client;
import fr.market.entities.Produit;

@RestController
@CrossOrigin("*")
public class ProduitRest {
	@Autowired
	public ProduitRepository produitRepo;
	
	@GetMapping("/produits")
	public List<Produit> getAllProduit(){
		return (List<Produit>) produitRepo.findAll();
	}
	
	@DeleteMapping("produit/{id}")
	public boolean deleteFournisseur(@PathVariable Long id) {
		Optional<Produit> f1 = produitRepo.findById(id);
		if(f1.isEmpty()) {
			return false;
		}else {
			produitRepo.deleteById(id);
		}
		
		return true;
	}
	@PostMapping("/produit")
	public Produit saveproduit(@RequestBody Produit u) {
		return produitRepo.save(u);	
	}
}
