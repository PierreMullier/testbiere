package fr.market.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(PanierKey.class)
public class Panier {
	@Id
	@ManyToOne
	private Commande commande;
	@Id
	@ManyToOne
	private Produit produit;
	
	private int quantite;

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panier(Commande commande, Produit produit, int quantite) {
		super();
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
	
	
}
