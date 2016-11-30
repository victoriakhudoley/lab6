package com.lab6.supercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnPlus, btnMinus, btnMult, btnDiv, btnToHex, btnToBin, btnMod, btnXor, btnCopy;
    EditText x, y, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button) findViewById(R.id.buttonPlus);
        btnMinus = (Button) findViewById(R.id.buttonMinus);
        btnDiv = (Button) findViewById(R.id.buttonDiv);
        btnMult = (Button) findViewById(R.id.buttonMult);
        btnToHex = (Button) findViewById(R.id.buttonHex);
        btnToBin = (Button) findViewById(R.id.buttonBin);
        btnMod = (Button) findViewById(R.id.buttonMod);
        btnXor = (Button) findViewById(R.id.buttonXor);
        btnCopy = (Button) findViewById(R.id.buttonCopy);

        x = (EditText) findViewById(R.id.editTextX);
        y = (EditText) findViewById(R.id.editTextY);
        r = (EditText) findViewById(R.id.editTextResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a += b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a -= b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a *= b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a /= b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a %= b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnXor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    Integer b = Integer.valueOf(y.getText().toString());
                    a ^= b;
                    r.setText(a.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText(r.getText());
            }
        });

        btnToHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    r.setText(Integer.toHexString(a));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        btnToBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer a = Integer.valueOf(x.getText().toString());
                    r.setText(Integer.toBinaryString(a));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

