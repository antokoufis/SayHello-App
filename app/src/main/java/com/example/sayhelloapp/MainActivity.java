package com.example.sayhelloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText objEditTextName;
    TextView objTextViewName;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objEditTextName =  findViewById(R.id.editTextName);
        objTextViewName = findViewById(R.id.textViewName);
        
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void sayHello(View view) {
        objTextViewName.setText("Hello Dear " + objEditTextName.getText().toString());
    }
}