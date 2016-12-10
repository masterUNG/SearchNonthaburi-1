package com.example.nitiya.searchnonthaburi;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;

import java.util.ArrayList;
import java.util.HashMap;

public class Manu0012 extends AppCompatActivity {

    //Explicit  นี่คือการประกาศตัวแปร
    protected static final int RESULT_SPEECH = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu0011);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ย้อนกลับ" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));

        ListView lv = (ListView) findViewById(R.id.listtemple);
        Data_temple data_temple = new Data_temple(this);


        final ArrayList<HashMap<String, Object>> getType = data_temple.getTypeList();

        ListAdapter adapter = new SimpleAdapter(Manu0012.this, getType, R.layout.view_temple, new String[]{DT_temple011.temple_name}, new int[]{R.id.temple_name});
        lv.setAdapter(adapter);


//กดแล้วเเข้าไปรายชื่อวัด//
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int type = Integer.parseInt(String.valueOf(getType.get(position).get(DT_temple011.temple_id)));
                Intent objIndent = new Intent(getApplicationContext(), DT_dise011.class);
                objIndent.putExtra("temple", type);
                startActivity(objIndent);
            }
        });


        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ค้นหา9วัดโดยอัติโนมัติ" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));

    }   // Main Method


    public int getCount() {
        return 9;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
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

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
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

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }
}   // Main class
