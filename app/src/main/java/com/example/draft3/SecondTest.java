package com.example.draft3;

import static com.example.draft3.Constants.image_select;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondTest extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Random rand = new Random();
        int second_image_test = rand.nextInt(6);
        while(second_image_test == image_select)
        {
            second_image_test = rand.nextInt(6);
        }
        if(second_image_test == 0)
        {
            setContentView(R.layout.animal_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton2 = findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(view -> {
                //whatever the image does
                TextView textView5 = findViewById(R.id.textView5);
                textView5.setText("Correct!");
                closeImageTest();
            });

            ImageButton imageButton = findViewById(R.id.imageButton);
            imageButton.setOnClickListener(view -> {
                //whatever image does
                TextView textView5 = findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton4 = findViewById(R.id.imageButton4);
            imageButton4.setOnClickListener(view -> {
                //whatever image does
                TextView textView5 = findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton3 = findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(view -> {
                //whatever image does
                TextView textView5 = findViewById(R.id.textView5);
                textView5.setText("Incorrect! Try Again!");
            });
        }
        else if(second_image_test == 1)
        {
            setContentView(R.layout.clothing_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton10 = findViewById(R.id.imageButton10);
            imageButton10.setOnClickListener(view -> {
                //whatever image does
                TextView textView6 = findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton9 = findViewById(R.id.imageButton9);
            imageButton9.setOnClickListener(view -> {
                //whatever image does
                TextView textView6 = findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton12 = findViewById(R.id.imageButton12);
            imageButton12.setOnClickListener(view -> {
                //whatever image does
                TextView textView6 = findViewById(R.id.textView6);
                textView6.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton11 = findViewById(R.id.imageButton11);
            imageButton11.setOnClickListener(view -> {
                //whatever image does
                TextView textView6 = findViewById(R.id.textView6);
                textView6.setText("Correct!");
                closeImageTest();
            });

        }
        else if(second_image_test == 2)
        {
            setContentView(R.layout.fruit_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton5 = findViewById(R.id.imageButton5);
            imageButton5.setOnClickListener(view -> {
                //whatever image does
                TextView textView7 = findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton6 = findViewById(R.id.imageButton6);
            imageButton6.setOnClickListener(view -> {
                //whatever image does
                TextView textView7 = findViewById(R.id.textView7);
                textView7.setText("Correct!");
                closeImageTest();
            });

            ImageButton imageButton7 = findViewById(R.id.imageButton7);
            imageButton7.setOnClickListener(view -> {
                //whatever image does
                TextView textView7 = findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton8 = findViewById(R.id.imageButton8);
            imageButton8.setOnClickListener(view -> {
                //whatever image does
                TextView textView7 = findViewById(R.id.textView7);
                textView7.setText("Incorrect! Try Again!");
            });
        }
        else if(second_image_test == 3)
        {
            setContentView(R.layout.shape_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton13 = findViewById(R.id.imageButton13);
            imageButton13.setOnClickListener(view -> {
                //whatever image does
                TextView textView9 = findViewById(R.id.textView9);
                textView9.setText("Correct!");
                closeImageTest();
            });

            ImageButton imageButton14 = findViewById(R.id.imageButton14);
            imageButton14.setOnClickListener(view -> {
                //whatever image does
                TextView textView9 = findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton15 = findViewById(R.id.imageButton15);
            imageButton15.setOnClickListener(view -> {
                //whatever image does
                TextView textView9 = findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton16 = findViewById(R.id.imageButton16);
            imageButton16.setOnClickListener(view -> {
                //whatever image does
                TextView textView9 = findViewById(R.id.textView9);
                textView9.setText("Incorrect! Try Again!");
            });
        }
        else if(second_image_test == 4)
        {
            setContentView(R.layout.color_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton22 = findViewById(R.id.imageButton22);
            imageButton22.setOnClickListener(view -> {
                //whatever image does
                TextView textView10 = findViewById(R.id.textView9);
                textView10.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton23 = findViewById(R.id.imageButton23);
            imageButton23.setOnClickListener(view -> {
                //whatever image does
                TextView textView10 = findViewById(R.id.textView10);
                textView10.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton24 = findViewById(R.id.imageButton24);
            imageButton24.setOnClickListener(view -> {
                //whatever image does
                TextView textView10 = findViewById(R.id.textView10);
                textView10.setText("Correct!");
                closeImageTest();
            });

            ImageButton imageButton25 = findViewById(R.id.imageButton25);
            imageButton25.setOnClickListener(view -> {
                //whatever image does
                TextView textView10 = findViewById(R.id.textView10);
                textView10.setText("Incorrect! Try Again!");
            });
        }
        else
        {
            setContentView(R.layout.furtinture_test);

            ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
            Home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {closeImageTest();}
            });

            ImageButton imageButton18 = findViewById(R.id.imageButton18);
            imageButton18.setOnClickListener(view -> {
                //whatever image does
                TextView textView8 = findViewById(R.id.textView8);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton19 = findViewById(R.id.imageButton19);
            imageButton19.setOnClickListener(view -> {
                //whatever image does
                TextView textView8 = findViewById(R.id.textView8);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton20 = findViewById(R.id.imageButton20);
            imageButton20.setOnClickListener(view -> {
                //whatever image does
                TextView textView8 = findViewById(R.id.textView8);
                textView8.setText("Incorrect! Try Again!");
            });

            ImageButton imageButton21 = findViewById(R.id.imageButton21);
            imageButton21.setOnClickListener(view -> {
                //whatever image does
                TextView textView8 = findViewById(R.id.textView8);
                textView8.setText("Correct!");
                closeImageTest();
            });
        }

    }
    public void closeImageTest(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}