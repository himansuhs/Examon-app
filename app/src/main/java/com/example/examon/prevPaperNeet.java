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

import java.util.List;

public class prevPaperNeet extends AppCompatActivity {
    private ListView listView;
    String prevPaperNeet[] = {"Neet Paper 2016", "Neet Paper 2017", "Neet Paper 2018", "Neet Paper 2019"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_paper_neet);
        listView = (ListView) findViewById(R.id.listViewPrevPaperNeet);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prevPaperNeet) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                return view;
            }
        };

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = listView.getItemAtPosition(position).toString();
                Intent intent = new Intent(prevPaperNeet.this, pdfViewerPrevYearNeet.class);
                intent.putExtra("itemNameNeetPrevPaper", item);
                startActivity(intent);


            }
        });
    }
}