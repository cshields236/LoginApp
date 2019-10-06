package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String username = "Tom";
    String pw = "123";
    public static final String KEY1="com.example.MESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void logIn(View view){
        Intent intent= new Intent(this, LoggedIn.class);
        EditText un =findViewById(R.id.usernameField);
        EditText p = findViewById(R.id.passwordField);

        String user = un.getText().toString();
        String pass = p.getText().toString();

        if (user.equals(username) && Objects.equals(pass, pw)){
            intent.putExtra(KEY1 ,username);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Incorrect Details " + user + " you stupid twat", Toast.LENGTH_LONG).show();
        }

    }
}
