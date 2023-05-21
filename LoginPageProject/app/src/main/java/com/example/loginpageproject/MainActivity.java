package com.example.loginpageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String kullanici;

    TextView showtxt;
    Button giris;
    EditText person_name, password;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person_name = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
        giris = findViewById(R.id.button_Giris);

        try {
            db = this.openOrCreateDatabase("Login", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS person (Id INTEGER PRIMARY KEY, kullaniciadi VARCHAR, sifre VARCHAR)");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Cursor c = db.rawQuery("SELECT * FROM person ", null);
        int IdIndex = c.getColumnIndex("Id");
        int sifreIndex = c.getColumnIndex("sifre");
        int kullaniciadiIndex = c.getColumnIndex("kullaniciadi");
        while (c.moveToNext()) {

            String sifre=c.getString(sifreIndex).toString();
            kullanici=c.getString(kullaniciadiIndex).toString();
            giris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (person_name.getText().toString().equals(kullanici) && password.getText().toString().equals(sifre)) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        finish();
                        startActivity(intent);
                    } else
                        Toast.makeText(MainActivity.this, "Kullanıcı Adı veya Şifre Yanlış!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void sqlprog(View view) {
        switch (view.getId()) {
            case R.id.button_Kaydol:
                try {
                    db.execSQL("INSERT INTO person(kullaniciadi,sifre) VALUES ('" + person_name.getText().toString() + "','" + password.getText().toString() + "')");
                    Toast.makeText(this, "Veri Eklendi", Toast.LENGTH_SHORT).show();
                    person_name.setText("");
                    password.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
