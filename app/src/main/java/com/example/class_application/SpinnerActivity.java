package com.example.class_application;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;
        import android.widget.TextView;

        import com.google.android.material.textfield.TextInputLayout;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;

public class SpinnerActivity extends AppCompatActivity {
    TextInputLayout spinner;
    AutoCompleteTextView autoText;
    TextView textCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        init();

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Bot", "Make", "Jon"));
        ArrayAdapter adapter = new ArrayAdapter( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, name);
        autoText.setAdapter(adapter);
        textCheck.setOnClickListener(view -> textCheck.setText(autoText.getText()));


    }

    private void init() {
        spinner = findViewById(R.id.spinnerInput);
        autoText = findViewById(R.id.autoText);
        textCheck = findViewById(R.id.checkText);
    }
}
