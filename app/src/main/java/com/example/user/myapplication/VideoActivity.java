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


public class VideoActivity extends AppCompatActivity {
    Button pre_video,video1,video2,video3,video4,video5,video6,video7,video8,video9,video10,video11,video12;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("CutPasteId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_video);

        pre_video = (Button) findViewById(R.id.pre_video);
        video1 = (Button) findViewById(R.id.video1);
        video2 = (Button) findViewById(R.id.video2);
        video3 = (Button) findViewById(R.id.video3);
        video4 = (Button) findViewById(R.id.video4);
        video5 = (Button) findViewById(R.id.video5);
        video6 = (Button) findViewById(R.id.video6);
        video7 = (Button) findViewById(R.id.video7);
        video8 = (Button) findViewById(R.id.video8);
        video9 = (Button) findViewById(R.id.video9);
        video10 = (Button) findViewById(R.id.video10);
        video11 = (Button) findViewById(R.id.video11);
        video12 = (Button) findViewById(R.id.video12);


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
                        break;
                    case R.id.back:
                        //이전 페이지로 화면전환
                        Intent intent = new Intent(VideoActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });


        pre_video.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             //이전 페이지로 화면전환
                                             Intent intent = new Intent(VideoActivity.this, MainActivity.class);
                                             startActivity(intent);
                                         }
                                     });

        video1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iqb1e5vOYDg"));
                                          startActivity(mIntent);
                                      }
                                  });

        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=3qzmhpxOkHM"));
                startActivity(mIntent);
            }
        });
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=EneN__s9HWc"));
                startActivity(mIntent);
            }
        });
        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=CAsTgbWlpIo"));
                startActivity(mIntent);
            }
        });
        video5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=gFXTG0epEfc"));
                startActivity(mIntent);
            }
        });
        video6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=4m6AuVoWx84"));
                startActivity(mIntent);
            }
        });
        video7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=Ai-fWjyi-zE"));
                startActivity(mIntent);
            }
        });
        video8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=g7uAV-5Pkyw"));
                startActivity(mIntent);
            }
        });
        video9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=-91jQIEYmQg"));
                startActivity(mIntent);
            }
        });
        video10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=KE6DfJUT_1I"));
                startActivity(mIntent);
            }
        });
        video11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=PP2t-_0j6ME"));
                startActivity(mIntent);
            }
        });
    }
}
