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

public class GeometryRhombusActivity extends AppCompatActivity {
    EditText editRhombusA;
    Button btnCalculate;
    EditText editRhombusB;
    TextView TextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_rhombus);
        btnCalculate = findViewById(R.id.btnCircleResult);
        editRhombusA = findViewById(R.id.editRhombusA);
        editRhombusB = findViewById(R.id.editRhombusB);
        TextResult = findViewById(R.id.textResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A = Double.parseDouble(editRhombusA.getText().toString());
                double B = Double.parseDouble(editRhombusB.getText().toString());
                double result = A*B/2;
                TextResult.setText(""+result);
            }
        });
    }
}