package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_edit);

        TextView textView22 = (TextView) findViewById(R.id.textView22);
        if(SettingsData.gender == 'M') {
            textView22.setText("Male");
        }
        else if(SettingsData.gender == 'F') {
            textView22.setText("Female");
        }
        else {
            textView22.setText("Unknown");
        }

        // Male Button sets the user's gender to male
        Button btM = (Button) findViewById(R.id.buttonM);
        btM.setOnClickListener(e -> {
            SettingsData.gender = 'M';
            textView22.setText("Male");
        });

        // Female Button sets the user's gender to Female
        Button btF = (Button) findViewById(R.id.buttonF);
        btF.setOnClickListener(e -> {
            SettingsData.gender = 'F';
            textView22.setText("Female");
        });

        // Done button to take the user back to the settings screen
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(view -> closeSettingsEditMenu());

        // Home button to take user back to the main activity
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeToHomeMenu());
    }
    // UDF to take the user to the settings menu
    public void closeSettingsEditMenu() {
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
    // UDF to take the user back to Main
    public void closeToHomeMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


