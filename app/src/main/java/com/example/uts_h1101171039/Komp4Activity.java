package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komp4Activity extends AppCompatActivity {

    Button Btn_syntax4, Btn_link4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komp4);
        Btn_syntax4=findViewById(R.id.btn_syntax4);
        Btn_link4=findViewById(R.id.btn_link1);


        Btn_syntax4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Komp4Activity.this,Syn4Activity.class);
                startActivity(k4);
            }
        });


    }

    public void link (View view){
        Intent l4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/providers/content-providers"));
        startActivity(l4);
    }

}