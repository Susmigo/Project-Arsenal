package com.sugo.navigationcomponents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class First_Fragment extends Fragment {



    public First_Fragment() {

    }
    Button b1,b2,b3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fragment_first_, container, false);
        b1=v.findViewById(R.id.red);
        b2=v.findViewById(R.id.blue);
        b3=v.findViewById(R.id.green);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_first_Fragment_to_red_Fragment2);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_first_Fragment_to_blue_Fragment);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_first_Fragment_to_green_Fragment);

            }
        });
        return v;
    }
}