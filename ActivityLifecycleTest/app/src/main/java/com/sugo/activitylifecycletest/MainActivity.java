package com.sugo.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt);
        txt1.append("onCreate \n");
        Log.d("MainActivity","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        txt1.append("onStart \n");
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        txt1.append("onResume\n");
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        txt1.append("onPause \n");
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        txt1.append("onStop \n");
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        txt1.append("onDestroy \n");
        Log.d("MainActivity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        txt1.append("onRestart \n");
        Log.d("MainActivity","onRestart");
    }
}