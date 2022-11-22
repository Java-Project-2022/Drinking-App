package com.example.MyDrinkingBuddy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

// Object creations and changes are ordered from top of screen to bottom

public class DrinkMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_drink);

        // Home Button
        ImageButton Home = findViewById(R.id.imageButton28);
        Home.setOnClickListener(view -> closeDrinkMenu());

        // Champagne Button
        ImageButton button6 = findViewById(R.id.imageButton30);
        button6.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
//            if(CalcService.loopActive == 0) {
//                WorkRequest uploadWorkRequest =
//                        new OneTimeWorkRequest.Builder(BACWorker.class)
//                                .build();
//                Context mycontext = null;
//                WorkManager
//                        .getInstance(mycontext)
//                        .enqueue(uploadWorkRequest);
//            }
            closeDrinkMenu();
        });

        // Beer Button
        ImageButton button5 = findViewById(R.id.imageButton5);
        button5.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
            closeDrinkMenu();
        });

        // Cocktail Button
        ImageButton button7 = findViewById(R.id.image_test);
        button7.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
            closeDrinkMenu();
        });

        // Custom Button (currently Wine)
        ImageButton button4 = findViewById(R.id.imageButton4);
        button4.setOnClickListener(view -> openCustomDrink());
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
