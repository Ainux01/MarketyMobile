package com.example.markety.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.markety.R;
import com.example.markety.adapters.ClientAdapter;
import com.example.markety.models.Client;

public class ClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        android.widget.ListView listViewClients = (android.widget.ListView) findViewById(R.id.listViewClients);
        Client c1 = new Client("Ahmed","Swamer","0789765435","amimed2001@gmail.com");
        Client c2 = new Client("Ahmed","Swamer","0789765435","amimed2001@gmail.com");
        Client c3 = new Client("Ahmed","Swamer","0789765435","amimed2001@gmail.com");
        Client c4 = new Client("Ahmed","Swamer","0789765435","amimed2001@gmail.com");
        Client c5 = new Client("Ahmed","Swamer","0789765435","amimed2001@gmail.com");
        Client[] clients = {c1,c2,c3,c4,c5};
        int id = R.layout.client_item;
        ClientAdapter adapter = new ClientAdapter(ClientActivity.this,id,clients);
        listViewClients.setAdapter(adapter);
        listViewClients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),DemandesActivity.class);
                startActivity(intent);
            }
        });
    }
}