package com.example.nitiya.searchnonthaburi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;

public class Manu0012 extends AppCompatActivity {

    //Explicit  นี่คือการประกาศตัวแปร
    private double[] lengthDoubles;
    private String[] idStrings = new String[9];
    private String[] templeStrings = new String[9];
    private String[] lengthStrings = new String[9];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu0012);

        //Setup
        lengthDoubles = getIntent().getDoubleArrayExtra("Length");
        for (int i=0;i<lengthDoubles.length;i++) {
            Log.d("24decV1", "length(" + i + ") = " + lengthDoubles[i]);
        }

        // ค้นหา 9 วัดที่ ใกล้ที่สุด
        find9Temple();

        // ค้นหา Name and Image
        findNameImage();




        //SupportActionBar
        supportBar();


    }   // Main Method

    private void findNameImage() {

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("databasess.db", MODE_PRIVATE, null);

        for (int i=0;i<idStrings.length;i++) {

            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Data_Temple WHERE Temple_id = " + "'" + idStrings[i] + "'", null);
            cursor.moveToFirst();
            templeStrings[i] = cursor.getString(1);
            Log.d("24decV2", "templeString (" + i + ") = " + templeStrings[i]);

            cursor.moveToNext();
        }   //for


    }   // findNameImage

    private void find9Temple() {

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM eveTABLE ORDER BY Length ASC", null);
        cursor.moveToFirst();
        for (int i=0;i<idStrings.length;i++) {

            idStrings[i] = cursor.getString(0);
            Log.d("24decV2", "idStrings(" + i + ") = " + idStrings[i]);

            lengthStrings[i] = cursor.getString(1);
            Log.d("24decV2", "lengthStrings(" + i + ") = " + lengthStrings[i]);

            cursor.moveToNext();
        }   // for



    }   // find9Temple

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
