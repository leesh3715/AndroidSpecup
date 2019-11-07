package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Created by leesh3715 on 2018-11-16.
 */

public class ContestActivity extends AppCompatActivity {
    Button pre_con,contest1, contest2, contest3, contest4, contest5, contest6, contest7, contest8, contest10, contest11, contest12;
    Button map;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contest);


        pre_con = (Button) findViewById(R.id.pre_con);
        contest1 = (Button) findViewById(R.id.contest1);
        contest2 = (Button) findViewById(R.id.contest2);
        contest3 = (Button) findViewById(R.id.contest3);
        contest4 = (Button) findViewById(R.id.contest4);
        contest5 = (Button) findViewById(R.id.contest5);
        contest6 = (Button) findViewById(R.id.contest6);
        contest7= (Button) findViewById(R.id.contest7);
        contest8= (Button) findViewById(R.id.contest8);
        contest10= (Button) findViewById(R.id.contest10);
        contest11= (Button) findViewById(R.id.contest11);
        contest12= (Button) findViewById(R.id.contest12);
        map = (Button) findViewById(R.id.map);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.board:
                        Intent boardintent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://buspecup.modoo.at/?link=dpj0airi"));
                        startActivity(boardintent);
                        break;
                    case R.id.homepage:
                        Intent homepageintent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://buspecup.com/"));
                        startActivity(homepageintent);
                        break;
                    case R.id.back:
                        //이전 페이지로 화면전환
                        Intent intent = new Intent(ContestActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });




        contest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=8421"));
                startActivity(mIntent);
            }
        });

        contest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=8313"));
                startActivity(mIntent);
            }
        });
        contest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=8550"));
                startActivity(mIntent);
            }
        });
        contest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=8289"));
                startActivity(mIntent);
            }
        });
        contest5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=7706"));
                startActivity(mIntent);
            }
        });
        contest6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=7292"));
                startActivity(mIntent);
            }
        });
        contest7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=7037"));
                startActivity(mIntent);
            }
        });
        contest8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=6783"));
                startActivity(mIntent);
            }
        });
        contest10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.thinkcontest.com/m/Contest/ContestDetail.html?id=6751"));
                startActivity(mIntent);
            }
        });
        contest11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.wevity.com/?c=find&s=1&gbn=viewok&gp=1&ix=26561"));
                startActivity(mIntent);
            }
        });
        contest12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.linkonaward.com/"));
                startActivity(mIntent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), MapsActivity1.class);
                startActivity(intent);
            }
        });
    }
    public void onButtonClick1(View v) {
        Toast.makeText(this,"마감된 공모전입니다.", Toast.LENGTH_LONG).show();
    }
}