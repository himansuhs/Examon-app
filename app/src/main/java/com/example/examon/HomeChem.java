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

public class HomeChem extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal>quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttempted = 1,currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chem);
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
            Intent intent = new Intent(HomeChem.this, ResultActivity.class);
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
        quizModalArrayList.add(new QuizModal(" Which of the following as an amorphous solid?","Caf","Nacl","Cscl","Glass","Glass"));
        quizModalArrayList.add(new QuizModal("SI unit of electmc charge is","erg","joule","calorie","columb","columb"));
        quizModalArrayList.add(new QuizModal("Mol is SI unit of ","Concetration","Amount of substance","mass","density","Amount of substance"));
        quizModalArrayList.add(new QuizModal("Candela is a SI unit of","Electric current","Energy","luminous Intensity","Potential Difference","luminous Intensity"));
        quizModalArrayList.add(new QuizModal("In a triple bond there is sharing of ","3-electron","4-electron","several electron","6-electron","4-electron"));
        quizModalArrayList.add(new QuizModal("The Bond length doesnot affected by ","electron affinity","bond order","hybridisation","resonace","electron affinity"));
        quizModalArrayList.add(new QuizModal("The shape of sulfer ion is","Hexagolonal","square planar","trigonal bipyramidal","tetrahedral","tetrahedral"));
        quizModalArrayList.add(new QuizModal("Narcotics analgesics is ","asprin","ibucrofen","diclorofenac","morphine","morphine"));
        quizModalArrayList.add(new QuizModal("Diamond is.....","conductor","sp3 hybridized","iconic solid","lubricant","sp3 hybridized"));
        quizModalArrayList.add(new QuizModal("which of the following has amide linkage","nylon 6-6","bakelight","taflon","terylene","nylon 6-6"));



    }
}