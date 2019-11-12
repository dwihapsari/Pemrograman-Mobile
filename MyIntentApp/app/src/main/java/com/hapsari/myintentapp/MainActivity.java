package com.hapsari.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWeb;
    Button btnInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web_polines);
        btnWeb.setOnClickListener(this);

        btnInput = findViewById(R.id.btn_input_data);
        btnInput.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent moveActivityWithData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "Dwi Hapsari");
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, "19");
                startActivity(moveActivityWithData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "085826628071";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel : "+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_web_polines:
                String web = "http://www.polines.ac.id";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(web)));
                break;
            case R.id.btn_input_data:
                Intent inputActivity = new Intent (MainActivity.this, InputActivity.class);
                startActivity(inputActivity);

        }
    }
}
