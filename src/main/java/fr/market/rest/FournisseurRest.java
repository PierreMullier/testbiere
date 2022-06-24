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

import fr.market.dao.FournisseurRepository;
import fr.market.entities.Catalogue;
import fr.market.entities.Fournisseur;

@RestController
@CrossOrigin("*")
public class FournisseurRest {
	@Autowired
	public FournisseurRepository fournisseurRepo;
	
	@GetMapping("/fournisseurs")
	public List<Fournisseur> getAllFournisseur(){
		return (List<Fournisseur>) fournisseurRepo.findAll();
	}
	
	@DeleteMapping("fournisseur/{id}")
	public boolean deleteFournisseur(@PathVariable Long id) {
		Optional<Fournisseur> f1 = fournisseurRepo.findById(id);
		if(f1.isEmpty()) {
			return false;
		}else {
			fournisseurRepo.deleteById(id);
		}
		
		return true;
	}
	
	@PostMapping("/fournisseur")
	public Fournisseur savefournisseur(@RequestBody Fournisseur u) {
		return fournisseurRepo.save(u);	
	}
}
