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



public class LicenseActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;


    @SuppressLint("CutPasteId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_license);
      //  Log.d("ACTIVITY_LC", "onCreate 호풀됨");
       // Toast.makeText(getApplicationContext(),"onCreate 호출됨", Toast.LENGTH_SHORT).show();

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
                        Intent intent = new Intent(LicenseActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });

        ImageButton aaButton = (ImageButton) findViewById(R.id.aaButton);
        aaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), aaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton bbButton = (ImageButton) findViewById(R.id.bbButton);
        bbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), bbActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ccButton = (ImageButton) findViewById(R.id.ccButton);
        ccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), ccActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ddButton = (ImageButton) findViewById(R.id.ddButton);
        ddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), ddActivity.class);
                startActivity(intent);
            }
        });
        ImageButton eeButton = (ImageButton) findViewById(R.id.eeButton);
        eeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), eeActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ffButton = (ImageButton) findViewById(R.id.ffButton);
        ffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(), ffActivity.class);
                startActivity(intent);
            }
        });


    }
    public void onButtonClick2(View v) {
        Toast.makeText(this,"Screenshot saved", Toast.LENGTH_LONG).show();
    }


}
