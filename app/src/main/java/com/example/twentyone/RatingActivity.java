package com.example.twentyone;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Point;

import android.graphics.drawable.GradientDrawable;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;


public class RatingActivity extends AppCompatActivity {

    LinearLayout ratingScrollLinLayout;
    int n = 20;
    int coins = 30000;
    int wins = 5000;

    LinearLayout[] ratingLine = new LinearLayout[n];
    TextView[] ratingNumber = new TextView[n];
    TextView[] ratingName = new TextView[n];
    ImageView[] ratingIcon = new ImageView[n];
    ImageView[] ratingCoin = new ImageView[n];
    TextView[] ratingCoins = new TextView[n];
    String[] name = {"Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name"};
    String[] name2 = {"Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2", "Name2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        ratingScrollLinLayout = (LinearLayout) findViewById(R.id.ratingScrollLinLayout);




        GradientDrawable gdRatingLine = new GradientDrawable();
        gdRatingLine.setStroke(2, 0xFF000000);
        GradientDrawable gdRatingIcon = new GradientDrawable();
        gdRatingIcon.setCornerRadius(5);
        gdRatingIcon.setStroke(7, 0xFFFFFFFF);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        float width = size.x;
        float coeff = (float) (width / 720.0);

        int wRatingNumber = (int) (100 * coeff);
        int wRatingName = (int) (200 * coeff);
        int wRatingCoins = (int) (250 * coeff);
        int hRatingLine = (int) (100 * coeff);
        int hRatingIcon = (int) (90 * coeff);
        int wRatingIcon = (int) (90 * coeff);
        int hRatingCoin = (int) (80 * coeff);
        int wRatingCoin = (int) (80 * coeff);


        for (int i = 0; i < n; i++) {
            ratingLine[i] = new LinearLayout(this);
            ratingLine[i].setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    hRatingLine
            ));
            ratingLine[i].setPadding(0, 5, 0, 0);

            ratingNumber[i] = new TextView(this);
            ratingNumber[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wRatingNumber,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            ratingNumber[i].setText(String.valueOf(i + 1) + ".");
            ratingNumber[i].setTextSize(20);
            ratingNumber[i].setGravity(Gravity.RIGHT);
            ratingNumber[i].setPadding(5, 5, 5, 5);

            ratingName[i] = new TextView(this);
            ratingName[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wRatingName,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            ratingName[i].setText(name[i]);
            ratingName[i].setTextSize(20);
            ratingName[i].setPadding(10, 5, 5, 5);

            ratingLine[i].setBackground(gdRatingLine);
            ratingIcon[i] = new ImageView(this);
            ratingIcon[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wRatingIcon,
                    hRatingIcon
            ));
            ratingIcon[i].setImageResource(R.drawable.icon);
            ratingIcon[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            ratingIcon[i].setBackground(gdRatingIcon);
            ratingIcon[i].setPadding(7, 7, 7, 7);

            ratingCoin[i] = new ImageView(this);
            ratingCoin[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wRatingCoin,
                    hRatingCoin
            ));
            ratingCoin[i].setImageResource(R.drawable.coin);
            ratingCoin[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            ratingCoin[i].setPadding(12, 12, 12, 12);

            ratingCoins[i] = new TextView(this);
            ratingCoins[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wRatingCoins,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            ratingCoins[i].setText(String.valueOf(coins));
            ratingCoins[i].setTextSize(20);
            ratingCoins[i].setGravity(Gravity.RIGHT);
            ratingCoins[i].setPadding(5, 5, 10, 5);

            ratingLine[i].addView(ratingNumber[i]);
            ratingLine[i].addView(ratingIcon[i]);
            ratingLine[i].addView(ratingName[i]);
            ratingLine[i].addView(ratingCoins[i]);
            ratingLine[i].addView(ratingCoin[i]);
            ratingScrollLinLayout.addView(ratingLine[i]);
        }

    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnLuck:
                for(int i = 0; i < n; i++)
                {
                    ratingCoin[i].setImageResource(R.drawable.luck);
                    ratingCoins[i].setText(String.valueOf(wins));
                    ratingName[i].setText(name2[i]);
                }
                break;
            case R.id.btnCoins:
                for(int i = 0; i < n; i++)
                {
                    ratingCoin[i].setImageResource(R.drawable.coin);
                    ratingCoins[i].setText(String.valueOf(coins));
                    ratingName[i].setText(name[i]);
                }
                break;
        }
    }
    /*public void onClickStart(View view) {
        Intent intent = new Intent(MainActivity.this, StartActivity.class);
        intent.putExtra("coins",String.valueOf(coins));
        intent.putExtra("wins",String.valueOf(wins));
        startActivity(intent);
    }*/

}
