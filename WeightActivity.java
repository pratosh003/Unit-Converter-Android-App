package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;

public class WeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        Button buttonW;
        TextView answerW;
        Spinner spinnerW1, spinnerW2;
        EditText questionW;

        buttonW = findViewById(R.id.buttonW);
        spinnerW1 = findViewById(R.id.spinnerW1);
        spinnerW2 = findViewById(R.id.spinnerW2);
        answerW = findViewById(R.id.answerW);
        questionW = findViewById(R.id.questionW);

        String[] toW = {"Grams", "Kg", "pounds", "Tons"};
        String[] fromW = {"Grams", "Kg", "pounds", "Tons"};

        ArrayAdapter adW1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, fromW);
        ArrayAdapter adW2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, toW);
        spinnerW1.setAdapter(adW1);
        spinnerW2.setAdapter(adW2);

        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valueW = Double.parseDouble(questionW.getText().toString());
                Double ansW;

                if (spinnerW1.getSelectedItem().toString() == "Grams" && spinnerW2.getSelectedItem().toString() == "Kg") {
                    ansW = valueW / 1000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Grams" && spinnerW2.getSelectedItem().toString() == "pounds") {
                    ansW = valueW / 454;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Grams" && spinnerW2.getSelectedItem().toString() == "Tons") {
                    ansW = valueW / 1000000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Kg" && spinnerW2.getSelectedItem().toString() == "Grams") {
                    ansW = valueW * 1000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Kg" && spinnerW2.getSelectedItem().toString() == "pounds") {
                    ansW = valueW * 2.205;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Kg" && spinnerW2.getSelectedItem().toString() == "Tons") {
                    ansW = valueW / 1000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "pounds" && spinnerW2.getSelectedItem().toString() == "Grams") {
                    ansW = valueW * 454;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "pounds" && spinnerW2.getSelectedItem().toString() == "Kg") {
                    ansW = valueW / 2.205;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "pounds" && spinnerW2.getSelectedItem().toString() == "Tons") {
                    ansW = valueW / 2205;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Tons" && spinnerW2.getSelectedItem().toString() == "Grams") {
                    ansW = valueW * 1000000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Tons" && spinnerW2.getSelectedItem().toString() == "Kg") {
                    ansW = valueW * 1000;
                    answerW.setText(ansW.toString());
                } else if (spinnerW1.getSelectedItem().toString() == "Tons" && spinnerW2.getSelectedItem().toString() == "pounds") {
                    ansW = valueW * 2205;
                    answerW.setText(ansW.toString());
                } else {
                    answerW.setText(valueW.toString());
                }

            }
        });
    }
}