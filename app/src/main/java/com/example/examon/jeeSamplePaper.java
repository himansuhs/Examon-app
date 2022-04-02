package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class jeeSamplePaper extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee_sample_paper);
        pdfView=(PDFView)findViewById(R.id.pdfViewSamplePaperJee);
        pdfView.fromAsset("sample2.pdf").load();
    }
}