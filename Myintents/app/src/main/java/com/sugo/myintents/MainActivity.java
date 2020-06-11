package com.sugo.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText url1;
    EditText msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url1=findViewById(R.id.url);
        msg=findViewById(R.id.edt);
    }

    public void navigate2(View view) {
        String msg1=msg.getText().toString();
        Intent in=new Intent(this,Activity2.class);
        in.putExtra("sugo",msg1);
        startActivity(in);

    }

    public void openbrowser(View view) {
       String url2=url1.getText().toString();
        Uri uri= Uri.parse("https://www."+url2+".com");
        Intent obj=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(obj);
    }

}