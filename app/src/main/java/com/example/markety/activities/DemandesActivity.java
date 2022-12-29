package com.example.markety.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.markety.R;
import com.example.markety.adapters.DemandeAdapter;
import com.example.markety.models.Demande;
import com.example.markety.models.Status;

public class DemandesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demandes);

        TextView fullName = findViewById(R.id.fullName1);
        TextView email = findViewById(R.id.email1);
        TextView phone1 = findViewById(R.id.phone1);

        ListView listViewDamandes = findViewById(R.id.listViewDemandes);
        Demande d1 = new Demande(1l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d2 = new Demande(2l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d3 = new Demande(3l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d4 = new Demande(4l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d5 = new Demande(1l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d6 = new Demande(2l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d7 = new Demande(3l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande d8 = new Demande(4l,"Achat d'Eau","Achat d'Eau", Status.PENDING,null);
        Demande[] demandes = {d1,d2,d3,d4,d5,d6,d7,d8};
        int id = R.layout.demande_item;
        DemandeAdapter adapter = new DemandeAdapter(getApplicationContext(),id,demandes);
        listViewDamandes.setAdapter(adapter);
        listViewDamandes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),DemandeActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}