package com.example.examon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class prevPaper extends AppCompatActivity {
    String [] prevPaper={"Mhtcet paper 2018 (shift 1)","Mhtcet Paper 2018 (shift 2)","Mhtcet Paper 2019 (shift 1)","Mhtcet Paper 2019 (shift 2)","Mhtcet Paper 2020 "};
   private  ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_paper);
        listView = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prevPaper){
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
                Intent intent=new Intent(prevPaper.this,pdfViewer.class);
                intent.putExtra("itemName",item);
                startActivity(intent);
            }
        });



    }
}