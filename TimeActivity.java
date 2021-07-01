package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;

public class TimeActivity extends AppCompatActivity {

    Button buttonT;
    Spinner spinnerT1, spinnerT2;
    TextView answerT, textView4;
    EditText questionT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        buttonT = findViewById(R.id.buttonT);
        spinnerT1 = findViewById(R.id.spinnerT1);
        spinnerT2 = findViewById(R.id.spinnerT2);
        answerT = findViewById(R.id.answerT);
        questionT = findViewById(R.id.questionT);
        textView4 = findViewById(R.id.textView4);

        String[] toT = {"Seconds", "Minutes", "Hours", "Days"};
        String[] fromT = {"Seconds", "Minutes", "Hours", "Days","Years"};

        ArrayAdapter adT1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromT);
        ArrayAdapter adT2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, toT);
        spinnerT1.setAdapter(adT1);
        spinnerT2.setAdapter(adT2);

        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double ansT;
                Double valueT = Double.parseDouble(questionT.getText().toString());
                if(spinnerT1.getSelectedItem().toString() == "Seconds" && spinnerT2.getSelectedItem().toString() == "Minutes"){
                    ansT = valueT/60;
                    answerT.setText(ansT.toString());
                }
                else if (spinnerT1.getSelectedItem().toString() == "Minutes" && spinnerT2.getSelectedItem().toString() == "Seconds"){
                    ansT = valueT * 60;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Seconds" && spinnerT2.getSelectedItem().toString() == "Hours"){
                    ansT = valueT/3600;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Hours" && spinnerT2.getSelectedItem().toString() == "Seconds"){
                    ansT = valueT * 3600;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Minutes" && spinnerT2.getSelectedItem().toString() == "hours"){
                    ansT = valueT/60;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Hours" && spinnerT2.getSelectedItem().toString() == "Minutes"){
                    ansT = valueT * 60;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Hours" && spinnerT2.getSelectedItem().toString() == "Days"){
                    ansT = valueT/24;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Days" && spinnerT2.getSelectedItem().toString() == "Hours"){
                    ansT = valueT * 24;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Minutes" && spinnerT2.getSelectedItem().toString() == "Days"){
                    ansT = valueT/1440;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Days" && spinnerT2.getSelectedItem().toString() == "Seconds"){
                    ansT = valueT * 86400;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Seconds" && spinnerT2.getSelectedItem().toString() == "Days"){
                    ansT = valueT/86400;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Years" && spinnerT2.getSelectedItem().toString() == "Days"){
                    ansT = valueT * 365;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Years" && spinnerT2.getSelectedItem().toString() == "Hours"){
                    ansT = valueT * 8760;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Years" && spinnerT2.getSelectedItem().toString() == "Minutes"){
                    ansT = valueT * 525600;
                    answerT.setText(ansT.toString());
                }
                else if(spinnerT1.getSelectedItem().toString() == "Years" && spinnerT2.getSelectedItem().toString() == "Seconds"){
                    ansT = valueT * 31536000;
                    answerT.setText(ansT.toString());
                }
                else{
                    answerT.setText(valueT.toString());
                }
            }
        });
    }

}