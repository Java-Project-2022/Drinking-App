package com.example.draft3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DrinkMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_drink);

        // Lower "Done" Button
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Constants.drink++;
            CalcData.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            closeDrinkMenu();
        });
        // Lower ImageButton
        ImageButton button7 = (ImageButton) findViewById(R.id.image_test);
        button7.setOnClickListener(view -> {
            Constants.drink++;
            CalcData.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            closeDrinkMenu();
        });
        // Upper "Done" Button
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            Constants.drink++;
            CalcData.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            closeDrinkMenu();
        });
        // Upper ImageButton
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton30);
        button6.setOnClickListener(view -> {
            Constants.drink++;
            CalcData.addDrink(SettingsData.weight, SettingsData.gender, 12, 0.05);
            closeDrinkMenu();
        });
        // Home Button
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeDrinkMenu();
            }
        });
    }
    // UDF to close the current menu, takes user back to Main Screen
    public void closeDrinkMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
