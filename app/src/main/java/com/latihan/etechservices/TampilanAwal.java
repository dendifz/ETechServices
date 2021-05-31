package com.latihan.etechservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class TampilanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        /** Hiding Title bar of this activity screen */
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        /** Making this activity, full screen */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /** Hide Action Bar Of This Activity Screen */
        getSupportActionBar().hide();
        setContentView(R.layout.tampilan_awal);

        Button btn_sign = findViewById(R.id.sign_in);
        TextView textGreet = findViewById(R.id.t1);
        TextView btn_sign_up = findViewById(R.id.sign_up);

    }

    public void Sign_in(View view) {
        Intent intent = new Intent(TampilanAwal.this,Login.class);
        startActivity(intent);
    }

    public void regist(View view) {
        Intent intent = new Intent(TampilanAwal.this,Register.class);
        startActivity(intent);
    }
}
