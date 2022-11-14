package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class HelpScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);

        // Police button
        ImageButton button_police = (ImageButton) findViewById(R.id.policeButton);
        button_police.setOnClickListener(view-> closeHelpScreen());

        // Parking Button
        ImageButton button_parking = (ImageButton) findViewById(R.id.imageButtonPARKINGSIGN);
        button_parking.setOnClickListener(view-> closeHelpScreen());

        // Uber Button
        ImageButton button_uber = (ImageButton) findViewById(R.id.imageButtonUBER_BUTTON);
        button_uber.setOnClickListener(view-> closeHelpScreen());

        // Edit Button
        Button edit = (Button) findViewById(R.id.buttonEDIT);
        edit.setOnClickListener(view -> openEditScreen());

        // Home button to take the user back to the Main Activity
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton27);
        Home.setOnClickListener(view -> closeHelpScreen());
    }
    // UDF to take the user to the edit settings screen
    public void openEditScreen(){
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
    // UDF to take the user back to Main
    public void closeHelpScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
