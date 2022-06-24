package fr.market.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Panier;

public interface PanierRepository  extends CrudRepository<Panier,Long>{

	List<Panier> findByCommandeId(Long id);

}
