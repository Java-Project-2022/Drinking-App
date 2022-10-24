package com.example.draft3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalTest extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(R.layout.activity_animal_test);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openDrinkMenu();

            }
        });
    }
}
