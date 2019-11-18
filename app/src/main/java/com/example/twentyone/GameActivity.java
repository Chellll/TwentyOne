package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Point;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;

public class GameActivity extends AppCompatActivity {
    int n = 10;
    int k = 0;
    int kPl = 5;
    int h = 70;
    int posX1 = 80;
    int posX2 = 300;
    int posX3 = 520;
    int posY1 = 200;
    int posY2 = 790;
    int posY3 = 1175;
    int widthCard = 120;
    int heightCard = 160;
    int between_card = 7;
    int wh_icon = 60;

    ImageView[] imageViewMyCard = new ImageView[n];
    ImageView[] imageViewCard2 = new ImageView[n];
    ImageView[] imageViewCard3 = new ImageView[n];
    ImageView[] imageViewCard4 = new ImageView[n];
    ImageView[] imageViewCard5 = new ImageView[n];
    LinearLayout[] players = new LinearLayout[kPl-1];
    ImageView[] imageViewPlayers = new ImageView[kPl-1];
    TextView[] textViewPlayers = new TextView[kPl-1];

    Animation dealing_my_card;
    ConstraintLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        float width = size.x;
        float coeff = (float) (width / 720.0);
        h = (int) (70 * coeff);
        posX1 = (int) (posX1 * coeff);
        posX2 = (int) (posX2 * coeff);
        posX3 = (int) (posX3 * coeff);
        posY1 = (int) (posY1 * coeff);
        posY2 = (int) (posY2 * coeff);
        posY3 = (int) (posY3 * coeff);
        widthCard = (int) (widthCard * coeff);
        heightCard = (int) (heightCard * coeff);
        between_card = (int) (between_card * coeff);
        wh_icon = (int) (wh_icon * coeff);
        Bundle arguments = getIntent().getExtras();
        kPl = arguments.getInt("kPl");
        dealing_my_card = AnimationUtils.loadAnimation(this, R.anim.dealing_my_card);
        main = findViewById(R.id.main);
        for (int i = 0; i < kPl-1; i++)
        {
            players[i] = new LinearLayout(this);
            players[i].setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            players[i].setOrientation(LinearLayout.HORIZONTAL);
            imageViewPlayers[i] = new ImageView(this);
            imageViewPlayers[i].setLayoutParams(new LinearLayout.LayoutParams(
                    wh_icon,
                    wh_icon
            ));
            imageViewPlayers[i].setImageResource(R.drawable.icon);
            textViewPlayers[i] = new TextView(this);
            textViewPlayers[i].setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            textViewPlayers[i].setText("Name");
            textViewPlayers[i].setTextSize(16);
            players[i].addView(imageViewPlayers[i]);
            players[i].addView(textViewPlayers[i]);
            main.addView(players[i]);
        }
        if(kPl == 2)
        {
            players[0].setX(posX2);
            players[0].setY(posY1-h);
        }
        if(kPl == 3)
        {
            players[0].setX(posX1);
            players[0].setY(posY1-h);
            players[1].setX(posX3);
            players[1].setY(posY1-h);
        }
        if(kPl == 4)
        {
            players[0].setX(posX2);
            players[0].setY(posY1-h);
            players[1].setX(posX1);
            players[1].setY(posY2-h);
            players[2].setX(posX3);
            players[2].setY(posY2-h);
        }
        if(kPl == 5)
        {
            players[0].setX(posX1);
            players[0].setY(posY1-h);
            players[1].setX(posX1);
            players[1].setY(posY2-h);
            players[2].setX(posX3);
            players[2].setY(posY2-h);
            players[3].setX(posX3);
            players[3].setY(posY1-h);
        }

    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    public void onClick(View view){
        if (k < n)
        {
            imageViewMyCard[k] = new ImageView(this);
            imageViewMyCard[k].setLayoutParams(new LinearLayout.LayoutParams(
                    widthCard,
                    heightCard
            ));
            imageViewMyCard[k].setImageResource(R.drawable.card_front);
            imageViewMyCard[k].setX(posX2);
            imageViewMyCard[k].setY(posY3);
            main.addView(imageViewMyCard[k]);
            imageViewMyCard[k].startAnimation(dealing_my_card);

            if (kPl == 2)
            {
                imageViewCard2[k] = new ImageView(this);
                imageViewCard2[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard2[k].setImageResource(R.drawable.card_back);
                imageViewCard2[k].setX(posX2);
                imageViewCard2[k].setY(posY1);
                main.addView(imageViewCard2[k]);
            }

            if (kPl == 3)
            {
                imageViewCard2[k] = new ImageView(this);
                imageViewCard2[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard2[k].setImageResource(R.drawable.card_back);
                imageViewCard2[k].setX(posX1);
                imageViewCard2[k].setY(posY1);
                main.addView(imageViewCard2[k]);

                imageViewCard3[k] = new ImageView(this);
                imageViewCard3[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard3[k].setImageResource(R.drawable.card_back);
                imageViewCard3[k].setX(posX3);
                imageViewCard3[k].setY(posY1);
                main.addView(imageViewCard3[k]);
            }

            if (kPl == 4)
            {
                imageViewCard2[k] = new ImageView(this);
                imageViewCard2[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard2[k].setImageResource(R.drawable.card_back);
                imageViewCard2[k].setX(posX2);
                imageViewCard2[k].setY(posY1);
                main.addView(imageViewCard2[k]);

                imageViewCard3[k] = new ImageView(this);
                imageViewCard3[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard3[k].setImageResource(R.drawable.card_back);
                imageViewCard3[k].setX(posX1);
                imageViewCard3[k].setY(posY2);
                main.addView(imageViewCard3[k]);

                imageViewCard4[k] = new ImageView(this);
                imageViewCard4[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard4[k].setImageResource(R.drawable.card_back);
                imageViewCard4[k].setX(posX3);
                imageViewCard4[k].setY(posY2);
                main.addView(imageViewCard4[k]);
            }
            if (kPl == 5)
            {
                imageViewCard2[k] = new ImageView(this);
                imageViewCard2[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard2[k].setImageResource(R.drawable.card_back);
                imageViewCard2[k].setX(posX1);
                imageViewCard2[k].setY(posY1);
                main.addView(imageViewCard2[k]);

                imageViewCard3[k] = new ImageView(this);
                imageViewCard3[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard3[k].setImageResource(R.drawable.card_back);
                imageViewCard3[k].setX(posX1);
                imageViewCard3[k].setY(posY2);
                main.addView(imageViewCard3[k]);

                imageViewCard4[k] = new ImageView(this);
                imageViewCard4[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard4[k].setImageResource(R.drawable.card_back);
                imageViewCard4[k].setX(posX3);
                imageViewCard4[k].setY(posY2);
                main.addView(imageViewCard4[k]);

                imageViewCard5[k] = new ImageView(this);
                imageViewCard5[k].setLayoutParams(new LinearLayout.LayoutParams(
                        widthCard,
                        heightCard
                ));
                imageViewCard5[k].setImageResource(R.drawable.card_back);
                imageViewCard5[k].setX(posX3);
                imageViewCard5[k].setY(posY1);
                main.addView(imageViewCard5[k]);
            }

            posX1 += between_card;
            posX2 += between_card;
            posX3 += between_card;

            for (int i = 0; i < k; i++)
            {
                imageViewMyCard[i].setTranslationX(imageViewMyCard[i].getTranslationX()-between_card);
                if (kPl == 2) imageViewCard2[i].setTranslationX(imageViewCard2[i].getTranslationX()-between_card);
                if (kPl == 3)
                {
                    imageViewCard2[i].setTranslationX(imageViewCard2[i].getTranslationX()-between_card);
                    imageViewCard3[i].setTranslationX(imageViewCard3[i].getTranslationX()-between_card);
                }
                if (kPl == 4)
                {
                    imageViewCard2[i].setTranslationX(imageViewCard2[i].getTranslationX()-between_card);
                    imageViewCard3[i].setTranslationX(imageViewCard3[i].getTranslationX()-between_card);
                    imageViewCard4[i].setTranslationX(imageViewCard4[i].getTranslationX()-between_card);
                }
                if (kPl == 5)
                {
                    imageViewCard2[i].setTranslationX(imageViewCard2[i].getTranslationX()-between_card);
                    imageViewCard3[i].setTranslationX(imageViewCard3[i].getTranslationX()-between_card);
                    imageViewCard4[i].setTranslationX(imageViewCard4[i].getTranslationX()-between_card);
                    imageViewCard5[i].setTranslationX(imageViewCard5[i].getTranslationX()-between_card);
                }
            }
            k++;
        }
    }
}
