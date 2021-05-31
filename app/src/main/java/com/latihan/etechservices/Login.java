package com.latihan.etechservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public abstract class Login extends AppCompatActivity  {
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.pass);

    }

    public void OnClick(View view) {
        if (view.getId() == R.id.username || view.getId() == R.id.pass ){
            Intent intent = new Intent(Login.this,Home.class);
            startActivity(intent);
        }else {
            System.out.println("username atau password salah");
        }




    }
}
