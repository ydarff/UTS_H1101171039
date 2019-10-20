package com.example.uts_h1101171039;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komp2Activity extends AppCompatActivity {

    Button Btn_syntax2, Btn_link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komp2);
        Btn_syntax2=findViewById(R.id.btn_syntax2);
        Btn_link2=findViewById(R.id.btn_link2);


        Btn_syntax2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(Komp2Activity.this,Syn2Activity.class);
                startActivity(k2);
            }
        });


    }

    public void link (View view){
        Intent l2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/app/Service.html"));
        startActivity(l2);
    }

}
