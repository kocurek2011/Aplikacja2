package com.kotynski.kamil.aplikacja2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Apka2 extends AppCompatActivity {

ImageButton przycisk1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apka2);


        przycisk1 = (ImageButton) findViewById(R.id.imageButton4);

        przycisk1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SMS.class);
                startActivity(i);
            }

        });

    }}







