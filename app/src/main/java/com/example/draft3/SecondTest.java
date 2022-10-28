package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SecondTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
    public void closeSobrietyTestMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}