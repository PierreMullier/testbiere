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

import fr.market.dao.CommandeRepository;
import fr.market.entities.Catalogue;
import fr.market.entities.Commande;


@RestController
@CrossOrigin("*")
public class CommandeRest {
	@Autowired
	public CommandeRepository commandeRepo;
	
	@GetMapping("/commandes")
	public List<Commande> getAllCommande(){
		return (List<Commande>) commandeRepo.findAll();
	}
	
	@GetMapping("commande/client/{id}")
	public List<Commande> getCommandeByProduitId(@PathVariable Long id){
		return (List<Commande>) commandeRepo.findByClientId(id);
	}

	
	/*@DeleteMapping("commande/{id}")
	public boolean deletecommande(@PathVariable Long id) {
		Optional<Commande> f1 = commandeRepo.findById(id);
		
			f1.);
			commandeRepo.deleteById(id);
		}
		
		return true;
	}*/
	
	@PostMapping("/commande")
	public Commande savecommande(@RequestBody Commande u) {
		return commandeRepo.save(u);	
	}
}
