package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class MainActivity extends AppCompatActivity {

    Button btn_Video;
    Button btn_Lic;
    Button btn_Emp;
    Button btn_Con;


    AutoScrollViewPager autoViewPager;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("CutPasteId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

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

                        break;
                }
                return true;
            }
        });


        btn_Video = (Button) findViewById(R.id.btn_Video);
        btn_Lic = (Button) findViewById(R.id.btn_Lic);
        btn_Emp = (Button) findViewById(R.id.btn_Emp);
        btn_Con = (Button) findViewById(R.id.btn_Con);


        ArrayList<String> data = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        data.add("https://postfiles.pstatic.net/MjAxODExMjBfOTMg/MDAxNTQyNjc4NjQwMzYx.EuglHqzvZIep8dVn1taQ1dG8oKAJV0c5W8qR6s_l2WAg.rgdDSYL_LgbbT6y-DlmfdXwTRzFkBouaBpeBdUdjBi8g.PNG.leesh3715/banner33.png?type=w966");
        data.add("https://postfiles.pstatic.net/MjAxODExMjBfNzgg/MDAxNTQyNjc4NjQwMzkx.DHAfUtuHdkFqsJJaSjKvAT62muCiB1LXs_7aisldpTgg.GdBh00XTHu7y67VdNQbzGYxwb0w2geOX_sqIzVbAmZgg.PNG.leesh3715/banner22.png?type=w966");
        data.add("https://postfiles.pstatic.net/MjAxODExMjBfMjAw/MDAxNTQyNjc4NjQwNDA4.epikWimDj5V8T70xw3re3cDqKUpE6DRYFSApt1quv5og.dF0q0EzxEvn8NOG7CsnA4xnZMnlkqAsKIUBZQehIBCAg.PNG.leesh3715/banner11.png?type=w966");

        autoViewPager = (AutoScrollViewPager)findViewById(R.id.autoViewPager);
        AutoScrollAdapter scrollAdapter = new AutoScrollAdapter(this, data);
        autoViewPager.setAdapter(scrollAdapter); //Auto Viewpager에 Adapter 장착
        autoViewPager.setInterval(3000); // 페이지 넘어갈 시간 간격 설정
        autoViewPager.startAutoScroll(); //Auto Scroll 시작


        btn_Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                //화면을 전환하는 클래스
                startActivity(intent);
            }
        });

        btn_Lic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LicenseActivity.class);
                //화면을 전환하는 클래스
                startActivity(intent);
            }
        });
        btn_Emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmploymentActivity.class);
                //화면을 전환하는 클래스
                startActivity(intent);
            }
        });
        btn_Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ContestActivity.class);
                //화면을 전환하는 클래스
                startActivity(intent);
            }
        });



    }

}

