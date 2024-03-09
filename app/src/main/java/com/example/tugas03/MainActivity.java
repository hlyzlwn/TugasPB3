package com.example.tugas03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton gambartoko1 = findViewById(R.id.gambartoko1);
        ImageButton gambartoko2 = findViewById(R.id.gambartoko2);
        ImageButton gambartoko3 = findViewById(R.id.gambartoko3);

        gambartoko1.setOnClickListener(this);
        gambartoko2.setOnClickListener(this);
        gambartoko3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == R.id.gambartoko1){
            Intent Gambartoko1 = new Intent(MainActivity.this, ActivityAlbumFTS.class);
            startActivity(Gambartoko1);
        }
        else if (v.getId() == R.id.gambartoko2){
            Intent Gambartoko2 = new Intent(MainActivity.this, AlbumAnOdeActivity.class);
            startActivity(Gambartoko2);
        }
        else if (v.getId() == R.id.gambartoko3){
            Intent Gambartoko3 = new Intent(MainActivity.this, ArtisCollectionActivity.class);
            startActivity(Gambartoko3);
        }


    }
}



