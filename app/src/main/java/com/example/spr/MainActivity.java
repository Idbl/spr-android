package com.example.spr;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView pole1 = findViewById(R.id.pole1);
        TextView pole2 = findViewById(R.id.pole2);
        TextView pole3 = findViewById(R.id.pole3);
        TextView wynik = findViewById(R.id.wynik);

            button.setOnClickListener((View v) ->{
                if(pole1.getText().toString() == "" | pole2.getText().toString() == "" || pole3.getText().toString() == ""){
                   wynik.setText("podaj liczby");
                }
                double a = Double.valueOf(pole1.getText().toString());
                double b = Double.valueOf(pole2.getText().toString());
                double c = Double.valueOf(pole3.getText().toString());

                Double delta = b * b - 4 * a * c;
                wynik.setText(delta.toString());
            });

    }
}