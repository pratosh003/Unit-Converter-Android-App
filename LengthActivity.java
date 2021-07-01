package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {
    Button buttonL;
    Spinner spinnerL1, spinnerL2;
    TextView answerL;
    EditText questionL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        buttonL = findViewById(R.id.buttonL);
        spinnerL1 = findViewById(R.id.spinnerL1);
        spinnerL2 = findViewById(R.id.spinnerL2);
        answerL = findViewById(R.id.answerL);
        questionL = findViewById(R.id.questionL);

        String[] toL = {"Meters", "Centimeters", "Millimeters", "Inches", "Foot"};
        String[] fromL = {"Meters", "Centimeters", "Millimeters", "Inches", "Foot"};

        ArrayAdapter adL1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromL);
        ArrayAdapter adL2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, toL);
        spinnerL1.setAdapter(adL1);
        spinnerL2.setAdapter(adL2);

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valueL = Double.parseDouble(questionL.getText().toString());
                Double ansL;

                if(spinnerL1.getSelectedItem().toString() == "Meters" && spinnerL2.getSelectedItem().toString() == "Centimeters"){
                    ansL = valueL * 100;
                    answerL.setText(ansL.toString());
                }
                else if (spinnerL1.getSelectedItem().toString() == "Meters" && spinnerL2.getSelectedItem().toString() == "Millimeters"){
                    ansL = valueL * 1000;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Meters" && spinnerL2.getSelectedItem().toString() == "Inches"){
                    ansL = valueL * 39.37;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Meters" && spinnerL2.getSelectedItem().toString() == "Foot"){
                    ansL = valueL * 3.281;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Meters" && spinnerL2.getSelectedItem().toString() == "Miles"){
                    ansL = valueL/1609;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Millimeters" && spinnerL2.getSelectedItem().toString() == "Meters"){
                    ansL = valueL/1000;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Millimeters" && spinnerL2.getSelectedItem().toString() == "Centimeters"){
                    ansL = valueL / 10;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Millimeters" && spinnerL2.getSelectedItem().toString() == "Foot"){
                    ansL = valueL/305;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Millimeters" && spinnerL2.getSelectedItem().toString() == "Inches"){
                    ansL = valueL / 25.4;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Millimeters" && spinnerL2.getSelectedItem().toString() == "Miles"){
                    ansL = valueL/1.609E6;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Centimeters" && spinnerL2.getSelectedItem().toString() == "Meters"){
                    ansL = valueL/100;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Centimeters" && spinnerL2.getSelectedItem().toString() == "Millimeters"){
                    ansL = valueL * 10;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Centimeters" && spinnerL2.getSelectedItem().toString() == "Inches"){
                    ansL = valueL/2.54;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Centimeters" && spinnerL2.getSelectedItem().toString() == "Foot"){
                    ansL = valueL/30.48;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Centimeters" && spinnerL2.getSelectedItem().toString() == "Miles"){
                    ansL = valueL/160934;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Inches" && spinnerL2.getSelectedItem().toString() == "Meters"){
                    ansL = valueL/39.37;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Inches" && spinnerL2.getSelectedItem().toString() == "Millimeters"){
                    ansL = valueL * 25.4;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Inches" && spinnerL2.getSelectedItem().toString() == "Centimeters"){
                    ansL = valueL * 2.54;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Inches" && spinnerL2.getSelectedItem().toString() == "Foot"){
                    ansL = valueL/12;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Inches" && spinnerL2.getSelectedItem().toString() == "Miles"){
                    ansL = valueL/63360;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Foot" && spinnerL2.getSelectedItem().toString() == "Meters"){
                    ansL = valueL/3.281;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Foot" && spinnerL2.getSelectedItem().toString() == "Centimeters"){
                    ansL = valueL*30.45;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Foot" && spinnerL2.getSelectedItem().toString() == "Millimeters"){
                    ansL = valueL*305;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Foot" && spinnerL2.getSelectedItem().toString() == "Inches"){
                    ansL = valueL*12;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Foot" && spinnerL2.getSelectedItem().toString() == "Miles"){
                    ansL = valueL/5280;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Miles" && spinnerL2.getSelectedItem().toString() == "Foot"){
                    ansL = valueL*5280;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Miles" && spinnerL2.getSelectedItem().toString() == "Meters"){
                    ansL = valueL*1609;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Miles" && spinnerL2.getSelectedItem().toString() == "Centimeters"){
                    ansL = valueL*160934;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Miles" && spinnerL2.getSelectedItem().toString() == "Millimeters"){
                    ansL = valueL*1.609e+6;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == "Miles" && spinnerL2.getSelectedItem().toString() == "Inches"){
                    ansL = valueL*63360;
                    answerL.setText(ansL.toString());
                }
                else if(spinnerL1.getSelectedItem().toString() == spinnerL2.getSelectedItem().toString()){
                    answerL.setText(valueL.toString());
                }
                else{
                    answerL.setText("0.0");
                }
            }
        });
    }
}