package com.sugo.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sugo.sharedpreferences.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    EditText e_usr,e_pwd;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        e_usr=findViewById(R.id.editText);
        e_pwd=findViewById(R.id.editTextText);
        sp=getSharedPreferences("sugo",MODE_PRIVATE);

    }

    public void show_data(View view) {
        String name=e_usr.getText().toString();
        String pwd=e_pwd.getText().toString();
        Toast.makeText(this, ""+name+"\n"+pwd, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        String name=e_usr.getText().toString();
        String pwd=e_pwd.getText().toString();
        SharedPreferences.Editor editor =sp.edit();
        editor.putString("su",name);
        editor.putString("sugo",pwd);
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        String n=sp.getString("su","");
        String p=sp.getString("sugo","");
        e_usr.setText(n);
        e_pwd.setText(p);
    }
}