package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

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

