package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class samplePaperNeet extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_paper_neet);
        pdfView=(PDFView) findViewById(R.id.pdfViewSamplePaperNeet);

        pdfView.fromAsset("sample1.pdf").load();

    }
}