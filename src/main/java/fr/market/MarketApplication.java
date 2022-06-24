package fr.market;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

import fr.market.dao.CatalogueRepository;
import fr.market.dao.ClientRepository;
import fr.market.dao.CommandeRepository;
import fr.market.dao.FournisseurRepository;
import fr.market.dao.PanierRepository;
import fr.market.dao.ProduitRepository;
import fr.market.entities.Catalogue;
import fr.market.entities.Client;
import fr.market.entities.Commande;
import fr.market.entities.Fournisseur;
import fr.market.entities.Panier;
import fr.market.entities.Produit;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {
	@Autowired
	ClientRepository clientRepo;
	@Autowired
	ProduitRepository produitRepo;
	@Autowired
	FournisseurRepository fournisseurRepo;
	@Autowired
	CatalogueRepository catalogueRepo;
	@Autowired
	PanierRepository panierRepo;
	@Autowired
	CommandeRepository commandeRepo;
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Run success");
		
		Client c1 = new Client("Pierre","Mullier","0649244553","Paris","test","test");
		Client c2 = new Client("Laure","Flore","0600004553","Lille","test1","test1");
		Client c3 = new Client("Nono","Boubou","0677777777","Lyon","test2","test2");
		clientRepo.save(c1);
		clientRepo.save(c2);
		clientRepo.save(c3);
		
		Produit p1 = new Produit("Nem",11);
		Produit p2 = new Produit("Tomate",2);
		Produit p3 = new Produit("Pomme",15);
		Produit p4 = new Produit("Patate",1);
		Produit p5 = new Produit("oeufs",101);
		
		produitRepo.save(p1);
		produitRepo.save(p2);
		produitRepo.save(p3);
		produitRepo.save(p4);
		produitRepo.save(p5);
		
		Fournisseur f1 = new Fournisseur("Fourni1","0000000","123 rue bidon");
		fournisseurRepo.save(f1);
		
		Catalogue ca1 =new Catalogue(p5, f1, 20, 5);
		catalogueRepo.save(ca1);
		Date date = new Date("12/12/12");
		Commande co1 = new Commande(date, "test_liv", c3);
		commandeRepo.save(co1);
		
		Panier pa1 = new Panier(co1, p2, 5);
		panierRepo.save(pa1);
		System.out.println(c1.toString());
		System.out.println(p1.toString());
		
	}

}
