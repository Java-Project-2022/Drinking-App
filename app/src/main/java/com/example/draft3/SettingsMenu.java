package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView textViewG = (TextView) findViewById(R.id.textView11);
        if(SettingsData.gender == 'M') {
            textViewG.setText("Male");
        }
        else if(SettingsData.gender == 'F') {
            textViewG.setText("Female");
        }
        else {
            textViewG.setText("Unknown");
        }

        TextView textViewW = (TextView) findViewById(R.id.textView13);
        textViewW.setText("Unknown");

        // Edit button that takes the user to the edit screen for settings
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> openEditScreen());

        // Home button that takes the user back to the Main Activity
        ImageButton Home = findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeSettingsMenu());
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
}

