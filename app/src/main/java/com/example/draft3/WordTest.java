package com.example.draft3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;
import java.util.Random;

public class WordTest extends AppCompatActivity {
    String user_word;
    char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '*'};
    int character_select;
    String word;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spelling_test);
        Random rand = new Random();
        int length = 5 + rand.nextInt(5);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            character_select = rand.nextInt(42);
            sb.append(characters[character_select]);
        }
        word = sb.toString();
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText(word);
        EditText random_word = (EditText) findViewById(R.id.random_word);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            user_word = random_word.getText().toString();
            TextView textView21 = (TextView) findViewById(R.id.textView21);
            if (Objects.equals(user_word, word)) {
                textView21.setText("Correct!");
                nextTest();
            } else {
                textView21.setText("Incorrect!  Try Again!");
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void nextTest(){
        Random rand = new Random();
        int length = 5 + rand.nextInt(10);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            character_select = rand.nextInt(42);
            sb.append(characters[character_select]);
        }
        word = sb.toString();
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText(word);
        EditText random_word = (EditText) findViewById(R.id.random_word);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            user_word = random_word.getText().toString();
            TextView textView21 = (TextView) findViewById(R.id.textView21);
            if (Objects.equals(user_word, word)) {
                textView21.setText("Correct!");
               //nextTest();
            } else {
                textView21.setText("Incorrect!  Try Again!");
            }
        });
    }
}