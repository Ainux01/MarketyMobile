package com.example.markety.models;



import java.util.*;

public class Demande {

    private Long demandeId;
    private String title;
    private String description;
    private Status status;
    private List<ProduitDemande> produitDemandes;

    public Demande(Long demandeId, String title, String description, Status status, List<ProduitDemande> produitDemandes) {
        this.demandeId = demandeId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.produitDemandes = produitDemandes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<ProduitDemande> getProduitDemandes() {
        return produitDemandes;
    }

    public void setProduitDemandes(List<ProduitDemande> produitDemandes) {
        this.produitDemandes = produitDemandes;
    }
}
