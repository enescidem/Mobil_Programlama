package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textSonuc,textislem;
    Button buton0, buton1,buton2,buton3,buton4,buton5,buton6,buton7,buton8,buton9,butonarti,butoneksi,butonbolme,butoncarpma,butonclear,butonesittir,butonnokta,butonsil;

    int islem=0;
    double sonuc=0.0,ilk_sayi=0.0,ikinci_sayi=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton0=findViewById(R.id.button_0);
        buton1=findViewById(R.id.button_1);
        buton2=findViewById(R.id.button_2);
        buton3=findViewById(R.id.button_3);
        buton4=findViewById(R.id.button_4);
        buton5=findViewById(R.id.button_5);
        buton6=findViewById(R.id.button_6);
        buton7=findViewById(R.id.button_7);
        buton8=findViewById(R.id.button_8);
        buton9=findViewById(R.id.button_9);
        butonnokta=findViewById(R.id.button_nokta);
        butonarti=findViewById(R.id.button_arti);
        butoneksi=findViewById(R.id.button_eksi);
        butoncarpma=findViewById(R.id.button_x);
        butonbolme=findViewById(R.id.button_bolme);
        butonclear=findViewById(R.id.button_C);
        butonsil=findViewById(R.id.button_silme);
        butonesittir=findViewById(R.id.button_esittir);
        textSonuc=findViewById(R.id.textView_sonuc);
        textislem=findViewById(R.id.textView_islem);



        butonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText("");
                textSonuc.setText("");
            }
        });
        butonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText().toString().substring(0, textislem.length() - 1));
            }
        });

        buton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText() + "0");
            }
        });
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"1");
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"2");
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"3");
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"4");
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"5");
            }
        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"6");
            }
        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"7");
            }
        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"8");
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"9");
            }
        });
        butonnokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+".");
            }
        });
        butonarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textislem.setText(textislem.getText()+"+");
                islem=1;

            }
        });
        butoneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textislem.setText(textislem.getText()+"-");
                islem=2;

            }
        });
        butoncarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textislem.setText(textislem.getText()+"*");
                islem=3;
            }
        });
        butonbolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textislem.setText(textislem.getText()+"/");
                islem=4;
            }
        });
        butonesittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String[] sayilar=textislem.getText().toString().split("[\\+\\-\\/\\*]+");
                ilk_sayi=Double.parseDouble(sayilar[0]);
                ikinci_sayi=Double.parseDouble(sayilar[1]);

                if(islem==1){
                    sonuc=ilk_sayi+ikinci_sayi;
                    textSonuc.setText(Double.toString(sonuc));
                }
                else if(islem==2){
                    sonuc=ilk_sayi-ikinci_sayi;
                    textSonuc.setText(Double.toString(sonuc));
                }
                else if(islem==3){
                    sonuc=ilk_sayi*ikinci_sayi;
                    textSonuc.setText(Double.toString(sonuc));
                }
                else if(islem==4){
                    sonuc=ilk_sayi/ikinci_sayi;
                    textSonuc.setText(Double.toString(sonuc));
                }
            }
        });
    }
}