package com.example.mycalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeometryOptionActivity extends AppCompatActivity {
    Button btnCircle;
    Button btnTrapezoid;
    Button btnParallelogram;
    Button btnRhombus;
    Button btnTriangle;
    ImageView imgMollu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_option);
        btnCircle = findViewById(R.id.btnCircle);
        btnTrapezoid = findViewById(R.id.btnTrapezoid);
        btnParallelogram = findViewById(R.id.btnParallelogram);
        imgMollu = findViewById(R.id.imageView2);
        btnRhombus = findViewById(R.id.btnRhombus);
        btnTriangle = findViewById(R.id.btnTriangle);
    }
}