package org.roniseppala.harjoitus1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstIntegerString;
    private EditText secondIntegerString;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstIntegerString = findViewById(R.id.firstText);
        secondIntegerString = findViewById(R.id.secondText);
        textOutput = findViewById(R.id.textAnswer);
    }

    public void calculatePlus(View view){
        String tempFirstString;
        int tempFirst = 0;
        String tempSecondString;
        int tempSecond = 0;
        int tempAnswer = 0;

        tempFirstString = firstIntegerString.getText().toString();
        tempSecondString = secondIntegerString.getText().toString();
        
        tempFirst = tempFirst + Integer.parseInt(tempFirstString);
        tempSecond = tempSecond + Integer.parseInt(tempSecondString);

        tempAnswer = tempAnswer + tempFirst + tempSecond;

        textOutput.setText(Integer.toString(tempAnswer));
    }

    public void calculateMinus(View view){
        String tempFirstString;
        int tempFirst = 0;
        String tempSecondString;
        int tempSecond = 0;
        int tempAnswer = 0;

        tempFirstString = firstIntegerString.getText().toString();
        tempSecondString = secondIntegerString.getText().toString();

        tempFirst = tempFirst + Integer.parseInt(tempFirstString);
        tempSecond = tempSecond + Integer.parseInt(tempSecondString);

        tempAnswer = tempAnswer + tempFirst - tempSecond;

        textOutput.setText(Integer.toString(tempAnswer));
    }

    public void calculateTimes(View view){
        String tempFirstString;
        int tempFirst = 0;
        String tempSecondString;
        int tempSecond = 0;
        int tempAnswer = 0;

        tempFirstString = firstIntegerString.getText().toString();
        tempSecondString = secondIntegerString.getText().toString();

        tempFirst = tempFirst + Integer.parseInt(tempFirstString);
        tempSecond = tempSecond + Integer.parseInt(tempSecondString);

        tempAnswer = tempAnswer + (tempFirst * tempSecond);

        textOutput.setText(Integer.toString(tempAnswer));
    }

    public void calculateDivision(View view){
        String tempFirstString;
        int tempFirst = 0;
        String tempSecondString;
        int tempSecond = 0;
        int tempAnswer = 0;

        tempFirstString = firstIntegerString.getText().toString();
        tempSecondString = secondIntegerString.getText().toString();

        tempFirst = tempFirst + Integer.parseInt(tempFirstString);
        tempSecond = tempSecond + Integer.parseInt(tempSecondString);

        tempAnswer = tempAnswer + (tempFirst / tempSecond);

        textOutput.setText(Integer.toString(tempAnswer));
    }
}