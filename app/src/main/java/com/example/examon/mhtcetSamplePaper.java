package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mhtcetSamplePaper extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhtcet_sample_paper);
        pdfView=(PDFView) findViewById(R.id.pdfViewMhtcetSamplePaper);
        pdfView.fromAsset("sample4.pdf").load();
    }
}