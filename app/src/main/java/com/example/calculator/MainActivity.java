package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput1;
    private EditText numberInput2;
    private TextView numberOutput;

    private Button buttonIncrease;

    private Button buttonDecrease;

    private Button buttonMultiply;

    private Button buttonDevide;

    private float number1;
    private float number2;
    private float result;
    private String string;

    private int fontSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.editNumber1);
        numberInput2 = findViewById(R.id.editNumber2);
        numberOutput = findViewById(R.id.textViewOutput);
        buttonIncrease = findViewById(R.id.buttonIncrease);
        buttonDecrease = findViewById(R.id.buttonDecrease);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDevide = findViewById(R.id.buttonDevide);

        fontSize = 30;
        numberOutput.setTextSize(fontSize);

        buttonIncrease.setTextSize(fontSize);
        buttonDecrease.setTextSize(fontSize);
        buttonMultiply.setTextSize(fontSize);
        buttonDevide.setTextSize(fontSize);
    }

    public void increase(View view) {
        number1 = Integer.parseInt(numberInput1.getText().toString());
        number2 = Integer.parseInt(numberInput2.getText().toString());
        result = number1 + number2;
        string = String.format("%.2f", result);
        numberOutput.setText(string.toString());
    }

    public void decrease(View view) {
        number1 = Integer.parseInt(numberInput1.getText().toString());
        number2 = Integer.parseInt(numberInput2.getText().toString());
        result = number1 - number2;
        string = String.format("%.2f", result);
        numberOutput.setText(string.toString());
    }

    public void multiply(View view) {
        number1 = Integer.parseInt(numberInput1.getText().toString());
        number2 = Integer.parseInt(numberInput2.getText().toString());
        result = number1 * number2;
        string = String.format("%.2f", result);
        numberOutput.setText(string.toString());

    }

    public void devide(View view) {
        number1 = Integer.parseInt(numberInput1.getText().toString());
        number2 = Integer.parseInt(numberInput2.getText().toString());
        result = number1 / number2;
        string = String.format("%.2f", result);
        numberOutput.setText(string.toString());
    }
}