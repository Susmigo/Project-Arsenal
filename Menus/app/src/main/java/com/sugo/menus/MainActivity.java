package com.sugo.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    int c_year,c_month;
    int c_date;
    int c_hour;
    int c_min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.alt);
        btn2 = findViewById(R.id.date);
        btn3 = findViewById(R.id.time);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "This is about us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contact:
                    Toast.makeText(this, "This is contact us", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.settings:
                        Toast.makeText(this, "This is settings", Toast.LENGTH_SHORT).show();
                        break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()){
            case R.id.alt:
                openAlertDialog();
                break;
            case R.id.date:
                openDatePicker();
                break;
            case R.id.time:
                openTimePicker();
                break;
        }

    }

    private void openTimePicker() {

        Calendar c = Calendar.getInstance();
        c_hour =c.get(Calendar.HOUR_OF_DAY);
        c_min =c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute)
            {
                String mytime = hourOfDay + ":" + minute;
                Toast.makeText(MainActivity.this, mytime , Toast.LENGTH_SHORT).show();
            }
        },c_hour,c_min,false);
        timePickerDialog.show();



    }

    private void openDatePicker() {
        Calendar c = Calendar.getInstance();
        c_year =c.get(Calendar.YEAR);
        c_month =c.get(Calendar.MONTH);
        c_date =c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog =new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String mydate = dayOfMonth+"-"+(month+1)+"-"+year;
                Toast.makeText(MainActivity.this, mydate, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_date);
        datePickerDialog.show();

    }

    private void openAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setTitle("sugo");
        builder.setMessage("Are you sure want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }

        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}