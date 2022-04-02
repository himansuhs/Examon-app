package com.example.examon;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class jeeHome extends AppCompatActivity {
    private Button btPrev,btSyllabus,button6,QuizzJeeBt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee_home);
        btPrev=(Button)findViewById(R.id.btPrevPaperJee);
        btSyllabus=(Button)findViewById(R.id.btSyllabusJee);
        button6=(Button)findViewById(R.id.samplePaperMhtcet);
        QuizzJeeBt=(Button)findViewById(R.id.QuizzJeeBt);

        btPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(jeeHome.this,prevPaperJee.class);
                startActivity(intent);
            }
        });
        btSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(jeeHome.this,SyllabusJee.class);
                 startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(jeeHome.this,jeeSamplePaper.class);
                startActivity(intent);
            }
        });

      QuizzJeeBt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(jeeHome.this,HomeQuiz.class);
              startActivity(intent);
          }
      });

    }
}