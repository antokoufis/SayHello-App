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

        if (savedInstanceState != null){
//Retrieve data from the Bundle (other methods include getInt(), getBoolean() etc)
            CharSequence userText = savedInstanceState.getCharSequence("savedUserText");
            CharSequence displayText = savedInstanceState.getCharSequence("savedDisplayText");
//Restore the dynamic state of the UI
            objEditTextName.setText(userText);
            objTextViewName.setText(displayText);
        }
        else{
//Initialize the UI
            objEditTextName.setText("");
            objEditTextName.setHint("Name");
            objTextViewName.setText("TextView");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save data to the Bundle (other methods include putInt(), putBoolean() etc)
        CharSequence userText = objEditTextName.getText();
        outState.putCharSequence("savedUserText", userText);
        CharSequence displayText = objTextViewName.getText();
        outState.putCharSequence("savedDisplayText", displayText);
    }

    public void sayHello(View view) {
        objTextViewName.setText("Hello Dear " + objEditTextName.getText().toString());
    }
}