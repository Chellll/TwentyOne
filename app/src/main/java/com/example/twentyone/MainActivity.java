package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickRegister(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void onClickGuest(View view){
        Intent intent = new Intent(MainActivity.this, NewsActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickAuth(View view){
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }
}
