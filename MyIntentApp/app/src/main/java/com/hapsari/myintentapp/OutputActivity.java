package com.hapsari.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textView = findViewById(R.id.txt_output);

        String output = getIntent().getStringExtra("output");
        textView.setText(output);
    }
}
