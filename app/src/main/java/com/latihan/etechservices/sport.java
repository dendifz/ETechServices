package com.latihan.etechservices;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class sport extends AppCompatActivity {
    ListView list_view;


    protected void onCreate(Bundle saved) {

        super.onCreate(saved);
        setContentView(R.layout.sport);
        list_view = findViewById(R.id.list_view);

        ArrayList<person> arrayList = new ArrayList<>();

        arrayList.add(new person(R.drawable.bola , "bola","bola masih bagus"));
        arrayList.add(new person(R.drawable.raket , "raket badminton","senar kuat,ringan saat di pukul"));
        arrayList.add(new person(R.drawable.sepatu , "Sepatu bola","sepatu bola kualitas baik orisinil punya"));
        arrayList.add(new person(R.drawable.sepatubasket , "sepatu basket","bagus nih original"));
        arrayList.add(new person(R.drawable.sarung , "sarung tangan kiper","sarung tangan yang mau jadi kiper"));

        personadapter personadaptere = new personadapter(this,R.layout.list_row,arrayList);


    }
}
