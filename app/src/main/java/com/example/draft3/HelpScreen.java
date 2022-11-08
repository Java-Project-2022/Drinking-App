package com.example.draft3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class HelpScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);
        ImageButton button_police = (ImageButton) findViewById(R.id.policeButton);
        button_police.setOnClickListener(view-> closeHelpScreen());
        Button button20 = (Button) findViewById(R.id.buttonEDIT);
        button20.setOnClickListener(view -> closeHelpScreen());
        ImageButton Home = (ImageButton) findViewById(R.id.imageButton27);
        Home.setOnClickListener(view -> closeHelpScreen());
    }
    public void closeHelpScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
