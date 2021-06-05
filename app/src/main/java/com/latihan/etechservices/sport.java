package com.latihan.etechservices;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class sport extends AppCompatActivity {
    private RecyclerView rvSport;

    private ArrayList<aksesoris> list;
    protected void onCreate(Bundle saved) {
        /** Making this activity, full screen */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /** Hide Action Bar Of This Activity Screen */
        getSupportActionBar().hide();
        super.onCreate(saved);
        setContentView(R.layout.sport);
        showRecycleList();

    }


    private void showRecycleList(){
        rvSport = findViewById(R.id.rv_sport);
        rvSport.setHasFixedSize(false);
        rvSport.setLayoutManager(new LinearLayoutManager(this));
        AdapterData adapterData = new AdapterData(this, list);
        adapterData.setListData(dataSport.getlistdata());
        rvSport.setAdapter(adapterData);
    }
}
