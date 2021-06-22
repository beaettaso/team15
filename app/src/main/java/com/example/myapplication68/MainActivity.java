package com.example.myapplication68;

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
        Button btn = (Button)findViewById(R.id.button4);
        Button btn1 = (Button)findViewById(R.id.button5);
        Button btn2 = (Button)findViewById(R.id.button6);
        Button btn3 = (Button)findViewById(R.id.button7);
        Button btn4 = (Button)findViewById(R.id.button8);
        Button btn5 = (Button)findViewById(R.id.button9);
        Button btn6 = (Button)findViewById(R.id.button10);
        Button btn7 = (Button)findViewById(R.id.button11);

        btn.setOnClickListener(a1);
        btn1.setOnClickListener(a2);
        btn2.setOnClickListener(a3);
        btn3.setOnClickListener(a4);
        btn4.setOnClickListener(a5);
        btn5.setOnClickListener(a6);
        btn6.setOnClickListener(a7);
        btn7.setOnClickListener(a8);

    }

    View.OnClickListener a1 =
            new View.OnClickListener() {
            public void onClick(View v) {
            double x, y, z;
            EditText text = findViewById(R.id.editText3);
            EditText text1 = findViewById(R.id.editText4);
            x = Double.parseDouble(text.getText().toString());
            y = Double.parseDouble(text1.getText().toString());
            z = x + y;
            TextView result = (TextView) findViewById(R.id.output);
            result.setText(Double.toString(z));
        }
            };
    View.OnClickListener a2 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    double x, y, z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    x = Double.parseDouble(text.getText().toString());
                    y = Double.parseDouble(text1.getText().toString());
                    z = x - y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Double.toString(z));
                }
            };
    View.OnClickListener a3 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    double x, y, z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    x = Double.parseDouble(text.getText().toString());
                    y = Double.parseDouble(text1.getText().toString());
                    z = x * y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Double.toString(z));
                }
            };
    View.OnClickListener a4 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    double x, y, z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    x = Double.parseDouble(text.getText().toString());
                    y = Double.parseDouble(text1.getText().toString());
                    z = x /  y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Double.toString(z));
                }
            };
    View.OnClickListener a5 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    int  z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    int x = Integer.parseInt(text.getText().toString());
                    int y = Integer.parseInt(text1.getText().toString());
                    z = x + y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Integer.toBinaryString(z));
                }
            };
    View.OnClickListener a6 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    int z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    int x = Integer.parseInt(text.getText().toString());
                    int y = Integer.parseInt(text1.getText().toString());
                    z = x - y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Integer.toBinaryString(z));
                }
            };
    View.OnClickListener a7 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    int z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    int x = Integer.parseInt(text.getText().toString());
                    int y = Integer.parseInt(text1.getText().toString());
                    z = x + y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Integer.toHexString(z));
                }
            };
    View.OnClickListener a8 =
            new View.OnClickListener() {
                public void onClick(View v) {
                    int z;
                    EditText text = findViewById(R.id.editText3);
                    EditText text1 = findViewById(R.id.editText4);
                    int x = Integer.parseInt(text.getText().toString());
                    int y = Integer.parseInt(text1.getText().toString());
                    z = x - y;
                    TextView result = (TextView) findViewById(R.id.output);
                    result.setText(Integer.toHexString(z));
                }
            };


}
