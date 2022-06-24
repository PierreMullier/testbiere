package fr.market.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double prix;
	public Produit(String designation, double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "Le produit " + designation + " est au prix de : " + prix + "€";
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
