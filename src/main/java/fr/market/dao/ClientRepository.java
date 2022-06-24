package fr.market.dao;

import org.springframework.data.repository.CrudRepository;

import fr.market.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{

	Client getByLoginAndPassword(String login, String password);

}
