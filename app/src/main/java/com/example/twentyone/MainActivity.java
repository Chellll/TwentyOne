package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.twentyone.Model.User;

public class MainActivity extends AppCompatActivity {

    SharedPreferenceHelper sharedPreferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //проверка на то, вошел человек уже или нет
        /*sharedPreferenceHelper = new SharedPreferenceHelper(this);
        User user = sharedPreferenceHelper.getUser();
        if(user.getEmail() != "")
        {
            Intent intent = new Intent(MainActivity.this, NewsActivity.class);
            startActivity(intent);
        }*/
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
