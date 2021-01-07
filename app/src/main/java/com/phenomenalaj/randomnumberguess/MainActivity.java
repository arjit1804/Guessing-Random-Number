package com.phenomenalaj.randomnumberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rn = new Random();
        random_number = rn.nextInt(20) + 1;
    }

    public void btClick(View view){
        EditText et1 = findViewById(R.id.num1);
        int n = Integer.parseInt(et1.getText().toString());

        if(n > random_number)
            Toast.makeText(this, "Guess a Smaller Number!", Toast.LENGTH_SHORT).show();
        else if(n < random_number)
            Toast.makeText(this, "Guess a Larger Number!", Toast.LENGTH_SHORT).show();
        else if(n == random_number) {
            Toast.makeText(this, "Congrats! You got it right.  Try Again!", Toast.LENGTH_SHORT).show();
            Random rn = new Random();
            random_number = rn.nextInt(20) + 1;
        }
    }
}