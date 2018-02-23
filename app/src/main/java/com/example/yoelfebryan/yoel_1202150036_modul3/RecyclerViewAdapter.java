package com.example.yoelfebryan.yoel_1202150036_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Yoel Febryan on 22/02/2018.
 */

public class RecyclerViewAdapter extends AppCompatActivity {
    private RecyclerView rvmenu;
    private RecyclerView.Adapter rvadapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Detail;
    private ArrayList<Integer> Gambar;

    //Daftar Menu, Daftar Detail, Daftar Gambar
    private String[] menu = {"Ades", "Amidis", "Aqua", "Cleo","Club", "Equil", "Evian","Le Minerale","Nestle","Pristine","Vit"};
    private String[] detail = {"Ini adalah air mineral merk Ades", "Ini adalah air mineral merk Amidis", "Ini adalah air mineral merk Aqua",
                            "Ini adalah air mineral merk Cleo", "Ini adalah air mineral merk Club", "Ini adalah air mineral merk Equil",
                            "Ini adalah air mineral merk Evian","Ini adalah air mineral merk Le Minerale","Ini adalah air mineral merk Nestle",
                            "Ini adalah air mineral merk Pristine","Ini adalah air mineral merk Vit"};
    private int[] gambar = {R.drawable.ades, R.drawable.amidis, R.drawable.aqua, R.drawable.cleo, R.drawable.club, R.drawable.equil,
                            R.drawable.evian,R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        Menu = new ArrayList<>();
        Detail = new ArrayList<>();
        Gambar = new ArrayList<>();

        rvmenu = findViewById(R.id.RVmenu);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        rvmenu.setLayoutManager(layoutManager);
        rvmenu.setHasFixedSize(true);
        rvadapter = new MainActivity(Menu,Detail,Gambar);
        rvmenu.setAdapter(rvadapter);
    }

    private void DaftarItem() {
        for (int a=0; a<menu.length; a++){
            Gambar.add(gambar[a]);
            Menu.add(menu[a]);
            Detail.add(detail[a]);
        }
    }
}
