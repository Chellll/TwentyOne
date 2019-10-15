package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ImageDrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_draw);
    }
    int pickedImage=0;

    public void ImgClick_1(View view){
        Toast.makeText(this,"Нажата картинка 1",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("pickedImage",1);
        startActivity(intent);
        pickedImage=1;

    }
    public void ImgClick_2(View view){
        Toast.makeText(this,"Нажата картинка 2",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("pickedImage",2);
        startActivity(intent);
        pickedImage=2;
    }
    public void ImgClick_3(View view){
        Toast.makeText(this,"Нажата картинка 3",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("pickedImage",3);
        startActivity(intent);
        pickedImage=3;
    }
}

