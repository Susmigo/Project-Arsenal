package com.sugo.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    My_adapter adapter;
    String androtitles[];
    int logos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rview);
        androtitles=getResources().getStringArray(R.array.version_names);
        logos =new int[]{R.drawable.cupcake,R.drawable.donut,
                R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ice,R.drawable.jelly_bean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marsmellow,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,R.drawable.finalq,R.drawable.rlogo};
        adapter=new My_adapter(this,androtitles,logos);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }
}