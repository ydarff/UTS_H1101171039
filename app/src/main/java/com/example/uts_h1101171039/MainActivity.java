package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Btn_komponen1,Btn_komponen2,Btn_komponen3,Btn_komponen4,Btn_komponen5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn_komponen1 = (Button) findViewById(R.id.btn_komponen1);
        Btn_komponen2 = (Button) findViewById(R.id.btn_komponen2);
        Btn_komponen3 = (Button) findViewById(R.id.btn_komponen3);
        Btn_komponen4 = (Button) findViewById(R.id.btn_komponen4);
        Btn_komponen5 = (Button) findViewById(R.id.btn_komponen5);

        Btn_komponen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp1 = new Intent(MainActivity.this,Komp1Activity.class);
                startActivity(komp1);
            }
        });


        Btn_komponen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp2 = new Intent(MainActivity.this,Komp2Activity.class);
                startActivity(komp2);
            }
        });

        Btn_komponen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp3 = new Intent(MainActivity.this,Komp3Activity.class);
                startActivity(komp3);
            }
        });

        Btn_komponen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp4 = new Intent(MainActivity.this,Komp4Activity.class);
                startActivity(komp4);
            }
        });

        Btn_komponen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp5 = new Intent(MainActivity.this,Komp5Activity.class);
                startActivity(komp5);
            }
        });



    }
}
