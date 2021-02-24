package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button btnClear, btnPlusMinus;
    TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        btnClear = findViewById(R.id.btnClear);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);

        tvNumber = findViewById(R.id.tv_number);


        View.OnClickListener button_numbers = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prevNumber = tvNumber.getText().toString();
                String pressedNumber = "";
                String resultNumber = "";

                switch(v.getId()){
                    case R.id.btn1:
                        pressedNumber = "1";

                        break;
                    case R.id.btn2:
                        pressedNumber = "2";

                        break;
                    case R.id.btn3:
                        pressedNumber = "3";

                        break;
                    case R.id.btn4:
                        pressedNumber = "4";

                        break;
                    case R.id.btn5:
                        pressedNumber = "5";

                        break;
                    case R.id.btn6:
                        pressedNumber = "6";


                        break;
                    case R.id.btn7:
                        pressedNumber = "7";

                        break;
                    case R.id.btn8:
                        pressedNumber = "8";

                        break;

                    case R.id.btn9:
                        pressedNumber = "9";


                        break;
                    case R.id.btn0:
                        pressedNumber = "0";


                        break;
                }
                if(!prevNumber.equals("0")) resultNumber = prevNumber + pressedNumber;
                else resultNumber = pressedNumber;
                tvNumber.setText(resultNumber);
            }
        };

        button1.setOnClickListener(button_numbers);
        button2.setOnClickListener(button_numbers);
        button3.setOnClickListener(button_numbers);
        button4.setOnClickListener(button_numbers);
        button5.setOnClickListener(button_numbers);
        button6.setOnClickListener(button_numbers);
        button7.setOnClickListener(button_numbers);
        button8.setOnClickListener(button_numbers);
        button9.setOnClickListener(button_numbers);
        button0.setOnClickListener(button_numbers);

        View.OnClickListener btnClearPlusMinus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btnClear:

                        tvNumber.setText("0");
                        break;
                    case R.id.btnPlusMinus:
                        String numberText = tvNumber.getText().toString();
                        int number = Integer.parseInt(numberText);

                        if (number > 0)
                            tvNumber.setText("-"+numberText);

                        else{
                            number = number * (-1);
                            tvNumber.setText("" + number);
                        }

                        break;
                }
            }
        };
        btnClear.setOnClickListener(btnClearPlusMinus);
        btnPlusMinus.setOnClickListener(btnClearPlusMinus);


    }
}