package com.example.class_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class EditText extends AppCompatActivity {
    TextInputLayout loginInput;
    TextInputLayout passwordInput;
    TextInputEditText loginText;
    TextInputEditText passwordText;
    Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        init();

        checkButton.setOnClickListener(view -> validation(view));
    }

    private void validation(View view){
        String login = loginText.getText().toString();
        String password = passwordText.getText().toString();
        clearError();
        if (login.isEmpty()){
            loginInput.setError("Поле логина пустое");
            return;
        }
        if (password.isEmpty()){
            passwordInput.setError("Поле пароля пустое");
            return;
        }
    }

    private void clearError() {
        loginInput.setError("");
        passwordInput.setError("");
    }

    private void init(){
    loginInput = findViewById(R.id.loginInput);
    passwordInput = findViewById(R.id.passwordInput);
    loginText = findViewById(R.id.loginText);
    passwordText = findViewById(R.id.passwordText);
    }
}