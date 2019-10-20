package com.example.twentyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.twentyone.Model.User;
import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {

    public static final String USER_KEY = "EMAIL_KEY";

    private SharedPreferenceHelper mSharedPreder;

    private ImageView userImageView;
    private TextView nameTextView;
    private TextView nickTextView;
    private TextView emailTextView;
    private TextView friendTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mSharedPreder = new SharedPreferenceHelper(this);

        userImageView = findViewById(R.id.user_image_view);
        nameTextView = findViewById(R.id.user_name_text_view);
        nickTextView = findViewById(R.id.user_nick_text_view);
        emailTextView = findViewById(R.id.user_email_text_view);
        friendTextView = findViewById(R.id.following_count_text_view);


        User user = mSharedPreder.getUser();

        //User user = SharedPreferenceHelper.getUserLocal();



        nameTextView.setText(user.getName());
        nickTextView.setText(user.getNick());
        emailTextView.setText(user.getEmail());
        if(user.getImageUrl()!= null)
        {
            userImageView.setImageDrawable(user.getImageUrl());
        }


        userImageView.setClickable(true);
        userImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ImageDrawActivity.class);
                startActivity(intent);
            }
        });

    }




}
