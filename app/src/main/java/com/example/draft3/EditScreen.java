package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EditScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_edit);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(view -> closeSettingsEditMenu());
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeSettingsEditMenu());
    }
    public void closeSettingsEditMenu() {
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }

    public void closeToHomeMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


