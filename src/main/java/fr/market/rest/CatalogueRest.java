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

import fr.market.dao.CatalogueRepository;
import fr.market.entities.Catalogue;


@RestController
@CrossOrigin("*")
public class CatalogueRest {
	@Autowired
	CatalogueRepository catalogueRepo;
	
	@GetMapping("/catalogues")
	public List<Catalogue> getAllCatalogue(){
		return (List<Catalogue>) catalogueRepo.findAll();
	}
	
	@GetMapping("/catalogue/{id_produit}")
	public List<Catalogue> getCatalogueByProduitId(@PathVariable Long id_produit){
		return (List<Catalogue>) catalogueRepo.findByProduitId(id_produit);
	}
	
	@PostMapping("/catalogue")
	public Catalogue saveCatalogue(@RequestBody Catalogue u) {
		return catalogueRepo.save(u);	
	}
	
	@DeleteMapping("catalogue/{id}")
	public boolean deletecatalogue(@PathVariable Long id) {
		Optional<Catalogue> f1 = catalogueRepo.findById(id);
		if(f1.isEmpty()) {
			return false;
		}else {
			catalogueRepo.deleteById(id);
		}
		
		return true;
	}
}
