package com.example.mycalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FractionConverterActivity extends AppCompatActivity {
    EditText numerator1;
    EditText numerator2;
    EditText numerator3;
    EditText numerator4;
    EditText denominator1;
    EditText denominator2;
    EditText denominator3;
    EditText denominator4;
    Button btnConvert1;
    Button btnConvert2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_converter);
        numerator1 = findViewById(R.id.numerator1);
        numerator2 = findViewById(R.id.numerator2);
        numerator3 = findViewById(R.id.numerator3);
        numerator4 = findViewById(R.id.numerator4);

        denominator1 = findViewById(R.id.denominator1);
        denominator2 = findViewById(R.id.denominator2);
        denominator3 = findViewById(R.id.denominator3);
        denominator4 = findViewById(R.id.denominator4);

        btnConvert1 = findViewById(R.id.btnConvert1);
        btnConvert2 = findViewById(R.id.btnConvert2);
    }
}