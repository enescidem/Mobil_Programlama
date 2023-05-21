package com.example.loginpageproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {


        BottomNavigationView bottomNavim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavim=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new HomeFrag()).commit();
        bottomNavim.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new HomeFrag()).commit();
                        break;
                    case R.id.Search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new SearchFrag()).commit();
                        break;
                    case R.id.Person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new PersonFrag()).commit();
                        break;
                }

                return true;
            }
        });
    }
}