package fr.market.dao;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Fournisseur;

public interface FournisseurRepository extends CrudRepository<Fournisseur,Long> {

}
