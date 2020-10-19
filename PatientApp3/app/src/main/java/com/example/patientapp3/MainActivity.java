package com.example.patientapp3;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=(RelativeLayout) findViewById(R.id.hospital);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Hospital.class);
                startActivity(intent);

            }
            });
        relativeLayout=(RelativeLayout) findViewById(R.id.doctor);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Doctor.class);
                startActivity(intent);

            }
        });
        relativeLayout=(RelativeLayout) findViewById(R.id.medicine);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Medicine.class);
                startActivity(intent);

            }
        });
        relativeLayout=(RelativeLayout) findViewById(R.id.health);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Healthtips.class);
                startActivity(intent);

            }
        });
        relativeLayout=(RelativeLayout) findViewById(R.id.bloodbank);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Bloodbank.class);
                startActivity(intent);

            }
        });
        relativeLayout=(RelativeLayout) findViewById(R.id.chart);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Chart.class);
                startActivity(intent);

            }
        });



    }
}