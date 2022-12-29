package com.example.markety.models;




public class ProduitDemande {

    private Long produitdemandeId;
    private int quantite;
    private Produit produit;

    public ProduitDemande(Long produitdemandeId, int quantite, Produit produit) {
        this.produitdemandeId = produitdemandeId;
        this.quantite = quantite;
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
