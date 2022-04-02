package com.example.examon;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class quizz extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal>quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttempted = 1,currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        questionTV=findViewById(R.id.idTVQuestion);
        questionNumberTV = findViewById(R.id.idTVQuestionAttempted);
        option1Btn=findViewById(R.id.idBtnOption1);
        option2Btn=findViewById(R.id.idBtnOption2);
        option3Btn=findViewById(R.id.idBtnOption3);
        option4Btn=findViewById(R.id.idBtnOption4);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())){
                    currentScore++;

                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())){
                    currentScore++;

                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())){
                    currentScore++;

                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())){
                    currentScore++;

                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

    }


    private void setDataToViews(int currentPos){
        questionNumberTV.setText("Questions Attempted :"+questionAttempted+"/10");
        if(questionAttempted==10){
            Intent intent = new Intent(quizz.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", currentPos); //Your score
            intent.putExtras(b); //Put your score to your next Intent
            startActivity(intent);
            finish();


        }else {
            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());

        }
    }
    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {
        quizModalArrayList.add(new QuizModal("The function f : A → B defined by f(x) = 4x + 7, x ∈ R is"," one-one","Many one","Odd","Even","one-one"));
        quizModalArrayList.add(new QuizModal("If sin-1(x2 – 7x + 12) = nπ, ∀ n ∈ I, then x =","-2","4","-3","5","4"));
        quizModalArrayList.add(new QuizModal("The smallest integer function f(x) = [x] is","one-one","Many-one","Both","None of these","Many-one"));
        quizModalArrayList.add(new QuizModal("The function f : R → R defined by f(x) = 3 – 4x is","onto","not-onto","none one-one","None of these","onto"));
        quizModalArrayList.add(new QuizModal("Let f : N → R : f(x) = (2x−1)2 and g : Q → R : g(x) = x + 2 be two functions. Then, (gof) (32) is","3","1","72","NOne of these","3"));
        quizModalArrayList.add(new QuizModal("Let f(x)=x−1x+1, then f(f(x)) is","1x","-1x","1x+1","1x-1","-1x"));
        quizModalArrayList.add(new QuizModal("If f(x) =1−1x, then f(f(1x))","1x","11+x","xx-1","1x-1","xx-1"));
        quizModalArrayList.add(new QuizModal("If f(x) =3x+25x−3 then (fof)(x) is","x","-x","f(x)","-f(x)","x"));
        quizModalArrayList.add(new QuizModal("The number of binary operations that can be defined on a set of 2 elements is","8","4","16","64","16"));
        quizModalArrayList.add(new QuizModal("Let * be a binary operation on Q, defined by a * b =3abis"," Commutative","Associative","Both","None of these","Both"));

    }
}