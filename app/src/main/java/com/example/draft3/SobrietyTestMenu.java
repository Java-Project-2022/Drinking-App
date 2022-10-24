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
        setContentView(R.layout.activity_track_drink);
        Button button40 = (Button) findViewById(R.id.button4);
        button40.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Constants.drink++;
                closeSobrietyTestMenu();
            }

        });
        Button button10 = (Button) findViewById(R.id.button7);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.drink++;
                closeSobrietyTestMenu();            }

        });
    }
    public void closeSobrietyTestMenuMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}