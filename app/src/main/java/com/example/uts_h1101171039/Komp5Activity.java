package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komp5Activity extends AppCompatActivity {
    Button Btn_syntax5, Btn_link5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komp5);
        Btn_syntax5=findViewById(R.id.btn_syntax5);
        Btn_link5=findViewById(R.id.btn_link5);


        Btn_syntax5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k5 = new Intent(Komp5Activity.this,Syn5Activity.class);
                startActivity(k5);
            }
        });


    }

    public void link (View view){
        Intent l5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/ui/declaring-layout"));
        startActivity(l5);
    }

}


