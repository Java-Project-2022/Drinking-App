package com.example.draft3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

// Object creations and changes are ordered from top of screen to bottom

public class DrinkMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_drink);

        // Home Button
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeDrinkMenu();
            }
        });

        // Champagne Button
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton30);
        button6.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
            closeDrinkMenu();
        });

        // Beer Button
        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        button5.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
            closeDrinkMenu();
        });

        // Cocktail Button
        ImageButton button7 = (ImageButton) findViewById(R.id.image_test);
        button7.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
            closeDrinkMenu();
        });

        // Custom Button (currently Wine)
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        button4.setOnClickListener(view -> {
            openCustomDrink();
        });
    }
    // UDF to close the current menu, takes user back to Main Screen
    public void closeDrinkMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    // UDF that takes the user to the track drink screen
    public void openCustomDrink(){
        Intent intent = new Intent(this, CustomDrink.class);
        startActivity(intent);
    }
}
