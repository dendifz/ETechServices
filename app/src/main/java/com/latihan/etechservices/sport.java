package com.latihan.etechservices;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class sport extends AppCompatActivity {
    private RecyclerView rvSport;
    private ArrayList<aksesoris> list = new ArrayList<>();


    protected void onCreate(Bundle saved) {
        /** Making this activity, full screen */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /** Hide Action Bar Of This Activity Screen */
        getSupportActionBar().hide();
        super.onCreate(saved);
        setContentView(R.layout.sport);

        rvSport = findViewById(R.id.rv_sport);
        rvSport.setHasFixedSize(false);
        list.addAll(dataSport.getlistdata());
        showRecycleList();

    }


    private void showRecycleList(){
        rvSport.setLayoutManager(new LinearLayoutManager(this));
        AdapterData adapterData = new AdapterData(list);
        rvSport.setAdapter(adapterData);
    }
}
