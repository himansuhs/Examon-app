package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfViewerPrevYearNeet extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer_prev_year_neet);
        pdfView=(PDFView) findViewById(R.id.pdfViewPrevPaperNeet);


        String getItemNeet=getIntent().getStringExtra("itemNameNeetPrevPaper");

        if(getItemNeet.equals("Neet Paper 2016")){
            pdfView.fromAsset("2016.pdf").load();
        }
        if(getItemNeet.equals("Neet Paper 2017")){
            pdfView.fromAsset("2015.pdf").load();
        }
        if(getItemNeet.equals("Neet Paper 2018")){
            pdfView.fromAsset("2018.pdf").load();
        }
        if(getItemNeet.equals("Neet Paper 2019")){
            pdfView.fromAsset("2019.pdf").load();
        }

    }
}