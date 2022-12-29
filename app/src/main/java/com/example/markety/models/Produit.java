package com.example.markety.models;


import java.util.*;


public class Produit {
    private Long produitId;
    private String code;
    private String title;
    private String description;
    private Double prix;

    public Produit(Long produitId, String code, String title, String description, Double prix) {
        this.produitId = produitId;
        this.code = code;
        this.title = title;
        this.description = description;
        this.prix = prix;
    }

    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
