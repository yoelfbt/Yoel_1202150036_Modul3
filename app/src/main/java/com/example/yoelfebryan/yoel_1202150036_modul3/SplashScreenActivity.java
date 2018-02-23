package com.example.yoelfebryan.yoel_1202150036_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {
    //Mengatur waktu dari splash screen
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //Menghilangkan actionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //Mengatur perpindahan aktivity setelah splash screen dan memunculkan toast
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(menu);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
