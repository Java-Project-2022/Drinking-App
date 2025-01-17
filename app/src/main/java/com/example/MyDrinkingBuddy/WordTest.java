package com.example.MyDrinkingBuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;
import java.util.Random;

// Word test that generates a random string for the user to re-enter into a textbox
// Strings get longer progressively over a period of 3 tests

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

        ImageButton Home = findViewById(R.id.imageButton26);
        Home.setOnClickListener(view -> closeWordTest());

        //generate a random number for the length of the random word
        Random rand = new Random();
        int length = 5 + rand.nextInt(5);
        StringBuilder sb = new StringBuilder();

        //generate word (level 1)
        for (int i = 0; i < length; i++) {
            character_select = rand.nextInt(42);
            sb.append(characters[character_select]);
        }

        word = sb.toString();
        TextView textView20 = findViewById(R.id.textView20);

        //display random word
        textView20.setText(word);
        EditText random_word = findViewById(R.id.random_word);
        Button button6 = findViewById(R.id.button6);

        //decides if user entered in word correctly
        button6.setOnClickListener(v -> {
            user_word = random_word.getText().toString();
            TextView textView21 = findViewById(R.id.textView21);
            if (Objects.equals(user_word, word)) {
                textView21.setText("Correct!");
                random_word.setText("");
                Test2();
            } else {
                textView21.setText("Incorrect!  Try Again!");
                random_word.setText("");
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void Test2(){

        //generate length of word (level 2)
        Random rand = new Random();
        int length = 10 + rand.nextInt(5);
        StringBuilder sb = new StringBuilder();

        //generate word
        for (int i = 0; i < length; i++) {
            character_select = rand.nextInt(42);
            sb.append(characters[character_select]);
        }
        word = sb.toString();
        TextView textView20 = findViewById(R.id.textView20);

        //display word
        textView20.setText(word);
        EditText random_word = findViewById(R.id.random_word);
        Button button6 = findViewById(R.id.button6);

        //check if user inputs word correctly
        button6.setOnClickListener(v -> {
            user_word = random_word.getText().toString();
            TextView textView21 = findViewById(R.id.textView21);
            if (Objects.equals(user_word, word)) {
                textView21.setText("Correct!");
                random_word.setText("");
               Test3();
            } else {
                textView21.setText("Incorrect!  Try Again!");
                random_word.setText("");
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void Test3() {

        //generate length of random word (level 3)
        Random rand = new Random();
        int length = 15 + rand.nextInt(5);
        StringBuilder sb = new StringBuilder();

        //generate random word
        for (int i = 0; i < length; i++) {
            character_select = rand.nextInt(42);
            sb.append(characters[character_select]);
        }
        word = sb.toString();
        TextView textView20 = findViewById(R.id.textView20);

        //display word
        textView20.setText(word);
        EditText random_word = findViewById(R.id.random_word);
        Button button6 = findViewById(R.id.button6);

        //check if user enters word in correctly
        button6.setOnClickListener(v -> {
            user_word = random_word.getText().toString();
            TextView textView21 = findViewById(R.id.textView21);
            if (Objects.equals(user_word, word)) {
                textView21.setText("Correct!");
                random_word.setText("");
                closeWordTest();
            } else {
                textView21.setText("Incorrect!  Try Again!");
                random_word.setText("");
            }
        });
    }

    public void closeWordTest(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}