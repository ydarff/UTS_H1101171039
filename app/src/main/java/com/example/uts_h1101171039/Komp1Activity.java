package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komp1Activity extends AppCompatActivity {
    Button Btn_syntax1, Btn_link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komp1);
        Btn_syntax1=findViewById(R.id.btn_syntax1);
        Btn_link1=findViewById(R.id.btn_link1);


        Btn_syntax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k1 = new Intent(Komp1Activity.this,Syn1Activity.class);
                startActivity(k1);
            }
        });


    }

        public void link (View view){
        Intent l1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/app/Activity.html"));
        startActivity(l1);
        }

}

