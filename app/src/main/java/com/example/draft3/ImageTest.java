package com.example.draft3;

import static com.example.draft3.Constants.drink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

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
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Correct!");
                    nextTest();
                }
            });

            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
            imageButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect");
                }
            });

            ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
            imageButton4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect");
                }
            });

            ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect");
                }
            });
        }
        else if(select_test == 1)
        {
            setContentView(R.layout.clothing_test);
            ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
            imageButton10.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
            imageButton9.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
            imageButton12.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
            imageButton11.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

        }
        else if(select_test == 2)
        {
            setContentView(R.layout.fruit_test);

            ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
            imageButton5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
            imageButton6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
            imageButton7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
            imageButton8.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });
        }
        else
        {
            setContentView(R.layout.shape_test);

            ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
            imageButton13.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
            imageButton14.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
            imageButton15.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });

            ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
            imageButton16.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    //whatever image does
                }
            });
        }

    }
    public void nextTest(){
        Intent intent = new Intent(this, SecondTest.class);
        startActivity(intent);
    }
}