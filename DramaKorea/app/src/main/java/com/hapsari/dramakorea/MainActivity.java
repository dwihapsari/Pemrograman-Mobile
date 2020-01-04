package com.hapsari.dramakorea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDrakor;
    private ArrayList<Drakor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Makanan Khas Yogyakarta");
        }

        rvDrakor = findViewById(R.id.rv_drakor);
        rvDrakor.setHasFixedSize(true);

        list.addAll(DrakorData.getListData());
        showRecycleList();

    }

    private void showRecycleList() {
        rvDrakor.setLayoutManager(new LinearLayoutManager(this));
        CardDrakorAdapter cardDrakorAdapter= new CardDrakorAdapter(this,list);
        rvDrakor.setAdapter(cardDrakorAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.about:
                Intent AboutIntent = new Intent (MainActivity.this, ProfilActivivity.class);
                startActivity(AboutIntent);
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_about, menu);
        return true;
    }
}
