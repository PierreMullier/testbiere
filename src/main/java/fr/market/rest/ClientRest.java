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

import fr.market.dao.ClientRepository;
import fr.market.entities.Catalogue;
import fr.market.entities.Client;

@RestController
@CrossOrigin("*")
public class ClientRest {
	@Autowired
	public ClientRepository clientRepo;
	
	@GetMapping("/clients")
	public List<Client> getAllClient(){
		return (List<Client>) clientRepo.findAll();
	}
	
	@DeleteMapping("client/{id}")
	public boolean deleteFournisseur(@PathVariable Long id) {
		Optional<Client> c1 = clientRepo.findById(id);
		if(c1.isEmpty()) {
			return false;
		}else {
			clientRepo.deleteById(id);
		}
		
		return true;
	}
	//Authentification
	@GetMapping("/connexion/{login}/{password}") 
	public Client getClientByLoginPass(@PathVariable String login, @PathVariable String password) {
		return clientRepo.getByLoginAndPassword(login, password);
	}
	
	@PostMapping("/client")
	public Client saveClient(@RequestBody Client u) {
		return clientRepo.save(u);	
	}
	

}
