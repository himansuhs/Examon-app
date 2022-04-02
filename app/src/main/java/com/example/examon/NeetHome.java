package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NeetHome extends AppCompatActivity {
    private Button bt1,bt2,bt3,QuizzNeetBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet_home);
        bt1=(Button) findViewById(R.id.btSyllabusNeet);
        bt2=(Button) findViewById(R.id.btPrevPaperNeet);
        bt3=(Button)findViewById(R.id.btSamplePaperNeet);
        QuizzNeetBt=(Button)findViewById(R.id.QuizzNeetBt);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NeetHome.this,SyllabusNeet.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NeetHome.this,prevPaperNeet.class);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NeetHome.this,samplePaperNeet.class);
                startActivity(intent);
            }
        });

    }
}