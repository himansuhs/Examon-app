package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SyllabusNeet extends AppCompatActivity {
   private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_neet);
        pdfView=(PDFView)findViewById(R.id.pdfViewerSyllabusNeet) ;
        pdfView.fromAsset("nesyllabus.pdf").load();
    }
}