package com.example.tugas03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ArtisCollectionActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_artis_collection);

        CardView cardView1 = findViewById(R.id.cardView1);
        CardView cardView2 = findViewById(R.id.cardView2);
        CardView cardView3 = findViewById(R.id.cardView3);
        CardView cardView4 = findViewById(R.id.cardView4);
        CardView cardView5 = findViewById(R.id.cardView5);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);

    }

    ;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cardView1) {
            int imageView = R.drawable.ac1;
            String tvnama1 = "Pluffy Toram and BL";
            String tvdesc1 = "- Artis collection by Joenghan seventeen adalah Boneka dan Blanket. Boneka ini diberi Jjong Toram\n" +
                             "- Ketika kita membeli ini kita akan mendapatkan boneka dengan karakter mixof tupai berwarna pink yang sedang memeluk permen berwarna kuning yang didalamnya ada blanket. Bahan yang digunakan untuk membuat boneka ini sangat lembut, sehingga sangat nyaman untuk dibawa tidur ditambah ukuran nya lumayan besar. Alasan Joenghan membuat ini karena ia selalu Selimut saat ia berlibur di dalam mobil. \n" +
                             "- Component : Plush toy 1EA, Sticker 1EA, Making log 1EA, dan Photocard 1EA";
            String tvharga1 = "Rp 1.120.000";
            Intent movecardView1 = new Intent(ArtisCollectionActivity.this, DetailActivity.class);

            movecardView1.putExtra("Gambar", R.drawable.ac1);
            movecardView1.putExtra("Nama", tvnama1);
            movecardView1.putExtra("Deskripsi", tvdesc1);
            movecardView1.putExtra("Harga", tvharga1);
            startActivity(movecardView1);
        } else if (v.getId() == R.id.cardView2) {
            int imageView = R.drawable.ac2;
            String tvnama2 = "Domino Glass Set";
            String tvdesc2 = "- Set gelas nya bertuliskan scoups. Set ini berisi 3 gelas, yaitu gelas bir 500ml, gelas somaek 280ml, dan gelas soju 50ml.\n" +
                             "- Bagian gambar pada gelas ini bereaksi terhadap suhu dan berubah merah saat isi dengan cairan dingin. Gelas samoek memiliki rasio yang disarankan scoups sendiri, tuangkan minuman hingga garis yang berwarna biru. Gelas soju menampilkan grafis ceri dan font bergaya retro, mengacu pada nama panggilan scoups.\n" +
                             "- Component : Beer glass(500mL) 1EA, Somaek glass(280mL) 1EA, Soju glass(50mL) 1EA, Making Log 1EA, dan Photocard 1EA";
            String tvharga2 = "Rp 1.150.000";
            Intent movecardView2 = new Intent(ArtisCollectionActivity.this, DetailActivity.class);

            movecardView2.putExtra("Gambar", R.drawable.ac2);
            movecardView2.putExtra("Nama", tvnama2);
            movecardView2.putExtra("Deskripsi", tvdesc2);
            movecardView2.putExtra("Harga", tvharga2);
            startActivity(movecardView2);
        } else if (v.getId() == R.id.cardView3) {
            int imageView = R.drawable.ac3;
            String tvnama3 = "Parfum DIY Kit";
            String tvdesc3 = "- Perlengkapan parfum DIY by Joshua berisi 6 wewangian, dipilih secara pribadi dan wewangiannya diberi nama sendiri oleh Joshua. \n"+
                             "- Perlengkapan tersebut mencakup peralatan yang kamu perlukan untuk membuat parfum sendiri, seperti gelas kimia, corong, dan botol parfum kosong. Jika kamu bingung untuk membuatnya, kamu bisa mengikuti resep yang dibuat Joshua sendiri (Pulse-Pause). Resep tersebut dibuat khusu untuk carat, yaitu winter, Sunday morning, dear deer, love road, fresh me, dan tender ground.\n" +
                             "- Component : Mood light 1EA, Sticker 1EA, Making log 1EA, dan Photocard 1EA.";
            String tvharga3 = "Rp 1.130.000";
            Intent movecardView3 = new Intent(ArtisCollectionActivity.this, DetailActivity.class);

            movecardView3.putExtra("Gambar", R.drawable.ac3);
            movecardView3.putExtra("Nama", tvnama3);
            movecardView3.putExtra("Deskripsi", tvdesc3);
            movecardView3.putExtra("Harga", tvharga3);
            startActivity(movecardView3);
        } else if (v.getId() == R.id.cardView4) {
            int imageView = R.drawable.ac4;
            String tvnama4 = "O.C.L Phone Case";
            String tvdesc4 = "- “Open, Close, Lock” adalah 3 nama dari phone case by Jun seventeen. \n" +
                             "- Design phone case nya kenapa kucing karena karakter jun sendiri di going seventeen adalah kucing. Kucing yang ada di phone case tersebut hidup Bersama disebuah desa kucing, namun mereka memiliki kepribadian yang sangat berbeda. Untuk bahan casingnya ada softcase utk yang transparan dan hardcase untuk warna putih dan hitam. Case yang transparan dan hitam akan menampilkan gambar kucing yang 3 dimensi. \n" +
                             "- Component : Phone case 3EA, Making log 1EA, dan Photocard 1EA";
            String tvharga4 = "Rp 870.000";
            Intent movecardView4 = new Intent(ArtisCollectionActivity.this, DetailActivity.class);

            movecardView4.putExtra("Gambar", R.drawable.ac4);
            movecardView4.putExtra("Nama", tvnama4);
            movecardView4.putExtra("Deskripsi", tvdesc4);
            movecardView4.putExtra("Harga", tvharga4);
            startActivity(movecardView4);
        } else if (v.getId() == R.id.cardView5) {
            int imageView = R.drawable.ac5;
            String tvnama5 = "Plush Tamtam";
            String tvdesc5 = "- Boneka harimau yang memiliki perut seperti hamster diberi nama TamTam by Hoshi. \n"+
                             "- Ukuran dr boneka ini dibuat besar agar bisa dipeluk. Design boneka harimau yang mirip hamster dikombinasikan karena mengingat karkater hoshi hamster yang sangat suka harimau.\n"+
                             "- Deskripi TamTam ; tempat tinggal di gua harimau, hobi nya memainkan game lampu merah, lampu hijau, kepribadian supel ramah dan lembut, lagu kesukaan horangi power, dan karakteristiknya perut buncit. ";
            String tvharga5 = "Rp 1.100.000";
            Intent movecardView5 = new Intent(ArtisCollectionActivity.this, DetailActivity.class);

            movecardView5.putExtra("Gambar", R.drawable.ac5);
            movecardView5.putExtra("Nama", tvnama5);
            movecardView5.putExtra("Deskripsi", tvdesc5);
            movecardView5.putExtra("Harga", tvharga5);
            startActivity(movecardView5);
        }
    }
}