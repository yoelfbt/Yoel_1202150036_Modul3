package com.example.yoelfebryan.yoel_1202150036_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yoel Febryan on 22/02/2018.
 */

public class MainActivity extends RecyclerView.Adapter<MainActivity.ViewHolder> {
    private ArrayList<String> ALmenu; //Membuat Arraylist untuk Judul
    private ArrayList<String> ALdetail; //Membuat Arraylist untuk Detail
    private ArrayList<Integer> ALgambar; //Membuat Arraylist Gambar

    //Membuat Konstruktor pada Class ini
    MainActivity(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsDetail, ArrayList<Integer> arrayListGambar){
        this.ALmenu = arrayListMenu;
        this.ALdetail = arrayListsDetail;
        this.ALgambar = arrayListGambar;
    }
    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView menu, detail;
        private ImageView gambar;
        private LinearLayout ItemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada activity_daftarmenu
            menu = itemView.findViewById(R.id.TVmenu);
            detail = itemView.findViewById(R.id.TVdetail);
            gambar = itemView.findViewById(R.id.IVgambar);
            ItemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public MainActivity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Mengarahkan View agar ditampilkan pada activity_layout.xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MainActivity.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = ALmenu.get(position);
        final String detail = ALdetail.get(position);
        final Integer gambar = ALgambar.get(position);
        holder.menu.setText(menu);
        holder.detail.setText(detail);
        holder.gambar.setImageResource(gambar);

        //Membuat aksi saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DetailActivity.class);
                String detail;
                switch (position){
                    case 0:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 1:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 2:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 3:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 4:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 5:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Equil adalah air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk .lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 6:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.\n" +
                                "\n" +
                                "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.\n" +
                                "\n" +
                                "Dalam budaya masyarakat, Evian ditampilkan sebagai produk air kemasan mewah dan mahal. Produk ini disebutkan dalam Murder on the Orient Express karya Agatha Christie. Air kemasan ini populer di kalangan selebriti Hollywood.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 7:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 8:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Perusahaan yang meraih peringkat pertama ini bermarkasi di Vevey, Swiss. Dari pendapatannya, Nestle memang menjadi perusahaan teratas. Produk mereka begitu luas meliputi makanan bayi, teh, serel, makanan instan, air kemasan, dsb. Khusus untuk air, Nestle memiliki brand Nestle Water, yang tersebar sebanyak 64 merk di berbagai negara. 7% penjualan perusahaan berasal dari divisi air botol ini. Beberapa merk terkenal mereka yaitu PureLife, Poland Spring, Acqua Panna, Deer Park, springs, Water Park, San Pellegrino, Perrier dan Waterline. Nestle Water di Amerika Utara yang sudah memproduksi merk PureLife. Pemasarannya sendiri dilakukan di Amerika Serikat dan Kanada.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 9:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "Pristine dengan kandungan Alkaline Water yang berisi air basa yang ber Ph 8+, dapat berfungsi untuk mengecilkan pori-pori sehingga kulit wajah akan menjadi lebih kencang. Jika kamu bermasalah dengan flek hitam, tidak perlu khawatir. Air Alkali juga bisa membantu untuk menghilangkannya. Sehingga wajah terlihat segar, tidak kusam, serta dapat juga digunakan untuk menghilangkan jerawat-jerawat dan bekas luka.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                    case 10:
                        intent.putExtra("menu",ALmenu.get(position));
                        intent.putExtra("gambar",ALgambar.get(position));
                        detail = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.";
                        intent.putExtra("detail",detail);
                        v.getContext().startActivities(new Intent[]{intent});
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return ALmenu.size();
    }

}
