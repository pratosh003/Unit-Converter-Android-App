package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

    }
    public void openActivity1(View view){
        Intent w = new Intent(this, WeightActivity.class);
        startActivity(w);
    }
    public void openActivity2(View view){
        Intent l = new Intent(this, LengthActivity.class);
        startActivity(l);
    }
    public void openActivity3(View view){
        Intent t = new Intent(this, TimeActivity.class);
        startActivity(t);
    }
    public void openActivity4(View view){
        Intent te = new Intent(this, TempActivity.class);
        startActivity(te);
    }
}