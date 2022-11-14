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
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(view -> openEditScreen());
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeSettingsMenu());
    }
    public void closeSettingsMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openEditScreen(){
        Intent intent = new Intent(this, EditScreen.class);
        startActivity(intent);
    }
}

