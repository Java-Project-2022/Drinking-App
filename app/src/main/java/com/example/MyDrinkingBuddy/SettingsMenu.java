package com.example.MyDrinkingBuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Displays currently used demographic data for calculations, displays a disclaimer, and allows a user to access the info screen

public class SettingsMenu extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Displays current gender, is an average male by default
        TextView textViewG = findViewById(R.id.textView11);
        if(SettingsData.gender == 'M') {
            textViewG.setText("Male");
        }
        else if(SettingsData.gender == 'F') {
            textViewG.setText("Female");
        }
        else {
            textViewG.setText("Unknown");
        }

        // Displays current weight, is an average male by default
        TextView textViewW = findViewById(R.id.textView13);
        if(SettingsData.weight < 0) {
            textViewW.setText("Unknown");
        }
        else if(SettingsData.weight > 0) {
            textViewW.setText(SettingsData.weight + " lbs");
        }
        else {
            textViewW.setText("Unknown");
        }

        // Edit button that takes the user to the edit screen for settings
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> openEditScreen());

        // Home button that takes the user back to the Main Activity
        ImageButton Home = findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeSettingsMenu());

        //
        ImageButton Credits = findViewById(R.id.infobuttonpress);
        Credits.setOnClickListener(view -> openInfoScreen());
    }
    // UDF that takes the user back to the main screen
    public void closeSettingsMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    // UDF that takes the user to the edit screen
    public void openEditScreen(){
        Intent intent = new Intent(this, EditScreen.class);
        startActivity(intent);
    }
    // UDF that takes the user to the edit screen
    public void openInfoScreen(){
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }
}

