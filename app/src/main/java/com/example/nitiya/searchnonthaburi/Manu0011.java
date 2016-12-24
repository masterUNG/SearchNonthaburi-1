package com.example.nitiya.searchnonthaburi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.HashMap;

public class Manu0011 extends AppCompatActivity {

    //Explicit
    protected static final int RESULT_SPEECH = 1;
    private GoogleApiClient client;
    private ArrayList<HashMap<String, Object>> getType;
    private CustomAdapter customAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu0011);

        //แถบบราข้างบนปุ่มค้นหาวัด
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ค้นหาวัด" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));

        ListView lv = (ListView) findViewById(R.id.listtemple);

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("databasess.db",
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Data_Temple", null);
        cursor.moveToFirst();
//        int i = cursor.getCount();
        int i = 20;

        String[] templeStrings = new String[i];
        String[] detailStrings = new String[i];
        Bitmap[] bitmaps = new Bitmap[i];
        String[] latStrings = new String[i];
        String[] lngStrings = new String[i];
        String[] lengthStrings = new String[i];

        for (int i1 = 0; i1 < i; i1++) {

            templeStrings[i1] = cursor.getString(1);
            detailStrings[i1] = cursor.getString(2);

            byte[] byteArray = cursor.getBlob(cursor.getColumnIndex(DT_temple011.image_path));
            bitmaps[i1] = BitmapFactory.decodeByteArray(byteArray, 0 ,byteArray.length);

            latStrings[i1] = cursor.getString(4);
            lngStrings[i1] = cursor.getString(5);

            cursor.moveToNext();
        }   // for

        NineAdapter nineAdapter = new NineAdapter(Manu0011.this, templeStrings,
                lengthStrings, bitmaps);
        lv.setAdapter(nineAdapter);



        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ค้นหาวัด" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }   // Main Method

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

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Manu0011 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}   // Main Class


