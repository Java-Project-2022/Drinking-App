package com.example.draft3;

import static com.example.draft3.Constants.drink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView3);
        Button button = (Button) findViewById(R.id.button);
        textView.setText(Integer.toString(drink));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrinkMenu();
            }

        });

        Button sobriety_test_button = (Button) findViewById(R.id.button2);
        sobriety_test_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSobrietyTestMenu();
            }
        });

        Button Help = (Button) findViewById(R.id.button3);
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelpScreen();
            }
        });
        ImageButton Settings = (ImageButton) findViewById(R.id.imageButton17);
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsMenu();
            }
        });
    }
    public void openDrinkMenu(){
        Intent intent = new Intent(this, DrinkMenu.class);
        startActivity(intent);
    }

    public void openSobrietyTestMenu(){
        Intent intent = new Intent(this, SobrietyTestMenu.class);
        startActivity(intent);
    }
    public void openSettingsMenu(){
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
    public void openHelpScreen(){
        Intent intent = new Intent(this, HelpScreen.class);
        startActivity(intent);
    }
}