package com.example.draft3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SobrietyTestMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_sobriety_test);
        Button button40 = (Button) findViewById(R.id.sentence_checker);
        button40.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                TakeImageTest();

                //we need a function for when we do the sentence checker
            }

        });
        Button button10 = (Button) findViewById(R.id.image_test);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TakeImageTest();            }

        });
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSobrietyTestMenu();
            }
        });
    }
    public void TakeImageTest(){
        Intent intent = new Intent(this, ImageTest.class);
        startActivity(intent);
    }
    public void closeSobrietyTestMenu(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}