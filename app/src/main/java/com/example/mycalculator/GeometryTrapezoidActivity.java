package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeometryTrapezoidActivity extends AppCompatActivity {

    EditText editTrapezoidA;
    EditText editTrapezoidH;
    Button btnCalculate;
    EditText editTrapezoidB;
    TextView TextTrapezoidResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_trapezoid);
        btnCalculate = findViewById(R.id.btnTrapezoidResult);
        editTrapezoidA = findViewById(R.id.editTrapezoidA);
        editTrapezoidB = findViewById(R.id.editTrapezoidB);
        editTrapezoidH = findViewById(R.id.editTrapezoidH);
        TextTrapezoidResult = findViewById(R.id.textTrapezoidResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A = Double.parseDouble(editTrapezoidA.getText().toString());
                double B = Double.parseDouble(editTrapezoidB.getText().toString());
                double H = Double.parseDouble(editTrapezoidH.getText().toString());
                double result = (A+B)*H/2;
                TextTrapezoidResult.setText(""+result);
            }
        });
    }
}