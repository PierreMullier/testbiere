package fr.market.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String adr_liv;
	@ManyToOne 
	private Client client;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Date date, String adr_liv, Client client) {
		super();
		this.date = date;
		this.adr_liv = adr_liv;
		this.client = client;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAdr_liv() {
		return adr_liv;
	}
	public void setAdr_liv(String adr_liv) {
		this.adr_liv = adr_liv;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
