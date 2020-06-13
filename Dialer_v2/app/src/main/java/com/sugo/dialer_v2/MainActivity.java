package com.sugo.dialer_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnstar;
    Button btnhash;
    Button btnclear;
    EditText phnum1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phnum1=findViewById(R.id.phnum);
        btn0=findViewById(R.id.button0);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnstar=findViewById(R.id.buttonStar);
        btnhash=findViewById(R.id.buttonHash);
        btnclear=findViewById(R.id.buttonX);


    }

    public void clr(View view) {
        phnum1.setText("");
    }

    public void btn_1(View view) {
        onButtonclick(phnum1,"1");
    }

    public void btn_2(View view) {
        onButtonclick(phnum1,"2");
    }

    public void btn_3(View view) {
        onButtonclick(phnum1,"3");
    }

    public void btn_4(View view) {
        onButtonclick(phnum1,"4");
    }

    public void btn_5(View view) {
        onButtonclick(phnum1,"5");
    }

    public void btn_6(View view) {
        onButtonclick(phnum1,"6");
    }

    public void btn_7(View view) {
        onButtonclick(phnum1,"7");
    }

    public void btn_8(View view) {
        onButtonclick(phnum1,"8");
    }

    public void btn_9(View view) {
        onButtonclick(phnum1,"9");
    }

    public void btn_star(View view) {
        onButtonclick(phnum1,"*");
    }

    public void btn_0(View view) {
        onButtonclick(phnum1,"0");
    }

    public void btn_hash(View view) {
        onButtonclick(phnum1,"#");
    }

    public void btn_dial(View view) {
        if (phnum1.getText().length() <=3)
        {
            Toast.makeText(this, "please enter valid number", Toast.LENGTH_SHORT).show();

        }
        else
            {
            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" +phnum1.getText().toString()));
            startActivity(intent);
            }

    }
    public void onButtonclick(EditText input, String number)
    {
        String cache = phnum1.getText().toString();
        input.setText(cache + number);
    }

}