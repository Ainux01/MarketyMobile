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

public class ClientAdapter extends ArrayAdapter<Client> {
    Context adapterContext;
    int adapterResource;
    Client[] clients;

    public ClientAdapter(@NonNull Context context, int resource, @NonNull Client[] objects) {
        super(context, resource, objects);
        adapterContext = context;
        adapterResource = resource;
        clients = objects;
    }


    @Override
    public Client getItem(int position) {
        return super.getItem(position);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        LayoutInflater rowInflater = LayoutInflater.from(adapterContext);
        row = rowInflater.inflate(adapterResource,parent,false);
        TextView fullname = (TextView) row.findViewById(R.id.textViewFullName);
        TextView numberOfDemands = (TextView) row.findViewById(R.id.textViewDemandes);

        Client c = clients[position];

        fullname.setText(c.getFirstname()+" "+c.getLastname());
        numberOfDemands.setText("4 Demandes d'achat");
        return row;
    }
}

