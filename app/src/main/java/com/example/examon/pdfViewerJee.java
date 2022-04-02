package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfViewerJee extends AppCompatActivity {
    private PDFView pdfViewJee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer_jee);
        pdfViewJee = (PDFView) findViewById(R.id.pdfViewJee);

        String getItemJee = getIntent().getStringExtra("itemNameJee");


        if (getItemJee.equals("Jee Paper 2020")) {
            pdfViewJee.fromAsset("j20.pdf").load();
        }
        if(getItemJee.equals("Jee Paper 2019")){
            pdfViewJee.fromAsset("j19.pdf").load();
        }
        if(getItemJee.equals("Jee Paper 2018")){
            pdfViewJee.fromAsset("j18.pdf").load();
        }
        if(getItemJee.equals("Jee Paper 2017")){
            pdfViewJee.fromAsset("j17.pdf").load();
        }
        if(getItemJee.equals("Jee Paper 2016")){
            pdfViewJee.fromAsset("j16.pdf").load();
        }
        if(getItemJee.equals("Jee Paper 2015")){
            pdfViewJee.fromAsset("j15.pdf").load();
        }



    }
}