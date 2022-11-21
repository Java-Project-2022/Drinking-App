package com.example.MyDrinkingBuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_edit);

        // Displays current gender held in calculation settings if there is a value, otherwise is set to "Unknown"
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

        // Displays current weight held in calculation settings if there is a value greater than 0, otherwise displays "Unknown"
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        if(SettingsData.weight < 0) {
            textView14.setText("Unknown");
        }
        else if(SettingsData.weight > 0) {
            textView14.setText(Integer.toString(SettingsData.weight));
        }
        else {
            textView14.setText("Unknown");
        }

        // Number box for user input, sends and int to settingsdata and displays results in the above textview
        EditText weightIn = (EditText) findViewById(R.id.weightIn);
        weightIn.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == KeyEvent.KEYCODE_ENTER) {
                    String valueWS = weightIn.getText().toString();
                    int valueWI = Integer.parseInt(valueWS);
                    textView14.setText(valueWS + " lbs");
                    SettingsData.weight = valueWI;
                    return true;
                }
                else {
                    return false;
                }
            }
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

