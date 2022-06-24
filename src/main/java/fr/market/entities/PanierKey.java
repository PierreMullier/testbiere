package fr.market.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PanierKey implements Serializable{
	 Long produit;

	 Long commande;
}
