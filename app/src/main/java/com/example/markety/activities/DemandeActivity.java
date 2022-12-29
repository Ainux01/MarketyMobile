package com.example.markety.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.markety.R;
import com.example.markety.adapters.ProduitAdapter;
import com.example.markety.models.Produit;
import com.example.markety.models.ProduitDemande;

public class DemandeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demande);
        TextView textViewTitle = findViewById(R.id.textViewTitre);
        TextView textViewDescription = findViewById(R.id.textViewDescription);
        ListView listViewProducts = findViewById(R.id.ListView100);


        ProduitDemande d1 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));
        ProduitDemande d2 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));
        ProduitDemande d3 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));
        ProduitDemande d4 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));
        ProduitDemande d5 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));
        ProduitDemande d6 = new ProduitDemande(1l,5,new Produit(1l,"1234","Eau Minerale","Eau Minerale",5.5));

        ProduitDemande[] ds = {d1,d2,d3,d4,d5,d6};
        int id = R.layout.produit_item;
        ProduitAdapter adapter = new ProduitAdapter(DemandeActivity.this,id,ds);
        listViewProducts.setAdapter(adapter);
    }
}