package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ff);
        getSupportActionBar().hide();
    }
}
