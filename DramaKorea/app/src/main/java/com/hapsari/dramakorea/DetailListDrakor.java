package com.hapsari.dramakorea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListDrakor extends AppCompatActivity {
    private int drakor_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Drakor> listDrakor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_drakor);

        drakor_id   = getIntent().getIntExtra("drakor_id",0);
        tvName      = findViewById(R.id.nama_drakor);
        tvDesc      = findViewById(R.id.desc_detail);
        imgDetail   = findViewById(R.id.img_detail);

        listDrakor.addAll(DrakorData.getListData());
        setLayout();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    void setLayout(){
        tvName.setText(listDrakor.get(drakor_id).getName());
        tvDesc.setText(listDrakor.get(drakor_id).getDescription());
        Glide.with(this)
                .load(listDrakor.get(drakor_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}
