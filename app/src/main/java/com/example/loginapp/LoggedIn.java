package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        Intent intent = getIntent();
        String user = intent.getStringExtra(MainActivity.KEY1);
        TextView txt = findViewById(R.id.welcome);
        txt.setText("Hello, " + user + ". Welcome to the app!");
    }

    public void goBack(View view){
        this.finish();
    }
}
