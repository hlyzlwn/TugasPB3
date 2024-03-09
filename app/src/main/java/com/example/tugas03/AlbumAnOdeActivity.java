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

public class AlbumAnOdeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_album_an_ode);

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

    };

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cardView1) {
            int imageView = R.drawable.anode1;
            String tvnama1 = "Begin";
            String tvdesc1 = "- An Ode adalah 3th full album boygroup Seventeen dibawah naungan pledis entertaiment.\n" +
                             "- Dirilis pada 16 September 2019 dan mengeluarkan 2 singel, \"Hit\" dirilis sebagai singel utama album pada 5 Agustus 2019, diikuti dengan judul lagu, \"Fear\", \n" +
                             "- Konsep album ini lebih gelap dan kuat daripada konsep album seventeen yang biasanya ceria \n" +
                             "- Album ini didukung oleh tur Ode to You yang dimulai pada 8 Oktober 2019.\n" +
                             "- Konsep begin dilakukan didalam ruangan yang berisi tangga-tangga dan member terjebak didalamnya \n" +
                             "- Component : Outbox (Envelop), Photobook, CD, Mini Photobook, dan Random Photocard 4EA";

            String tvharga1 = "Rp 375.000";
            Intent movecardView1 = new Intent(AlbumAnOdeActivity.this, DetailActivity.class);

            movecardView1.putExtra("Gambar", R.drawable.anode1);
            movecardView1.putExtra("Nama", tvnama1);
            movecardView1.putExtra("Deskripsi", tvdesc1);
            movecardView1.putExtra("Harga", tvharga1);
            startActivity(movecardView1);
        } else if (v.getId() == R.id.cardView2) {
            int imageView = R.drawable.anode2;
            String tvnama2 = "Poet";
            String tvdesc2 = "- An Ode adalah 3th full album boygroup Seventeen dibawah naungan pledis entertaiment.\n" +
                             "- Dirilis pada 16 September 2019 dan mengeluarkan 2 singel, \"Hit\" dirilis sebagai singel utama album pada 5 Agustus 2019, diikuti dengan judul lagu, \"Fear\", \n" +
                             "- Konsep album ini lebih gelap dan kuat daripada konsep album seventeen yang biasanya ceria \n" +
                             "- Poet version dilakukan dekan konsep y2k, yang mana member melakukan pemotretan per unitnya dengan konsep 90-an \n" +
                             "- Component : Outbox (Envelop), Photobook, CD, Mini Photobook, dan Random Photocard 4EA";
            String tvharga2 = "Rp 345.000";
            Intent movecardView2 = new Intent(AlbumAnOdeActivity.this, DetailActivity.class);

            movecardView2.putExtra("Gambar", R.drawable.anode2);
            movecardView2.putExtra("Nama", tvnama2);
            movecardView2.putExtra("Deskripsi", tvdesc2);
            movecardView2.putExtra("Harga", tvharga2);
            startActivity(movecardView2);
        } else if (v.getId() == R.id.cardView3) {
            int imageView = R.drawable.anode3;
            String tvnama3 = "Hope";
            String tvdesc3 = "- An Ode adalah 3th full album boygroup Seventeen dibawah naungan pledis entertaiment.\n" +
                             "- Dirilis pada 16 September 2019 dan mengeluarkan 2 singel, \"Hit\" dirilis sebagai singel utama album pada 5 Agustus 2019, diikuti dengan judul lagu, \"Fear\", \n" +
                             "- Konsep album ini lebih gelap dan kuat daripada konsep album seventeen yang biasanya ceria \n" +
                             "- Konsep Hope dilakukan dipadang rumput hijau, sesuai dg cover albumnya, hope version bertema hijau, dan member menggunakan topi baret untuk konsep hope\n " +
                             "- Component : Outbox (Envelop), Photobook, CD, Mini Photobook, dan Random Photocard 4EA";
            String tvharga3 = "Rp 335.000";
            Intent movecardView3 = new Intent(AlbumAnOdeActivity.this, DetailActivity.class);

            movecardView3.putExtra("Gambar", R.drawable.anode3);
            movecardView3.putExtra("Nama", tvnama3);
            movecardView3.putExtra("Deskripsi", tvdesc3);
            movecardView3.putExtra("Harga", tvharga3);
            startActivity(movecardView3);
        } else if (v.getId() == R.id.cardView4) {
            int imageView = R.drawable.anode4;
            String tvnama4 = "Truth";
            String tvdesc4 = "- An Ode adalah 3th full album boygroup Seventeen dibawah naungan pledis entertaiment.\n" +
                             "- Dirilis pada 16 September 2019 dan mengeluarkan 2 singel, \"Hit\" dirilis sebagai singel utama album pada 5 Agustus 2019, diikuti dengan judul lagu, \"Fear\", \n" +
                             "- Konsep album ini lebih gelap dan kuat daripada konsep album seventeen yang biasanya ceria \n" +
                             "- Konsep Truth lebih formal drpd konsep lainnya, disini member menggunakan tuxedo dalam pengambilan gambarnya dan latarnya menggunakan warna putih \n " +
                             "- Component : Outbox (Envelop), Photobook, CD, Mini Photobook, dan Random Photocard 4EA";
            String tvharga4 = "Rp 345.000";
            Intent movecardView4 = new Intent(AlbumAnOdeActivity.this, DetailActivity.class);

            movecardView4.putExtra("Gambar", R.drawable.anode4);
            movecardView4.putExtra("Nama", tvnama4);
            movecardView4.putExtra("Deskripsi", tvdesc4);
            movecardView4.putExtra("Harga", tvharga4);
            startActivity(movecardView4);
        } else if (v.getId() == R.id.cardView5) {
            int imageView = R.drawable.anode5;
            String tvnama5 = "Real";
            String tvdesc5 = "- An Ode adalah 3th full album boygroup Seventeen dibawah naungan pledis entertaiment.\n" +
                             "- Dirilis pada 16 September 2019 dan mengeluarkan 2 singel, \"Hit\" dirilis sebagai singel utama album pada 5 Agustus 2019, diikuti dengan judul lagu, \"Fear\", \n" +
                             "- Konsep album ini lebih gelap dan kuat daripada konsep album seventeen yang biasanya ceria \n" +
                             "- Konsep Real lebih bebas, disini member menggunakan outfit yang lebih santai, serta konsep foto nya diambil seperti member lagi santai  \n " +
                             "- Component : Outbox (Envelop), Photobook, CD, Mini Photobook, dan Random Photocard 4EA";
            String tvharga5 = "Rp 315.000";
            Intent movecardView5 = new Intent(AlbumAnOdeActivity.this, DetailActivity.class);

            movecardView5.putExtra("Gambar", R.drawable.anode5);
            movecardView5.putExtra("Nama", tvnama5);
            movecardView5.putExtra("Deskripsi", tvdesc5);
            movecardView5.putExtra("Harga", tvharga5);
            startActivity(movecardView5);
        }
    }
}