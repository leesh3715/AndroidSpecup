package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by sdm93 on 2018-10-09.
 */

public class EmploymentActivity extends AppCompatActivity {
    Button pre_emp,home1,home2,home3,home4,home5,home6,call1,call2,call3,call4,call5,call6;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("CutPasteId")


    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_employment);

        pre_emp = (Button) findViewById(R.id.pre_emp);
        home1 = (Button) findViewById(R.id.home1);
        home2 = (Button) findViewById(R.id.home2);
        home3 = (Button) findViewById(R.id.home3);
        home4 = (Button) findViewById(R.id.home4);
        home5 = (Button) findViewById(R.id.home5);
        home6 = (Button) findViewById(R.id.home6);
        call1 = (Button) findViewById(R.id.call1);
        call2 = (Button) findViewById(R.id.call2);
        call3 = (Button) findViewById(R.id.call3);
        call4 = (Button) findViewById(R.id.call4);
        call5 = (Button) findViewById(R.id.call5);
        call6 = (Button) findViewById(R.id.call6);


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
                        Intent intent = new Intent(EmploymentActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });

        pre_emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //화면을 전환하는 클래스
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bluehole.jobagent.co.kr"));
                startActivity(mIntent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paxnet.moneta.co.kr"));
                startActivity(mIntent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.bpnr.co.kr"));
                startActivity(mIntent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.ninefive.com"));
                startActivity(mIntent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" hhttp://www.ldcc.co.kr"));
                startActivity(mIntent);
            }
        });
        home6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kr.ncsoft.com/korean"));
                startActivity(mIntent);
            }
        });

        call1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/031-698-3311"));
                startActivity(mIntent);
            }
        });

        call2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/1688-5010"));
                startActivity(mIntent);
            }
        });

        call3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/02-723-3591"));
                startActivity(mIntent);
            }
        });

        call4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/82-2-456-7838"));
                startActivity(mIntent);
            }
        });
        call5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/02-2626-4000"));
                startActivity(mIntent);
            }
        });

        call6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/1600-0020"));
                startActivity(mIntent);
            }
        });


    }
}
