package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GeometryCircleActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText editRadius;
    TextView TextResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_circle);
        btnCalculate = findViewById(R.id.btnCircleResult);
        editRadius = findViewById(R.id.editCircleR);
        TextResult = findViewById(R.id.textCircleResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double R = Integer.parseInt(editRadius.getText().toString());
                double result = R*R*3.141592;
                TextResult.setText(""+result);
            }
        });
    }
}