package com.example.twentyone;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.twentyone.Model.User;

public class RegisterActivity extends AppCompatActivity {

    private SharedPreferenceHelper mSharedPreferencesHelper;

    private EditText etName;
    private EditText etNick;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etPasswordAgain;
    private Button btnCancel;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //инициализация всех объектов
        etEmail = findViewById(R.id.textEmail);
        etName = findViewById(R.id.textName);
        etNick = findViewById(R.id.textNick);
        etPassword = findViewById(R.id.textPassword);
        etPasswordAgain = findViewById(R.id.textAgainPassword);
        btnCancel = findViewById(R.id.btnCancel);
        btnOk = findViewById(R.id.btnOk);
        mSharedPreferencesHelper = new SharedPreferenceHelper(RegisterActivity.this);

        //обработка кнопки "Назад"(возвращаемся на начальный экран)
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //обработка кнопки "Ок"(Регистрация)
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isValidEmail() && isValidText(etName.getText().toString()) && isValidText(etNick.getText().toString()) && isPasswordValid())
                {
                    boolean isAdded = mSharedPreferencesHelper.addUser(new User(
                            etName.getText().toString(),
                            etNick.getText().toString(),
                            etEmail.getText().toString(),
                            etPassword.getText().toString()
                    ));
                    if(isAdded){
                        showMessage(R.string.login_register_success);
                    }else{
                        showMessage(R.string.login_register_error);
                    }
                }
                else
                {
                    showMessage(R.string.login_input_error);
                }

            }
        });
    }

    private void showMessage(@StringRes int string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
        }

    private boolean isValidEmail(){
        return !TextUtils.isEmpty(etEmail.getText()) && Patterns.EMAIL_ADDRESS.matcher(etEmail.getText()).matches();
    }

    private boolean isPasswordValid(){
        String password = etPassword.getText().toString();
        String againPassword = etPasswordAgain.getText().toString();
        return password.equals(againPassword)
                && !TextUtils.isEmpty(password)
                && !TextUtils.isEmpty(againPassword);
    }

    private boolean isValidText(String text){
        return !TextUtils.isEmpty(text);
    }



}