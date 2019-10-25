package com.example.twentyone;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.twentyone.Model.User;

public class AuthActivity extends AppCompatActivity {

    private SharedPreferenceHelper mSharedPreferenceHelper;

    private TextView tvLogin;
    private TextView tvPassword;
    private Button btnCancel;
    private Button btnOk;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        tvLogin = findViewById(R.id.etEmail);
        tvPassword = findViewById(R.id.etPassword);
        btnCancel = findViewById(R.id.btnCancel);
        btnOk = findViewById(R.id.btnOk);
        mSharedPreferenceHelper = new SharedPreferenceHelper(AuthActivity.this);

        //Кнопка отмены
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getBackIntent = new Intent(AuthActivity.this, MainActivity.class);
                startActivity(getBackIntent);
            }
        });

        //Кнопка ок
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //проверка удачности входа
                boolean isLoginSuccess = false;

                for(User user : mSharedPreferenceHelper.getUsers()){
                    if(user.getEmail().equalsIgnoreCase(tvLogin.getText().toString())
                    && user.getPassword().equals(tvPassword.getText().toString())){
                        //успешно вошли
                        isLoginSuccess = true;
                        if(isValidEmail() && isValidText(tvPassword.getText().toString())){
                            mSharedPreferenceHelper.setUserLocal(user);
                            Intent startIntent = new Intent(AuthActivity.this, NewsActivity.class);
                            startActivity(startIntent);
                        }
                        else{
                            showMessage(R.string.login_error);
                        }
                        break;
                    }
                }
                }
            });
    }

    private void showMessage(@StringRes int string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    private boolean isValidEmail(){
        return !TextUtils.isEmpty(tvLogin.getText()) && Patterns.EMAIL_ADDRESS.matcher(tvLogin.getText()).matches();
    }

    private boolean isValidText(String text){
        return !TextUtils.isEmpty(text);
    }

}
