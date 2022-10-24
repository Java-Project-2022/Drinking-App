package com.example.draft3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobrietyTestMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_sobriety_test);
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