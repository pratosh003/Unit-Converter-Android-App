package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {
    Button button5;
    Spinner spinner3, spinner4;
    EditText question2;
    TextView textView3, answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        button5 = findViewById(R.id.button5);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        textView3 = findViewById(R.id.textView3);
        question2 = findViewById(R.id.question2);
        answer2 = findViewById(R.id.answer2);

        String[] from = {"Celsius", "Fahrenheit", "Kelvin"};
        String[] to = {"Fahrenheit","Celsius", "Kelvin"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner3.setAdapter(ad1);
        spinner4.setAdapter(ad2);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double ans;
                Double value = Double.parseDouble(question2.getText().toString());
                if (spinner3.getSelectedItem().toString() == "Celsius" && spinner4.getSelectedItem().toString() == "Fahrenheit") {
                    ans = (value * (9 / 5)) + 32;
                    answer2.setText(" " + ans.toString());
                }
                else if (spinner3.getSelectedItem().toString() == "Fahrenheit" && spinner4.getSelectedItem().toString() == "Kelvin") {
                    ans = (((value * 32) - 32) * (5/9)) + 273.15;
                    answer2.setText(" " + ans.toString());
                }
                else if (spinner3.getSelectedItem().toString() == "Kelvin" && spinner4.getSelectedItem().toString() == "Fahrenheit") {
                    ans = (value - 273.15) * (9/5) + 32;
                    answer2.setText(" " + ans.toString());
                }
                else if (spinner3.getSelectedItem().toString() == "Celsius" && spinner4.getSelectedItem().toString() == "Kelvin") {
                    ans = value + 273.15;
                    answer2.setText(" " + ans.toString());
                }
                else if (spinner3.getSelectedItem().toString() == "Kelvin" && spinner4.getSelectedItem().toString() == "Celsius") {
                    ans = value - 273.15;
                    answer2.setText(" " + ans.toString());
                }
                else if (spinner3.getSelectedItem().toString() == "Fahrenheit" && spinner4.getSelectedItem().toString() == "Celsius") {
                    ans = ((value * 32) - 32) * 0.56;
                    answer2.setText(" " + ans.toString());
                }
                else{
                    answer2.setText(value.toString());
                }
            }
        });
    }
}