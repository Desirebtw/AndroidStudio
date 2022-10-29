package com.example.class_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.editText).setOnClickListener(view -> {
            startActivity(new Intent(this, EditText.class));
        });
        findViewById(R.id.spinner).setOnClickListener(view ->
                startActivity(new Intent(this, SpinnerActivity.class)));

        findViewById(R.id.buttons).setOnClickListener(view ->
                startActivity(new Intent(this, ButtonActivity.class)));
    }


}