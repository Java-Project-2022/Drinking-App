package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class ImageTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Random rand = new Random();
        int select_test = rand.nextInt(4);

        if(select_test == 0)
        {
            setContentView(R.layout.animal_test);
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever the image does
                }
            });

            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
            imageButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
            imageButton4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });
        }
        else if(select_test == 1)
        {
            setContentView(R.layout.clothing_test);

        }
        else if(select_test == 2)
        {
            setContentView(R.layout.fruit_test);
        }
        else
        {
            setContentView(R.layout.shape_test);
        }



        //setContentView(R.layout.select_sobriety_test);
        Button button40 = (Button) findViewById(R.id.sentence_checker);
        button40.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                closeSobrietyTestMenu();
            }

        });
        Button button10 = (Button) findViewById(R.id.image_test);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSobrietyTestMenu();            }

        });
    }
    public void closeSobrietyTestMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}