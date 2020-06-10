package com.sugo.userinputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_name,et_email,et_phone,et_pass;
    RadioButton r_male,r_fmale;
    TextView tv_res;
    String gender;
    CheckBox c_java,c_and;
    Spinner s_branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.name);
        et_email=findViewById(R.id.email);
        et_phone=findViewById(R.id.phone);
        et_pass=findViewById(R.id.pswd);
        tv_res=findViewById(R.id.result);
        r_male=findViewById(R.id.male);
        r_fmale=findViewById(R.id.female);
        c_java=findViewById(R.id.java);
        c_and=findViewById(R.id.android);
        s_branch=findViewById(R.id.branches);

    }

    public void display(View view) {
        String name=et_name.getText().toString();
        String email=et_email.getText().toString();
        String phone=et_phone.getText().toString();
        String pass=et_pass.getText().toString();
        if (r_male.isChecked())
        {
           gender=r_male.getText().toString();
        }
        else if(r_fmale.isChecked())
            {
            gender = r_fmale.getText().toString();
        }
        StringBuilder builder=new StringBuilder();
        if (c_java.isChecked())
        {
            builder.append(c_java.getText().toString());
        }
        if (c_and.isChecked())
        {
            builder.append(c_and.getText().toString());
        }
        String branch=s_branch.getSelectedItem().toString();
        tv_res.setText("Name:"+name+"\n"+"Email:"+email+"\n"+"phone:"+phone+"\n"+"password:"+pass+"\n"+"Gender:"+gender+"\n"+builder.toString()
        +"\n"+branch);

    }
}