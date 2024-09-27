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

public class GeometryParallelogramActivity extends AppCompatActivity {
    EditText editParallelogramA;
    EditText editParallelogramB;
    TextView textparallelogramResult;
    Button btnparallelogramResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_parallelogram);
        editParallelogramA = findViewById(R.id.editParallelogramA);
        editParallelogramB = findViewById(R.id.editParallelogramB);
        textparallelogramResult = findViewById(R.id.textParallelogramResult);
        btnparallelogramResult = findViewById(R.id.btnParallelogramResult);
        btnparallelogramResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A = Double.parseDouble(editParallelogramA.getText().toString());
                double B = Double.parseDouble(editParallelogramB.getText().toString());
                double result = A+B/2;
                textparallelogramResult.setText(""+result);

            }
        });
    }
}