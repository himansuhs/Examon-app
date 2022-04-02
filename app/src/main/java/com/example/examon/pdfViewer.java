package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfViewer extends AppCompatActivity {
   private PDFView pdfViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        pdfViewer=(PDFView) findViewById(R.id.pdfView);

        String getItem=getIntent().getStringExtra("itemName");


        if(getItem.equals("Mhtcet paper 2018 (shift 1)")){
            pdfViewer.fromAsset("MHTCET 2018 (1).pdf").load();
        }
        if(getItem.equals("Mhtcet paper 2018 (shift 2)")){
            pdfViewer.fromAsset("MHTCET 2018 (2).pdf").load();
        }
        if(getItem.equals("Mhtcet Paper 2019 (shift 1)")){
            pdfViewer.fromAsset("MHTCET 2019(1).pdf").load();
        }
        if(getItem.equals("Mhtcet Paper 2019 (shift 2)")){
            pdfViewer.fromAsset("MHTCET 2019(2).pdf").load();
        }
        if(getItem.equals("Mhtcet Paper 2020 ")){
            pdfViewer.fromAsset("MHTCET 2020.pdf").load();
        }


    }
}