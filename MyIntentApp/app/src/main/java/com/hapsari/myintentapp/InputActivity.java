package com.hapsari.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    EditText edtText;
    Button btnInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        edtText = findViewById(R.id.edt_text);
        btnInput = findViewById(R.id.btn_input);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edtText.getText().toString();
                startActivity(new Intent(InputActivity.this, OutputActivity.class).putExtra("output", input));
            }
        });
    }
}

