package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komp3Activity extends AppCompatActivity {
    Button Btn_syntax3, Btn_link3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komp3);
        Btn_syntax3=findViewById(R.id.btn_syntax3);
        Btn_link3=findViewById(R.id.btn_link3);


        Btn_syntax3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(Komp3Activity.this,Syn3Activity.class);
                startActivity(k3);
            }
        });


    }

    public void link (View view){
        Intent l3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/BroadcastReceiver"));
        startActivity(l3);
    }

}

