package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v)
    {
        EditText editText1 = (EditText)findViewById(R.id.num1);
        EditText editText2 = (EditText)findViewById(R.id.num2);
        EditText editText3 = (EditText)findViewById(R.id.answer);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int ans = n1 + n2;

        editText3.setText("Add: "+ ans);

    }

    public void subtract(View v)
    {
        EditText editText1 = (EditText)findViewById(R.id.num1);
        EditText editText2 = (EditText)findViewById(R.id.num2);
        EditText editText3 = (EditText)findViewById(R.id.answer);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int ans = n1 - n2;

        editText3.setText("Subtract: "+ ans);

    }

    public void multiply(View v)
    {
        EditText editText1 = (EditText)findViewById(R.id.num1);
        EditText editText2 = (EditText)findViewById(R.id.num2);
        EditText editText3 = (EditText)findViewById(R.id.answer);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int ans = n1 * n2;

        editText3.setText("Multiply: "+ ans);

    }

    public void divide(View v)
    {
        EditText editText1 = (EditText)findViewById(R.id.num1);
        EditText editText2 = (EditText)findViewById(R.id.num2);
        EditText editText3 = (EditText)findViewById(R.id.answer);

        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int ans = n1 / n2;

        editText3.setText("Divide: "+ ans);

    }
}