package com.example.lab08.dialogfragmentkullanimi.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab08.dialogfragmentkullanimi.R;
import com.example.lab08.dialogfragmentkullanimi.fragment.DialogSinifi;
import com.example.lab08.dialogfragmentkullanimi.fragment.DialogSinifi1;

public class MainActivity extends AppCompatActivity {

    Button button ,btnviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnScrollViewDialog);
        btnviewpager = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSinifi dialogSinifi = new DialogSinifi();
                dialogSinifi.show(getSupportFragmentManager(),"");
            }
        });
        btnviewpager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSinifi1 dialogSinifi1 = new DialogSinifi1();
                dialogSinifi1.show(getSupportFragmentManager(),"");
            }
        });



    }



}
