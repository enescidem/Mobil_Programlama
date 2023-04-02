package com.example.minigameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView kalan,puan;
    int skor;
    ImageView []images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kalan = findViewById(R.id.textView_Kalan);
        puan = findViewById(R.id.textView_Puan);
        images = new ImageView[]{findViewById(R.id.imageButton1),findViewById(R.id.imageButton2),findViewById(R.id.imageButton3),
                findViewById(R.id.imageButton4),findViewById(R.id.imageButton5),findViewById(R.id.imageButton6),findViewById(R.id.imageButton7),
                findViewById(R.id.imageButton8),findViewById(R.id.imageButton9) };

        hideImages();

        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {

                hideImages();

                Random random = new Random();
                int uretilen = random.nextInt(9);
                images[uretilen].setVisibility(View.VISIBLE);

                kalan.setText("Kalan Süre : " + l/1000);
            }

            @Override
            public void onFinish() {

                hideImages();

            }
        }.start();
    }

    public void hideImages(){

        for (ImageView gezici : images){
            gezici.setVisibility(View.INVISIBLE);
        }
    }
    public void yakala(View view){
        skor++;
        puan.setText("Puan : "+skor);
    }
}