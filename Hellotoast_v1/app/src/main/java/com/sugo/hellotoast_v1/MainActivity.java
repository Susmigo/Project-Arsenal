package com.sugo.hellotoast_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count =0;
    int count1 =0;
    TextView tv;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        tv1=findViewById(R.id.textView1);

    }

    public void count(View view)
    {
        count++;
        tv.setText(""+count);
    }

    public void toast(View view)
    {
        Toast.makeText(this, "Wellcome to project arsenal", Toast.LENGTH_SHORT).show();
    }

    public void count1(View view) {
        count1++;
        tv1.setText(""+count1);
    }

    public void toast1(View view) {
        Toast.makeText(this, "Wellcome to project arsenal", Toast.LENGTH_SHORT).show();
    }
}