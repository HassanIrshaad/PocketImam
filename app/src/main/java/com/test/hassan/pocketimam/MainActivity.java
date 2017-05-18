package com.test.hassan.pocketimam;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.content.Intent;
import android.app.Activity;


public class MainActivity extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fajr_button = (Button) findViewById(R.id.fajr_button);
        fajr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Fajr_Activity.class);
                startActivity(myIntent);
            }
        });
        Button zuhr_button = (Button) findViewById(R.id.zuhr_button);
        zuhr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Zuhr_Activity.class);
                startActivity(myIntent);
            }
        });
        Button asr_button = (Button) findViewById(R.id.asr_button);
        asr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Asr_Activity.class);
                startActivity(myIntent);
            }
        });
        Button magrhib_button = (Button) findViewById(R.id.magrhib_button);
        magrhib_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Magrhib_Activity.class);
                startActivity(myIntent);
            }
        });
        Button isha_button = (Button) findViewById(R.id.isha_button);
        isha_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Isha_Activity.class);
                startActivity(myIntent);
            }
        });
        /*Spinner spinner = (Spinner) findViewById(R.id.prayers_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Prayers, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);*/
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
