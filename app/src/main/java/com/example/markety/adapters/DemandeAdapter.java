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

public class DemandeAdapter extends ArrayAdapter<Demande> {
    Context adapterContext;
    int adapterResource;
    Demande[] demandes;

    public DemandeAdapter(@NonNull Context context, int resource, @NonNull Demande[] objects) {
        super(context, resource, objects);
        adapterContext = context;
        adapterResource = resource;
        demandes = objects;
    }


    @Override
    public Demande getItem(int position) {
        return super.getItem(position);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        LayoutInflater rowInflater = LayoutInflater.from(adapterContext);
        row = rowInflater.inflate(adapterResource,parent,false);
        TextView titleandstatus = row.findViewById(R.id.textViewTitleAndStatus);


        Demande c = demandes[position];

        titleandstatus.setText(c.getTitle()+" "+c.getStatus().toString());

        return row;
    }
}

