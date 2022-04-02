package com.example.examon;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //get rating bar object
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        bar.setNumStars(7);
        bar.setStepSize(0.5f);
        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        bar.setRating(score);
        switch (score)
        {
            case 0: t.setText("You scored 0%, You need to do hard work 😥😥");
                break;
            case 1: t.setText("You have 10%,You should have more focus on that subject 😐😐 ");
                break;
            case 2: t.setText("You have 20%,study Hard😐😐 ");
                break;
            case 3: t.setText("You have 50%, Nice attempt🤗🤗");
                break;
            case 4:t.setText("You have 60%,Good🤩🤩");
                break;
            case 6:t.setText("  you have 80%,Very Good.😘😘");
                break;
            case 7:t.setText("  you have 90%,Very Good.😘😘");
                break;
            case 8:t.setText("  you have 100%,Excellent.😘😘");
                break;

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(this, HomeQuiz.class);
            startActivity(settingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}