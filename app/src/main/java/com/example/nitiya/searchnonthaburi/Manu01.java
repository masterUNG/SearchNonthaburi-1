package com.example.nitiya.searchnonthaburi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Manu01 extends AppCompatActivity {


    ImageButton img01, img02, img03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu01);

        img01 = (ImageButton) findViewById(R.id.manu001);

        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0011.class);
                startActivity(i);
            }

        });

        img02 = (ImageButton) findViewById(R.id.manu002);

        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Maps.class);
                startActivity(i);
            }

        });

        img03 = (ImageButton) findViewById(R.id.btn03_shr9);
        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0012.class);
                startActivity(i);
            }

        });


    }
}
