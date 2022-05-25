package com.example.brasileiro2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Equipes extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipes);
    }

    public void clickVoltar(View view) {
        finish();
    }

    public void clickAmerica(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/america-mg/"));
        startActivity(nav);
    }

    public void clickCap(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/pr/futebol/times/athletico-pr/"));
        startActivity(nav);
    }

    public void clickAcg(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/go/futebol/times/atletico-go/"));
        startActivity(nav);
    }

    public void clickCam(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/atletico-mg/"));
        startActivity(nav);
    }

    public void clickAvai(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/sc/futebol/times/avai/"));
        startActivity(nav);
    }

    public void clickBotafogo(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/botafogo/"));
        startActivity(nav);
    }

    public void clickRbb(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/sp/vale-do-paraiba-regiao/futebol/times/bragantino/"));
        startActivity(nav);
    }

    public void clickCeara(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/ce/futebol/times/ceara/"));
        startActivity(nav);
    }

    public void clickCorinthians(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/corinthians/"));
        startActivity(nav);
    }

    public void clickCoritiba(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/pr/futebol/times/coritiba/"));
        startActivity(nav);
    }

    public void clickCuiaba(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/mt/futebol/times/cuiaba/"));
        startActivity(nav);
    }

    public void clickFla(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/flamengo/"));
        startActivity(nav);
    }

    public void clickFlu(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/fluminense/"));
        startActivity(nav);
    }

    public void clickFort(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/ce/futebol/times/fortaleza/"));
        startActivity(nav);
    }

    public void clickGoias(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/go/futebol/times/goias/"));
        startActivity(nav);
    }

    public void clickInter(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/rs/futebol/times/internacional/"));
        startActivity(nav);
    }

    public void clickJuventude(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/rs/futebol/times/juventude/"));
        startActivity(nav);
    }

    public void clickPal(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/palmeiras/"));
        startActivity(nav);
    }

    public void clickSantos(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/sp/santos-e-regiao/futebol/times/santos/"));
        startActivity(nav);
    }

    public void clickSpfc(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ge.globo.com/futebol/times/sao-paulo/"));
        startActivity(nav);
    }
}