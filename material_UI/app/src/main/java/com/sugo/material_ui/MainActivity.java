package com.sugo.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText t_name,t_user,t_mail;
    AppCompatButton b_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t_name =findViewById(R.id.name);
        t_user =findViewById(R.id.user);
        t_mail =findViewById(R.id.mail);
        b_toast =findViewById(R.id.toast);

    }

    public void toast(View view) {
        String s_name = t_name.getText().toString();
        String s_user = t_user.getText().toString();
        String s_mail = t_mail.getText().toString();


        Toast.makeText(this,s_name+"\n"+s_user+"\n"+s_mail, Toast.LENGTH_SHORT).show();
    }
}