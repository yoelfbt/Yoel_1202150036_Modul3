package com.example.yoelfebryan.yoel_1202150036_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.Collections;

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

        rvmenu = findViewById(R.id.RVmenu);
        //Get the appropriate column count
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        //Set the Layout Manager
        rvmenu.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        Menu = new ArrayList<>();
        Detail = new ArrayList<>();
        Gambar = new ArrayList<>();

        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        rvadapter = new MainActivity(Menu,Detail,Gambar);
        //Memasang Adapter pada RecyclerView
        rvmenu.setAdapter(rvadapter);
        DaftarItem();

        // If there is more than one column, disable swipe to dismiss
        int swipeDirs;
        if(gridColumnCount > 1){
            swipeDirs = 0;
        } else {
            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        }
        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
                (ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN
                        | ItemTouchHelper.UP, swipeDirs) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();

                //Swap the items and notify the adapter
                Collections.swap(Detail, from,to);
                Collections.swap(Menu,from,to);
                Collections.swap(Gambar,from,to);
                rvadapter.notifyItemMoved(from, to);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                Menu.remove(viewHolder.getAdapterPosition());
                Detail.remove(viewHolder.getAdapterPosition());
                Gambar.remove(viewHolder.getAdapterPosition());
                //Notify the adapter
                rvadapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(rvmenu);
    }

    private void DaftarItem() {
        for (int a=0; a<menu.length; a++){
            Gambar.add(gambar[a]);
            Menu.add(menu[a]);
            Detail.add(detail[a]);
        }
    }
}
