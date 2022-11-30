package com.example.MyDrinkingBuddy;

import static com.example.MyDrinkingBuddy.Constants.image_select;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

// Tests the user's ability to differentiate between different objects
// Cycles through two different tests which are randomly chosen

public class ImageTest extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Random rand = new Random();
        image_select = rand.nextInt(6);

        if(image_select == 0)
        {
            setContentView(R.layout.animal_test);

            ImageButton Home = findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(view -> {
                //cow image
                TextView textView5 = (TextView) findViewById(R.id.textView5);
                textView5.setText("Correct!");
                nextTest();
            });

            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
            imageButton.setOnClickListener(view -> {
                //cat image
                TextView textView5 = (TextView) findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
            imageButton4.setOnClickListener(view -> {
                //dog image
                TextView textView5 = (TextView) findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(view -> {
                //squirrel image
                TextView textView5 = (TextView) findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });
        }
        else if(image_select == 1)
        {
            setContentView(R.layout.clothing_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
            imageButton10.setOnClickListener(view -> {
                //shirt image
                TextView textView6 = (TextView) findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
            imageButton9.setOnClickListener(view -> {
                //pants image
                TextView textView6 = (TextView) findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
            imageButton12.setOnClickListener(view -> {
                //sock image
                TextView textView6 = (TextView) findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
            imageButton11.setOnClickListener(view -> {
                //shoes image
                TextView textView6 = (TextView) findViewById(R.id.textView6);
                textView6.setText("Correct!");
                nextTest();
            });

        }
        else if(image_select == 2)
        {
            setContentView(R.layout.fruit_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
            imageButton5.setOnClickListener(view -> {
                //apple image
                TextView textView7 = (TextView) findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
            imageButton6.setOnClickListener(view -> {
                //grapes image
                TextView textView7 = (TextView) findViewById(R.id.textView7);
                textView7.setText("Correct!");
                nextTest();
            });

            ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
            imageButton7.setOnClickListener(view -> {
                //peach image
                TextView textView7 = (TextView) findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
            imageButton8.setOnClickListener(view -> {
                //pineapple image
                TextView textView7 = (TextView) findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });
        }
        else if(image_select == 3)
        {
            setContentView(R.layout.shape_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
            imageButton13.setOnClickListener(view -> {
                //circle image
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                textView9.setText("Correct!");
                nextTest();
            });

            ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
            imageButton14.setOnClickListener(view -> {
                //octogon image
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
            imageButton15.setOnClickListener(view -> {
                //square image
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
            imageButton16.setOnClickListener(view -> {
                //triangle image
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });
        }
        else if(image_select == 4)
        {
            setContentView(R.layout.color_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);
            imageButton22.setOnClickListener(view -> {
                //blue image
                TextView textView10 = (TextView) findViewById(R.id.textView9);
                textView10.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton23 = (ImageButton) findViewById(R.id.imageButton23);
            imageButton23.setOnClickListener(view -> {
                //orange image
                TextView textView10 = (TextView) findViewById(R.id.textView9);
                textView10.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton24 = (ImageButton) findViewById(R.id.imageButton24);
            imageButton24.setOnClickListener(view -> {
                //purple image
                TextView textView10 = (TextView) findViewById(R.id.textView9);
                textView10.setText("Correct!");
                nextTest();
            });

            ImageButton imageButton25 = (ImageButton) findViewById(R.id.imageButton25);
            imageButton25.setOnClickListener(view -> {
                //yellow image
                TextView textView10 = (TextView) findViewById(R.id.textView9);
                textView10.setText("Incorrect! Try Again!");
            });
        }
        else
        {
            setContentView(R.layout.furtinture_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(view -> closeImageTest());

            ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
            imageButton18.setOnClickListener(view -> {
                //bed image
                TextView textView8 = (TextView) findViewById(R.id.textView9);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
            imageButton19.setOnClickListener(view -> {
                //chair image
                TextView textView8 = (TextView) findViewById(R.id.textView9);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
            imageButton20.setOnClickListener(view -> {
                //couch image
                TextView textView8 = (TextView) findViewById(R.id.textView9);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
            imageButton21.setOnClickListener(view -> {
                //table image
                TextView textView8 = (TextView) findViewById(R.id.textView9);
                textView8.setText("Correct!");
                nextTest();
            });
        }

    }
    public void nextTest(){
        Intent intent = new Intent(this, SecondTest.class);
        startActivity(intent);
    }
    public void closeImageTest(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}