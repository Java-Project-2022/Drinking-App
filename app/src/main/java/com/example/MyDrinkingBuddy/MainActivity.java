package com.example.MyDrinkingBuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

// Object creations and changes are ordered from top of screen to bottom

public class MainActivity extends AppCompatActivity {


    public TextView textView;
    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Settings Menu ImageButton
        ImageButton Settings = findViewById(R.id.imageButton17);
        Settings.setOnClickListener(view -> openSettingsMenu());

        // Display current blood alcohol level
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("%.002f", CalcService.BAC) + "%");

        // TextView that increments by 1 when the user adds a drink
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Your No. of Drinks Tonight: " + Integer.toString(Constants.drink));


        // Track Drink Menu Button
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> openDrinkMenu());

        // Sobriety Test Menu Button
        Button sobriety_test_button = (Button) findViewById(R.id.button2);
        sobriety_test_button.setOnClickListener(view -> openSobrietyTestMenu());

        // Help Menu Button
        Button Help = (Button) findViewById(R.id.button3);
        Help.setOnClickListener(view -> openHelpScreen());
        ImageButton FAB = (ImageButton)  findViewById(R.id.sync);
        FAB.setOnClickListener(view ->  onRestart());




    }


    // UDF that takes the user to the track drink screen
    public void openDrinkMenu(){
        Intent intent = new Intent(this, DrinkMenu.class);
        startActivity(intent);
    }
    // UDF that takes the user to the sobriety test screen
    public void openSobrietyTestMenu(){
        Intent intent = new Intent(this, SobrietyTestMenu.class);
        startActivity(intent);
    }
    // UDF that takes the user to the settings screen
    public void openSettingsMenu(){
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
    // UDF that takes the user to the help screen
    public void openHelpScreen() {
        Intent intent = new Intent(this, HelpScreen.class);
        startActivity(intent);
    }
        public void refresh() {
            onRestart();
        }
        @Override
            protected void onRestart() {

                // TODO Auto-generated method stub
                super.onRestart();
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }

