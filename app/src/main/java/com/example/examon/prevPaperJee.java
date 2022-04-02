package com.example.examon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class prevPaperJee extends AppCompatActivity {
    String [] jeeName={"Jee Paper 2020","Jee Paper 2019","Jee Paper 2018","Jee Paper 2017","Jee Paper 2016","Jee Paper 2015"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_paper_jee);
        listView = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jeeName){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view=super.getView(position, convertView, parent);
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=listView.getItemAtPosition(position).toString();
                Intent intent=new Intent(prevPaperJee.this,pdfViewerJee.class);
                intent.putExtra("itemNameJee",item);
                startActivity(intent);
            }
        });

    }
}