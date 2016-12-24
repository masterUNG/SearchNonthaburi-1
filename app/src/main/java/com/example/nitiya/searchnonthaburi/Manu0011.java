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

        Data_temple data_temple = new Data_temple(this);
        getType = data_temple.getTypeList();
        customAdapter = new CustomAdapter(getApplicationContext(), getType,
                getIntent().getDoubleArrayExtra("Length"));

        ListAdapter adapter = new SimpleAdapter(Manu0011.this, getType, R.layout.view_temple, new String[]{DT_temple011.temple_name}, new int[]{R.id.temple_name});

        lv.setAdapter(customAdapter);

        //กดแล้วเเข้าไปรายชื่อวัด//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                int type = Integer.parseInt(String.valueOf(getType.get(position).get(DT_temple011.temple_id)));
//                Intent objIndent = new Intent(getApplicationContext(), DT_dise011.class);
//                objIndent.putExtra("temple", type);
//                startActivity(objIndent);
//            }
//        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int type = Integer.parseInt(String.valueOf(getType.get(i).get(DT_temple011.temple_id)));
                Intent objIndent = new Intent(getApplicationContext(), DT_dise011.class);
                objIndent.putExtra("temple", type);
                startActivity(objIndent);
            }
        });


        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>" + "ค้นหาวัด" + " </font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
}


