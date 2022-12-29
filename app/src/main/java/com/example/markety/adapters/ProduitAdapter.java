package com.example.markety.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.markety.R;
import com.example.markety.models.Client;
import com.example.markety.models.Demande;
import com.example.markety.models.ProduitDemande;

public class ProduitAdapter extends ArrayAdapter<ProduitDemande> {
    Context adapterContext;
    int adapterResource;
    ProduitDemande[] demandes;

    public ProduitAdapter(@NonNull Context context, int resource, @NonNull ProduitDemande[] objects) {
        super(context, resource, objects);
        adapterContext = context;
        adapterResource = resource;
        demandes = objects;
    }


    @Override
    public ProduitDemande getItem(int position) {
        return super.getItem(position);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        LayoutInflater rowInflater = LayoutInflater.from(adapterContext);
        row = rowInflater.inflate(adapterResource,parent,false);
        TextView textViewTitreProduit = row.findViewById(R.id.textViewTitreProduit);
        TextView textViewQuantite = row.findViewById(R.id.textViewQuantite);

        ProduitDemande c = demandes[position];

        textViewTitreProduit.setText(c.getProduit().getTitle());
        textViewQuantite.setText(c.getQuantite() + " exemplaire(s)");
        return row;
    }
}

