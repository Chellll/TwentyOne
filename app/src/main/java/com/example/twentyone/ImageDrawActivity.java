package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageDrawActivity extends AppCompatActivity {

    private ImageView ivAva1;
    private ImageView ivAva2;
    private ImageView ivAva3;
 SharedPreferenceHelper sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_draw);
sh = new SharedPreferenceHelper(this);
        ivAva1 = findViewById(R.id.imageViewAva_1);
        ivAva2 = findViewById(R.id.imageViewAva_2);
        ivAva3 = findViewById(R.id.imageViewAva_3);

        ivAva1.setClickable(true);
        ivAva2.setClickable(true);
        ivAva3.setClickable(true);

        ivAva1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ImageDrawActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ivAva2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ImageDrawActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ivAva3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sh.updateImageUser(sh.getUser().getEmail(),getResources().getDrawable(R.drawable.ava_3));
                Intent intent = new Intent(ImageDrawActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void ImgClick_1(View view){

        Toast.makeText(getApplicationContext(), ivAva3.getImageMatrix().toString(), Toast.LENGTH_LONG).show();

    }

}

