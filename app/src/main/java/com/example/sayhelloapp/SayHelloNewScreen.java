package com.example.sayhelloapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class SayHelloNewScreen extends AppCompatActivity {
    TextView objTextViewNameNewScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello_new_screen);
//Obtain references to objects
        objTextViewNameNewScreen = findViewById(R.id.textViewNameNewScreen);
//Get Bundle from the Intent
        Bundle extras = getIntent().getExtras();
//If there are data passed in the Intent
        if (extras != null) {
//Retrieve data passed in the Intent
            CharSequence userText = extras.getCharSequence("savedUserText");
//For debugging: print in the Logact (Debug level)
            Log.d("SayHelloNewScreen.java",userText.toString());
//Update the UI
            objTextViewNameNewScreen.setText("Hello Dear " + userText);
        }
    }
}