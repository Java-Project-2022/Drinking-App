package com.example.MyDrinkingBuddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SobrietyTestMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_sobriety_test);

        // Sentence Test button that takes the user to the sentence test
        Button button40 = findViewById(R.id.sentence_checker);
        button40.setOnClickListener(view -> TakeSentenceTest());

        // Image Test button that takes the user to the image test
        Button button10 = findViewById(R.id.image_test);
        button10.setOnClickListener(view -> TakeImageTest());

        // Home button that takes the user back to the Main Activity
        ImageButton Home = findViewById(R.id.imageButton26);
        Home.setOnClickListener(view -> closeSobrietyTestMenu());
    }
    // UDF that takes the user to the first image test screen
    public void TakeImageTest(){
        Intent intent = new Intent(this, ImageTest.class);
        startActivity(intent);
    }
    // UDF that takes the the user to the sentence test screen
    public void TakeSentenceTest(){
        Intent intent2 = new Intent(this, WordTest.class);
        startActivity(intent2);
    }
    // UDF that takes the user back to the main screen
    public void closeSobrietyTestMenu(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}