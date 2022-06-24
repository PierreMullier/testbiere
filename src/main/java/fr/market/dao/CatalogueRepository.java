package fr.market.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Catalogue;

public interface CatalogueRepository extends CrudRepository<Catalogue,Long> {

	List<Catalogue> findByProduitId(Long id_produit);

}
