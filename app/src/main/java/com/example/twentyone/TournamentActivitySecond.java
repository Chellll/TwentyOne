package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TournamentActivitySecond extends AppCompatActivity {

    ImageView cupImage;
    TextView TourDescription;
    TextView TourDate;
    TextView PeopleCount;
    int pageNum;
    int peopQuantity = 12;
    int peopMax = 100;
    String TourDescr = "Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в романе Льва Николаевича Толстого 'Война и мир' ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament_second);
        cupImage = findViewById(R.id.imageViewTour2);
        TourDescription = findViewById(R.id.textViewTourDescription);
        TourDate = findViewById(R.id.textViewTourDate);
        PeopleCount = findViewById(R.id.textViewTourPeopleCount);
        Intent intent = getIntent();
        pageNum = intent.getIntExtra("pageNumber",0);

        if(pageNum==0){
            cupImage.setImageResource(R.drawable.ava_1);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(+peopQuantity+"/"+peopMax);

        }
        if(pageNum==1){
            cupImage.setImageResource(R.drawable.ava_2);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);

        }
        if(pageNum==2){
            cupImage.setImageResource(R.drawable.ava_3);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);
        }

        if(pageNum==3){

            cupImage.setImageResource(R.drawable.golden_cup);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);
        }
        if(pageNum==4){

            cupImage.setImageResource(R.drawable.player);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);
        }
        if(pageNum==5){

            cupImage.setImageResource(R.drawable.coin);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);
        }
        if(pageNum==6){
            cupImage.setImageResource(R.drawable.icon);
            TourDescription.setText(TourDescr);
            TourDate.setText("21.05.2019");
            PeopleCount.setText(peopQuantity+"/"+peopMax);

        }

    }

    public void onClickCountPeop(View v){
        Intent intent = new Intent(this,RatingActivity.class);
        startActivity(intent);

    }


}
