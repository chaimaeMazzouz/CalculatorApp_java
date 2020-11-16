package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNum = "";
    String op = "+";
    boolean isNewOp =true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if (isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId())
        {
            case R.id.buZero:
                number+="0";
                break;
            case R.id.bu1:
                number+="1";
                break;
            case R.id.bu2:
                number+="2";
                break;
            case R.id.bu3:
                number+="3";
                break;
            case R.id.bu4:
                number+="4";
                break;
            case R.id.bu5:
                number+="5";
                break;
            case R.id.bu6:
                number+="6";
                break;
            case R.id.bu7:
                number+="7";
                break;
            case R.id.bu8:
                number+="8";
                break;
            case R.id.bu9:
                number+="9";
                break;
            case R.id.buMinus:
                number+="-";
                break;
            case R.id.buDot:
                number+=".";
                break;
        }
    }

    public void operaterEvent(View view) {
        isNewOp = true;
        oldNum= ed1.getText().toString();
        switch (view.getId())
        {
            case R.id.budivide: op = "/";break;
            case R.id.buMultiple: op = "*";break;
            case R.id.buPlus: op = "+";break;
            case R.id.buMinus: op = "-";break;
        }
    }

    public void EqualEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op)
        {
            case "+":
                result = Double.parseDouble(oldNum) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNum) - Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNum) / Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNum) * Double.parseDouble(newNumber);
                break;

        }
        ed1.setText(result+"");
    }
}
