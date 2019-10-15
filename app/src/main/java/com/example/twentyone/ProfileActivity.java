package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    EditText et;
    SharedPreferences sPref;
    SharedPreferences sImg;
    final String SAVED_TEXT = "saved_text";
    static final int GALLARY_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        /*
        et = (EditText) findViewById(R.id.editNickName);
        int argument = getIntent().getIntExtra("pickedImage",1);
        if(argument==1){

            ImageView imageView=findViewById(R.id.imageViewProf);
            imageView.setImageResource(R.drawable.ava_1);
            sImg = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor = sImg.edit();
            editor.apply();
        }
        if(argument==2){

            ImageView imageView=findViewById(R.id.imageViewProf);
            imageView.setImageResource(R.drawable.ava_2);
            sImg = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor = sImg.edit();
            editor.apply();
        }
        if(argument==3){

            ImageView imageView=findViewById(R.id.imageViewProf);
            imageView.setImageResource(R.drawable.ava_3);

        }
         */



    }


/*
    public void BackClick3(View v) {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void SaveClick(View v) {

        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, et.getText().toString());
        ed.apply();
        Toast.makeText(this, "Text Saved", Toast.LENGTH_SHORT).show();

    }

    public void LoadClick(View v) {

        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        et.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    public void ChangeClick(View v) {


        Intent intent = new Intent(this, ImageDrawActivity.class);
        startActivity(intent);



    }
    public void ImageChange(View view){

    }

    public void SaveImageClick(View v){
        // private String saveToInternalStorage(Bitmap, selectedImage){


    }
    */

}
