package com.sugo.recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    My_adapter adapter;
    String androtitles[];
    String androver[];
    int logos[];
    int vers[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rview);
        androtitles = getResources().getStringArray(R.array.version_names);
        androver = getResources().getStringArray(R.array.version_numbers);
        logos = new int[]{R.drawable.cupcake, R.drawable.donut,
                R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ice, R.drawable.jelly_bean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marsmellow, R.drawable.nougat, R.drawable.oreo, R.drawable.pie, R.drawable.finalq, R.drawable.rlogo};
        adapter = new My_adapter(this, androtitles, logos, androver);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }

    public void toast(View view) {
        TextView tvv;
        TextView tt2;
        tvv =findViewById(R.id.tv_version);
        tt2 =findViewById(R.id.tv_v);
        String tt=tvv.getText().toString();
        String tt1=tt2.getText().toString();
        Toast.makeText(this,tt+"\n"+tt1, Toast.LENGTH_SHORT).show();

    }
}