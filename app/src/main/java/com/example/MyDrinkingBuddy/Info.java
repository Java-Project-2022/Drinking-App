package com.example.MyDrinkingBuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Displays all App Developer names and a small self-rating on how the app was made

public class Info  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);


        // Home button that takes the user back to the Main Activity
        ImageButton Home = findViewById(R.id.imageButton31);
        Home.setOnClickListener(view -> closeInfoMenu());
    }

    // UDF that takes the user back to the main screen
    public void closeInfoMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
