package com.example.brasileiro2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEquipe(View view) {
        tela = new Intent(getApplicationContext(), Equipes.class);
        startActivity(tela);
    }

    public void clickTecnicos(View view) {
        tela = new Intent(getApplicationContext(), Tecnicos.class);
        startActivity(tela);
    }

    public void clickTabela(View view) {
        String url = "https://ge.globo.com/futebol/brasileirao-serie-a/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}