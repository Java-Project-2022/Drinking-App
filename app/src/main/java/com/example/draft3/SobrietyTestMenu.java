package com.example.draft3;

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

        Button button40 = (Button) findViewById(R.id.sentence_checker);
        button40.setOnClickListener(view -> TakeSentenceTest());

        Button button10 = (Button) findViewById(R.id.image_test);
        button10.setOnClickListener(view -> TakeImageTest());

        ImageButton Home = (ImageButton) findViewById(R.id.imageButton26);
        Home.setOnClickListener(view -> closeSobrietyTestMenu());
    }
    public void TakeImageTest(){
        Intent intent = new Intent(this, ImageTest.class);
        startActivity(intent);
    }

    public void TakeSentenceTest(){
        Intent intent2 = new Intent(this, WordTest.class);
        startActivity(intent2);
    }

    public void closeSobrietyTestMenu(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}