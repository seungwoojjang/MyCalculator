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

public class GeometryTriangleActivity extends AppCompatActivity {

    EditText editTriangleA;
    Button btnCalculate;
    EditText editTriangleB;
    TextView TextTriangleResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_triangle);
        btnCalculate = findViewById(R.id.btnTriangleResult);
        editTriangleA = findViewById(R.id.editTriangleA);
        editTriangleB = findViewById(R.id.editTriangleB);
        TextTriangleResult = findViewById(R.id.textTriangleResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A = Double.parseDouble(editTriangleA.getText().toString());
                double B = Double.parseDouble(editTriangleB.getText().toString());
                double result = A*B/2;
                TextTriangleResult.setText(""+result);
            }
        });
    }
}