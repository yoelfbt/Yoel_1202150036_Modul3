package com.example.yoelfebryan.yoel_1202150036_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yoel Febryan on 22/02/2018.
 */

public class DetailActivity extends AppCompatActivity {
    private static final int BATTERY_20 = 0;
    private static final int BATTERY_30 = 1;
    private static final int BATTERY_50 = 2;
    private static final int BATTERY_60 = 3;
    private static final int BATTERY_80 = 4;
    private static final int BATTERY_90 = 5;
    private static final int BATTERY_FULL = 6;
    int literawal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //mendifinisikan TextView dan ImageView dengan id
        TextView Menu = findViewById(R.id.namaMenu);
        TextView Detail = findViewById(R.id.detailMenu);
        ImageView Gambar = findViewById(R.id.gambarMenu);
        Button minus = findViewById(R.id.btnminus);
        Button plus = findViewById(R.id.btnplus);
        final TextView liter = findViewById(R.id.tvliter);
        final ImageView Batery = findViewById(R.id.gambarBatery);

        //menerima value yang dikirimkan dari activity sebelumnya dengan syarat namenya harus sama
        Integer gambar = getIntent().getIntExtra("gambar",0);
        String menu = getIntent().getStringExtra("menu");
        String detail = getIntent().getStringExtra("detail");

        //mengeset valuenya agar bisa ditampilkan pada class xml
        Gambar.setImageResource(gambar);
        Menu.setText(menu);
        Detail.setText(detail);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                }
                literawal -=1;
                if (literawal==0){
                    Batery.setImageLevel(literawal);
                    Toast.makeText(DetailActivity.this,"Air Sedikit",Toast.LENGTH_SHORT).show();
                }else if(literawal==1){
                    Batery.setImageLevel(literawal);
                }else if(literawal==2){
                    Batery.setImageLevel(literawal);
                }else if(literawal==3){
                    Batery.setImageLevel(literawal);
                }else if(literawal==4){
                    Batery.setImageLevel(literawal);
                }else if(literawal==5){
                    Batery.setImageLevel(literawal);
                }else if(literawal==6){
                    Batery.setImageLevel(literawal);
                    Toast.makeText(DetailActivity.this,"Air Penuh",Toast.LENGTH_SHORT).show();
                }
                liter.setText(literawal+"L");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                literawal +=1;
                if (literawal==0){
                    Batery.setImageLevel(literawal);
                    Toast.makeText(DetailActivity.this,"Air Sedikit",Toast.LENGTH_SHORT).show();
                }else if(literawal==1){
                    Batery.setImageLevel(literawal);
                }else if(literawal==2){
                    Batery.setImageLevel(literawal);
                }else if(literawal==3){
                    Batery.setImageLevel(literawal);
                }else if(literawal==4){
                    Batery.setImageLevel(literawal);
                }else if(literawal==5){
                    Batery.setImageLevel(literawal);
                }else if(literawal==6){
                    Batery.setImageLevel(literawal);
                    Toast.makeText(DetailActivity.this,"Air Penuh",Toast.LENGTH_SHORT).show();
                }
                liter.setText(literawal+"L");
            }
        });
    }
}
