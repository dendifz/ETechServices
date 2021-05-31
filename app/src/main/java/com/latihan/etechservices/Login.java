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
    String user,pass;
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

        user = String.valueOf(username);
        pass = String.valueOf(password);
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Home.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!user.equals("user") || !pass.equals("user") ){
                    Intent intent = new Intent(Login.this,Home.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Username Atau Password Salah", LENGTH_SHORT).show();
                }
            }
        });


    }
}

