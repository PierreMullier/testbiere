package fr.market.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CatalogueKey.class)
public class Catalogue {
	@Id
	@ManyToOne
	private Produit produit;
	@Id
	@ManyToOne
	private Fournisseur fournisseur;
	private double prix_achat;
	private int quantite;
	
	public Catalogue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catalogue(Produit produit, Fournisseur fournisseur, double prix_achat, int quantite) {
		super();
		this.produit = produit;
		this.fournisseur = fournisseur;
		this.prix_achat = prix_achat;
		this.quantite = quantite;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public double getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
