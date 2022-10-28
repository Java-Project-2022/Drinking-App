package com.example.draft3;

import static com.example.draft3.Constants.drink;
import static com.example.draft3.Constants.image_select;

import android.annotation.SuppressLint;
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
        image_select = rand.nextInt(6);

        if(image_select == 0)
        {
            setContentView(R.layout.animal_test);
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever the image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Correct!");
                    nextTest();
                }
            });

            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
            imageButton.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
            imageButton4.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView5 = (TextView) findViewById(R.id.textView5);
                    textView5.setText("Incorrect! Try Again!");
                }
            });
        }
        else if(image_select == 1)
        {
            setContentView(R.layout.clothing_test);
            ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
            imageButton10.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView6 = (TextView) findViewById(R.id.textView6);
                    textView6.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
            imageButton9.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView6 = (TextView) findViewById(R.id.textView6);
                    textView6.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
            imageButton12.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView6 = (TextView) findViewById(R.id.textView6);
                    textView6.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
            imageButton11.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView6 = (TextView) findViewById(R.id.textView6);
                    textView6.setText("Correct!");
                    nextTest();
                }
            });

        }
        else if(image_select == 2)
        {
            setContentView(R.layout.fruit_test);

            ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
            imageButton5.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView7 = (TextView) findViewById(R.id.textView7);
                    textView7.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
            imageButton6.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView7 = (TextView) findViewById(R.id.textView7);
                    textView7.setText("Correct!");
                    nextTest();
                }
            });

            ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
            imageButton7.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView7 = (TextView) findViewById(R.id.textView7);
                    textView7.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
            imageButton8.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView7 = (TextView) findViewById(R.id.textView7);
                    textView7.setText("Incorrect! Try Again!");
                }
            });
        }
        else if(image_select == 3)
        {
            setContentView(R.layout.shape_test);

            ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
            imageButton13.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView9 = (TextView) findViewById(R.id.textView9);
                    textView9.setText("Correct!");
                    nextTest();
                }
            });

            ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
            imageButton14.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView9 = (TextView) findViewById(R.id.textView9);
                    textView9.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
            imageButton15.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView9 = (TextView) findViewById(R.id.textView9);
                    textView9.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
            imageButton16.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView9 = (TextView) findViewById(R.id.textView9);
                    textView9.setText("Incorrect! Try Again!");
                }
            });
        }
        else if(image_select == 4)
        {
            setContentView(R.layout.color_test);

            ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);
            imageButton22.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView10 = (TextView) findViewById(R.id.textView9);
                    textView10.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton23 = (ImageButton) findViewById(R.id.imageButton23);
            imageButton23.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView10 = (TextView) findViewById(R.id.textView9);
                    textView10.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton24 = (ImageButton) findViewById(R.id.imageButton24);
            imageButton24.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView10 = (TextView) findViewById(R.id.textView9);
                    textView10.setText("Correct!");
                    nextTest();
                }
            });

            ImageButton imageButton25 = (ImageButton) findViewById(R.id.imageButton25);
            imageButton25.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView10 = (TextView) findViewById(R.id.textView9);
                    textView10.setText("Incorrect! Try Again!");
                }
            });
        }
        else
        {
            setContentView(R.layout.furtinture_test);

            ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
            imageButton18.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView8 = (TextView) findViewById(R.id.textView9);
                    textView8.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
            imageButton19.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView8 = (TextView) findViewById(R.id.textView9);
                    textView8.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
            imageButton20.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView8 = (TextView) findViewById(R.id.textView9);
                    textView8.setText("Incorrect! Try Again!");
                }
            });

            ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
            imageButton21.setOnClickListener(new View.OnClickListener(){
                @SuppressLint("SetTextI18n")
                public void onClick(View view) {
                    //whatever image does
                    TextView textView8 = (TextView) findViewById(R.id.textView9);
                    textView8.setText("Correct!");
                    nextTest();
                }
            });
        }

    }
    public void nextTest(){
        Intent intent = new Intent(this, SecondTest.class);
        startActivity(intent);
    }
}