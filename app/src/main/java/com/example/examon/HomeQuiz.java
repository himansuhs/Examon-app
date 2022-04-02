package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeQuiz extends AppCompatActivity {
    private Button qmath,qphysic,qchem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_quiz);

        qmath = (Button)findViewById(R.id.qmath);
        qphysic =(Button)findViewById(R.id.qphysic);
        qchem =(Button)findViewById(R.id.qchem);

        qmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuiz.this,quizz.class);
                startActivity(intent);
            }
        });

        qphysic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuiz.this,HomePhysic.class);
                startActivity(intent);
            }
        });
        qchem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuiz.this,HomeChem.class);
                startActivity(intent);
            }
        });






    }
}