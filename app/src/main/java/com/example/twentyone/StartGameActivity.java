package com.example.twentyone;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartGameActivity extends AppCompatActivity {

    TextView textViewWins;
    TextView textViewCoins;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);

        textViewWins = (TextView) findViewById(R.id.textViewWins);
        textViewCoins = (TextView) findViewById(R.id.textViewCoins);
        Intent intent = getIntent();
        String wins = intent.getStringExtra("wins");
        textViewWins.setText(wins);
        String coins = intent.getStringExtra("coins");
        textViewCoins.setText(coins);
    }
    public void onClickType(View v) {
        textView4.setBackgroundResource(R.drawable.type);
        textView5.setBackgroundResource(R.drawable.type);
        textView6.setBackgroundResource(R.drawable.type);
        v.setBackgroundResource(R.drawable.type2);
    }
    public void onClickPlayers(View v) {
        textView9.setBackgroundResource(R.drawable.players);
        textView10.setBackgroundResource(R.drawable.players);
        textView11.setBackgroundResource(R.drawable.players);
        textView12.setBackgroundResource(R.drawable.players);
        v.setBackgroundResource(R.drawable.players2);
    }
}

