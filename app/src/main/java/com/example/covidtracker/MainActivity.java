package com.example.covidtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvContryName,tvTotalCases,tvRecoveredCases,tvcs,tvrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContryName=(TextView)findViewById(R.id.tvCountryName);
        tvcs = (TextView)findViewById(R.id.tvcs);
        tvrc =(TextView) findViewById(R.id.tvrc);

        tvContryName.setText("India");
        tvcs.setText("19562");
        tvrc.setText("11000");
    }
}