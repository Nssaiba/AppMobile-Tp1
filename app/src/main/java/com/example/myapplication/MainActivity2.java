package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView nomText, emailText, phoneText,adresseText,villeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

      Intent i= getIntent();

        // Récupérer les TextView depuis le layout
        nomText = findViewById(R.id.nom);
        emailText = findViewById(R.id.email);
        phoneText = findViewById(R.id.phone);
        adresseText = findViewById(R.id.adresse);
        villeText = findViewById(R.id.ville);


        // Récupérer les données passées via l'intent

        String nom = i.getStringExtra("nom");
        String email = i.getStringExtra("email");
        String phone = i.getStringExtra("phone");
        String adresse = i.getStringExtra("adresse");
        String ville = i.getStringExtra("ville");

        // Afficher les données dans les TextView
        nomText.setText(nom);
        emailText.setText(email);
        phoneText.setText(phone);
        adresseText.setText(adresse);
        villeText.setText(ville);


    }
}