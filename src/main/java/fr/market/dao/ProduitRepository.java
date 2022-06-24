package fr.market.dao;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Produit;

public interface ProduitRepository  extends CrudRepository<Produit, Long>{

}
