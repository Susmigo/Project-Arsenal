package com.sugo.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txt1=findViewById(R.id.txt);
        Intent ok=getIntent();
        String ook=ok.getStringExtra("sugo");
        txt1.setText(ook);
    }
}