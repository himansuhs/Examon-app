package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MhtcetHome extends AppCompatActivity {
    Button btSyllabus,btPrevPaper,btSamplePaper,QuizzMhBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhtcet_home);
        btSyllabus=(Button) findViewById(R.id.btSyllabus);
        btPrevPaper=(Button) findViewById(R.id.btPrevPaper);
        btSamplePaper=(Button)findViewById(R.id.samplePaperMhtcet);
        QuizzMhBt=(Button)findViewById(R.id.QuizzMhBt);

        btPrevPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MhtcetHome.this,prevPaper.class);
                startActivity(intent);
            }
        });

        btSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MhtcetHome.this,mhtcetSyllabus.class);
                startActivity(intent);
            }
        });
        btSamplePaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MhtcetHome.this,mhtcetSamplePaper.class);
                startActivity(intent);
            }
        });
        QuizzMhBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MhtcetHome.this,HomeQuiz.class);
                startActivity(intent);
            }
        });
    }
}