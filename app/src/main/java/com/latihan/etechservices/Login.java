package com.latihan.etechservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /** Hiding Title bar of this activity screen */
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        /** Making this activity, full screen */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /** Hide Action Bar Of This Activity Screen */
        getSupportActionBar().hide();
        setContentView(R.layout.login);
        btn_login = findViewById(R.id.btn_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.pass);
        TextView guest = findViewById(R.id.trouble);

        guest.setOnClickListener(v -> {
            Intent i = new Intent(Login.this,Home.class);
            startActivity(i);
        });

        btn_login.setOnClickListener(v -> {
            if (username.getText().toString().equals("user") && password.getText().toString().equals("user") ){
                Intent intent = new Intent(this,Home.class);
                startActivity(intent);
            }else {
                Toast.makeText(getApplicationContext(),"Username Atau Password Salah", LENGTH_SHORT).show();
            }
        });


    }
}

