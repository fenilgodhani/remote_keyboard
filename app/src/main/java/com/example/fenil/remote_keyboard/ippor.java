package com.example.fenil.remote_keyboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ippor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ippor);
    }
    public void send(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
