package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // R: resource object, contains all the resources ie buttons, text boxes
        Button addBtn = (Button)findViewById(R.id.addBtn);
        Button minusBtn = (Button)findViewById(R.id.minusBtn);
        Button multBtn = (Button)findViewById(R.id.multBtn);
        Button divBtn = (Button)findViewById(R.id.divBtn);
        Button swapBtn = (Button)findViewById(R.id.swapBtn);




        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secNumEditText = (EditText)findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextview);
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secNumEditText.getText().toString());

                int result = num1 + num2;
                resultTextView.setText(result+"");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secNumEditText = (EditText)findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextview);
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secNumEditText.getText().toString());

                int result = num1 - num2;
                resultTextView.setText(result+"");
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secNumEditText = (EditText)findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextview);
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secNumEditText.getText().toString());

                int result = num1 * num2;
                resultTextView.setText(result+"");
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secNumEditText = (EditText)findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextview);
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secNumEditText.getText().toString());

                double result = (double)num1 / (double)num2;
                resultTextView.setText(result+"");
            }
        });

        swapBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secNumEditText = (EditText)findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextview);


                try {
                    int result = Integer.parseInt(resultTextView.getText().toString());
                    firstNumEditText.setText("" + result);
                }
                catch (Throwable e){
                    firstNumEditText.setText("");
                }

                secNumEditText.setText("");
            }
        });
    }
}
