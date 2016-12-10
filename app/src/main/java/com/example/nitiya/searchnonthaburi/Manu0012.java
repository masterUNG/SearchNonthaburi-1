package com.example.nitiya.searchnonthaburi;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;

public class Manu0012 extends AppCompatActivity {

    //Explicit  นี่คือการประกาศตัวแปร
    private double[] lengthDoubles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu0012);

        //Setup
        lengthDoubles = getIntent().getDoubleArrayExtra("Length");

        //SupportActionBar
        supportBar();


    }   // Main Method

    private void supportBar() {
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ย้อนกลับ" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));
    }


    // ปุ่มย้อนกลับแทบบรา
    @Override
    public void onBackPressed() {

        finish();
    }

    @Override // ย้อนกลับไปหน้า home
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }


}   // Main class
