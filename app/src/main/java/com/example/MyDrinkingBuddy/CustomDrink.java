package com.example.MyDrinkingBuddy;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CustomDrink extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_drink);

        final double[] oz = {0.00};
        final double[] percent = {0.00};

        // Home Button
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton28);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeCustomDrinkMenu();
            }
        });

        // TextView that displays inputted Oz
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setText(oz[0] + " oz");

        // EditText box that takes user input for Oz
        EditText weightIn2 = (EditText) findViewById(R.id.weightIn2);
        weightIn2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == KeyEvent.KEYCODE_ENTER) {
                    String valueOS = weightIn2.getText().toString();
                    textView18.setText(valueOS + " oz");
                    oz[0] = Integer.parseInt(valueOS);
                    return true;
                }
                else {
                    return false;
                }
            }
        });

        // TextView that displays inputted %
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setText(percent[0] + "%");

        // EditText box that takes user input for %
        EditText weightIn3 = (EditText) findViewById(R.id.weightIn3);
        weightIn3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == KeyEvent.KEYCODE_ENTER) {
                    String valuePS = weightIn3.getText().toString();
                    textView23.setText(valuePS + "%");
                    percent[0] = Integer.parseInt(valuePS);
                    return true;
                }
                else {
                    return false;
                }
            }
        });

        // Submit Button
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Constants.drink++;
            CalcService.addDrink(SettingsData.weight, SettingsData.gender, oz[0], percent[0]);
            //if(CalcService.loopActive == 0) {
            //    CalcService.bacLoop();
            //}
        });
    }
    // UDF to close the current menu, takes user back to Main Screen
    public void closeCustomDrinkMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}