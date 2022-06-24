package fr.market.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Commande;

public interface CommandeRepository extends CrudRepository<Commande,Long> {

	List<Commande> findByClientId(Long id);

}
