package com.example.examon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button btMht;
    private Button btJee;
    private Button btNeet;
    private Button todo;
   // String[] mhtPdf={""}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
            if(id==R.id.conctatUs){
                Toast.makeText(Home.this, "teamGeneral@gmail.com", Toast.LENGTH_SHORT).show();
            }
            if(id==R.id.aboutUs){
                Toast.makeText(Home.this, "Team General", Toast.LENGTH_SHORT).show();
            }
            if(id==R.id.exit){
                finish();
            }
            if(id==R.id.joinUs){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/examonhs"));
                startActivity(intent);
            }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btMht = (Button) findViewById(R.id.btMhtCet);

        btJee =(Button) findViewById(R.id.btJee);
        btNeet =(Button) findViewById(R.id.btNeet);
        todo =(Button) findViewById(R.id.todo);
        btMht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MhtcetHome.class);
                startActivity(intent);
            }

        });
        btJee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, jeeHome.class);
                startActivity(intent);
            }

        });
        btNeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, NeetHome.class);
                startActivity(intent);
            }

        });
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,todoList.class);
                startActivity(intent);
            }

        });


        }
    }