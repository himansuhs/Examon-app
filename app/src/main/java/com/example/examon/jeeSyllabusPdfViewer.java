package com.example.examon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class jeeSyllabusPdfViewer extends AppCompatActivity {
    private PDFView pdfSyllabusJee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee_syllabus_pdf_viewer);
        pdfSyllabusJee=(PDFView)findViewById(R.id.syllabusJee);

        String itemSyllabusJee=getIntent().getStringExtra("itemNameSyllabusJee");

        if(itemSyllabusJee.equals("Chemistry Syllabus")){
            pdfSyllabusJee.fromAsset("jeechem.pdf").load();
        }
        if(itemSyllabusJee.equals("Physics Syllabus")){
            pdfSyllabusJee.fromAsset("jeephysic.pdf").load();
        }
        if(itemSyllabusJee.equals("Maths Syllabus")){
            pdfSyllabusJee.fromAsset("jeemath.pdf").load();
        }
    }
}