package com.example.tugas03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityAlbumFTS extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_album_fts);

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
            int imageView = R.drawable.fts1;
            String tvnama1 = "ep.1 Control";
            String tvdesc1 = "- 4th album keempat seventeen adalah face the sun\n" +
                             "- Dirilis pada 27 Mei 2022 dan berisi sembilan lagu, dengan Hot sebagai single utama. Lagu pertama, \" Darl+ing \", dirilis sebelumnya pada 15 April 2022 " +
                             "- Konsep pemotretan jacketnya versi control seperti manekin, menggunakan baju berwarna abu-abu dengan gaya rambut semua membernya klimis.\n" +
                             "- Konsepnya mereka sedang terjebak dalam ruangan yang terkendali yang mereka tidak bisa melakukan apa-apa, semua pergerakan mereka dikontrol.\n" +
                             "- Component : Outbox - Highlighter Pen (First Press Only), Photo Book, Pet Card, Lyric Book, CD-R, Photo Card 4EA, dan Postcard";
            String tvharga1 = "Rp 315.000";

            Intent movecardView1 = new Intent(ActivityAlbumFTS.this, DetailActivity.class);
            movecardView1.putExtra("Gambar", R.drawable.fts1);
            movecardView1.putExtra("Nama", tvnama1);
            movecardView1.putExtra("Deskripsi", tvdesc1);
            movecardView1.putExtra("Harga", tvharga1);
            startActivity(movecardView1);
        } else if (v.getId() == R.id.cardView2) {
            int imageView = R.drawable.fts2;
            String tvnama2 = "ep.2 Shadow";
            String tvdesc2 = "- 4th album keempat seventeen adalah face the sun\n" +
                             "- Dirilis pada 27 Mei 2022 dan berisi sembilan lagu, dengan Hot sebagai single utama. Lagu pertama Darl+ing dirilis sebelumnya pada 15 April 2022 " +
                             "- Konsepnya setelah mereka dikontrol di versi 1, mereka harus berusaha melepaskan diri dari kontrolan dan menemukan member lain yang diikat diversi 2 ini (shadow)\n +" +
                             "- Konsep dalam pemotretan jacketnya mereka diikat dan sedang terjebak disuatu tempat, mereka kebingungan dan kelelahan dalam mencari jalan keluar, tetapi mereka harus melepaskan diri dari kontrolan ini.\n" +
                             "- Component : Outbox - Highlighter Pen (First Press Only), Photo Book, Pet Card, Lyric Book, CD-R, Photo Card 4EA, dan Postcard";
            String tvharga2 = "Rp 315.000";
            Intent movecardView2 = new Intent(ActivityAlbumFTS.this, DetailActivity.class);

            movecardView2.putExtra("Gambar", R.drawable.fts2);
            movecardView2.putExtra("Nama", tvnama2);
            movecardView2.putExtra("Deskripsi", tvdesc2);
            movecardView2.putExtra("Harga", tvharga2);
            startActivity(movecardView2);
        } else if (v.getId() == R.id.cardView3) {
            int imageView = R.drawable.fts3;
            String tvnama3 = "ep.3 Ray";
            String tvdesc3 = "- 4th album keempat seventeen adalah face the sun\n" +
                             "- Dirilis pada 27 Mei 2022 dan berisi sembilan lagu, dengan Hot sebagai single utama. Lagu pertama Darl+ing dirilis sebelumnya pada 15 April 2022 " +
                             "- Konsep pemotretan jacket versi Ray adalah mereka telah dibebaskan dan menemukan kebebasan setelah mereka dikontrol dan berusaha melarikan diri di versi sebelumnya. Konsep ray ini member mencoba mencari kebebasan nya, seperti mereka bisa merasakan sinar matahari luar, menyentuh tanah, berjumpa dengan member lain, & bermain.\n"+
                             "- Component : Outbox - Highlighter Pen (First Press Only), Photo Book, Pet Card, Lyric Book, CD-R, Photo Card 4EA, dan Postcard";
            String tvharga3 = "Rp 315.000";
            Intent movecardView3 = new Intent(ActivityAlbumFTS.this, DetailActivity.class);

            movecardView3.putExtra("Gambar", R.drawable.fts3);
            movecardView3.putExtra("Nama", tvnama3);
            movecardView3.putExtra("Deskripsi", tvdesc3);
            movecardView3.putExtra("Harga", tvharga3);
            startActivity(movecardView3);
        } else if (v.getId() == R.id.cardView4) {
            int imageView = R.drawable.fts4;
            String tvnama4 = "ep.4 Path";
            String tvdesc4 = "- 4th album keempat seventeen adalah face the sun\n" +
                             "- Dirilis pada 27 Mei 2022 dan berisi sembilan lagu, dengan Hot sebagai single utama. Lagu pertama, \" Darl+ing \", dirilis sebelumnya pada 15 April 2022 " +
                             "- Konsep path adalah setelah mereka menemukan kebabasan diversi ray, sekarang mereka sedang menikmati kebebasan itu, tetapi masih bingung. Mereka senang mereka bebas, tetapi masih mencoba mengungkapkan apa yang sebenarnya sedang terjadi. Pemotretan nya dilakukan diluar ruangan, dipadang ilalang\n" +
                             "- Component : Outbox - Highlighter Pen (First Press Only), Photo Book, Pet Card, Lyric Book, CD-R, Photo Card 4EA, dan Postcard";
            String tvharga4 = "Rp 485.000";
            Intent movecardView4 = new Intent(ActivityAlbumFTS.this, DetailActivity.class);

            movecardView4.putExtra("Gambar", R.drawable.fts4);
            movecardView4.putExtra("Nama", tvnama4);
            movecardView4.putExtra("Deskripsi", tvdesc4);
            movecardView4.putExtra("Harga", tvharga4);
            startActivity(movecardView4);
        } else if (v.getId() == R.id.cardView5) {
            int imageView = R.drawable.fts5;
            String tvnama5 = "ep.5 Pioneer";
            String tvdesc5 = "- 4th album keempat seventeen adalah face the sun\n" +
                             "- Dirilis pada 27 Mei 2022 dan berisi sembilan lagu, dengan Hot sebagai single utama.\n" +
                             "- Konsep yang terakhir (Pioneer)ini sangat kuat, mereka telah menemukan arti kebebasan yang sebenarnya, dan mencoba melakukan hal baru yang lebih ekstrim. Mereka pergi kedunia baru dan mencoba hal baru bersama member yang lain. Dalam foto konsepnya, mereka menggunakan pakaian yang lebih berani, foto diantara motor-motor dan lebih percaya diri. \n" +
                             "- Component : Outbox - Highlighter Pen (First Press Only), Photo Book, Pet Card, Lyric Book, CD-R, Photo Card 4EA, dan Postcard";
            String tvharga5 = "Rp 350.000";
            Intent movecardView5 = new Intent(ActivityAlbumFTS.this, DetailActivity.class);

            movecardView5.putExtra("Gambar", R.drawable.fts5);
            movecardView5.putExtra("Nama", tvnama5);
            movecardView5.putExtra("Deskripsi", tvdesc5);
            movecardView5.putExtra("Harga", tvharga5);
            startActivity(movecardView5);
        }
    }
}