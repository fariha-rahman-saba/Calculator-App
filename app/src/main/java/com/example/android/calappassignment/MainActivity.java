package com.example.android.calappassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonDEL, buttonAC, buttonEqual, button9, button8, button7, buttonPlus, button6,btnZero, button1, button2, button3, button4, button5,buttonInto, buttonMinus, buttonDivision,buttonDot;
    EditText edtxt;
    float mValueOne,mValueTwo;
    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt = findViewById(R.id.edTxt);
        buttonDEL = findViewById(R.id.buttonDEL);
        buttonAC = findViewById(R.id.buttonAC);
        buttonDot = findViewById(R.id.buttondot);
        buttonEqual = findViewById(R.id.buttonEqual);

        btnZero = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonInto = findViewById(R.id.buttonInto);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+".");
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxt.setText(edtxt.getText()+"");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtxt==null){
                    edtxt.setText("");
                } else{
                    mValueOne= Float.parseFloat(edtxt.getText()+"");
                    Addition = true;
                    edtxt.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtxt==null){
                    edtxt.setText("");
                } else{
                    mValueOne= Float.parseFloat(edtxt.getText()+"");
                    Subtraction = true;
                    edtxt.setText(null);
                }
            }
        });

        buttonInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtxt==null){
                    edtxt.setText("");
                } else{
                    mValueOne= Float.parseFloat(edtxt.getText()+"");
                    Multiplication = true;
                    edtxt.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtxt==null){
                    edtxt.setText("");
                } else{
                    mValueOne= Float.parseFloat(edtxt.getText()+"");
                    Division = true;
                    edtxt.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo= Float.parseFloat(edtxt.getText()+"");

                if (Addition==true)
                {
                    edtxt.setText(mValueOne+mValueTwo+"");
                    Addition = false;
                }

                if (Subtraction==true)
                {
                    edtxt.setText(mValueOne-mValueTwo+"");
                    Subtraction = false;
                }

                if (Multiplication==true)
                {
                    edtxt.setText(mValueOne*mValueTwo+"");
                    Multiplication = false;
                }

                if (Division==true)
                {
                    edtxt.setText(mValueOne/mValueTwo+"");
                    Division = false;
                }
            }
        });
    }
}