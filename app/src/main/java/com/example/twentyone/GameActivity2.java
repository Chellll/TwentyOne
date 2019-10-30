package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GameActivity2 extends AppCompatActivity {
    int n = 5;
    int k = 0;
    int posX = 300;
    ImageView[] imageViewMyCard = new ImageView[n];
    ImageView[] imageViewCard = new ImageView[n];
    Animation dealing_my_card;
    Animation dealing_card;
    ConstraintLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        dealing_my_card = AnimationUtils.loadAnimation(this, R.anim.dealing_my_card);
        dealing_card = AnimationUtils.loadAnimation(this, R.anim.dealing_card);
        main = findViewById(R.id.main);

    }
    public void onClick(View view){
        if (k < n)
        {
            imageViewMyCard[k] = new ImageView(this);
            imageViewCard[k] = new ImageView(this);
            imageViewMyCard[k].setLayoutParams(new LinearLayout.LayoutParams(
                    120,
                    160
            ));
            imageViewCard[k].setLayoutParams(new LinearLayout.LayoutParams(
                    120,
                    160
            ));
            imageViewMyCard[k].setImageResource(R.drawable.card_front);
            imageViewCard[k].setImageResource(R.drawable.card_back);
            imageViewMyCard[k].setX(posX);
            imageViewCard[k].setX(posX);
            posX += 20;
            imageViewMyCard[k].setY(1075);
            imageViewCard[k].setY(150);
            main.addView(imageViewMyCard[k]);
            main.addView(imageViewCard[k]);
            imageViewMyCard[k].startAnimation(dealing_my_card);
            imageViewCard[k].startAnimation(dealing_card);
            for (int i = 0; i < k; i++)
            {
                imageViewMyCard[i].setTranslationX(imageViewMyCard[i].getTranslationX()-20);
                imageViewCard[i].setTranslationX(imageViewCard[i].getTranslationX()-20);
            }
            k++;
        }
    }
}
