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

public class HomePhysic extends AppCompatActivity {
    private TextView questionTV,questionNumberTV;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<QuizModal>quizModalArrayList;
    Random random;
    int currentScore = 0,questionAttempted = 1,currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_physic);
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
            Intent intent = new Intent(HomePhysic.this, ResultActivity.class);
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
        quizModalArrayList.add(new QuizModal("The commonly used unit of temperature is","Kelvin","Degree Fahrenheit","Degree Celsius","All","Degree Celsius"));
        quizModalArrayList.add(new QuizModal(" Charle’s law is given by","V = constant","T= constant","V/T = constant","None","V/T = constant"));
        quizModalArrayList.add(new QuizModal("During boiling, temperature remains constant at the","melting point","freezing point","boiling point","condensation point","boiling point"));
        quizModalArrayList.add(new QuizModal(" Newton’s first law is also known as","Law of rotation","Law of Inertia","Law of momentum","None of the option is correct","Law of Inertia"));
        quizModalArrayList.add(new QuizModal("Mass of a body (m) into acceleration (a) is equal to","Force","displacement","momentum","Inertia","Force"));
        quizModalArrayList.add(new QuizModal("A unit of force is","Joule – m","Joule","Newton – m","Kg ms−2","Kg ms−2"));
        quizModalArrayList.add(new QuizModal("Free fall of an object (in vacuum) is a case of motion with"," uniform velocity","uniform acceleration","variable acceleration","constant momentum","uniform acceleration"));
        quizModalArrayList.add(new QuizModal("The dimensional formula for speed is","T-1"," LT-1","L-1T-1","L-1T","LT-1"));
        quizModalArrayList.add(new QuizModal("Motion of objects along a straight line is also called as","Linear motion ","Simple motion ","Rectilinear motion"," None of the above","Rectilinear motion"));
        quizModalArrayList.add(new QuizModal("Velocity may be","positive","negative","zero","All","All"));


    }
}