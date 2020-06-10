package com.sugo.dialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tview);
    }

    public void dial(View view) {
        Uri uri=Uri.parse("tel:"+ tv.getText().toString());
        Intent su=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(su);
    }
}