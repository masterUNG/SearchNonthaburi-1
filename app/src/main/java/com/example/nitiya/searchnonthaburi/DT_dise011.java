package com.example.nitiya.searchnonthaburi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DT_dise011 extends AppCompatActivity {

    protected static final int RESULT_SPEECH = 1;
    private List<DT_temple011> mDT_temple011;
    ImageButton img012;

    DT_temple011 dt_temple011;
    Data_temple data_temple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
//ปุ่มแทบบรา
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        getSupportActionBar().setTitle(Html.fromHtml("<font style='normal' color='#ffffff'>"+"รายชื่อวัด"+" </font>")) ;
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99CC33")));


        img012 = (ImageButton) findViewById(R.id.imageButton);

        img012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(DT_dise011.this, Manu0013.class);
                startActivity(i);
            }

        });

        TextView title = (TextView) findViewById(R.id.texttitel);
        TextView contact = (TextView) findViewById(R.id.contect);
        TextView address = (TextView) findViewById(R.id.addres);
        ImageView image_set_view = (ImageView) findViewById(R.id.image_set_view);

        dt_temple011 = new DT_temple011();
        data_temple = new Data_temple(this);

        Intent intent = getIntent();
        int tp_id = intent.getIntExtra("temple", 0);

        dt_temple011 = data_temple.dataTemple(tp_id);
        //คำสั่งดึงรูปจาก Database
        title.setText(dt_temple011.te_name);
        contact.setText(dt_temple011.t_des);
        image_set_view.setImageBitmap(BitmapFactory.decodeByteArray(dt_temple011.i_imag, 0, dt_temple011.i_imag.length));

    }

    @Override
    public void onBackPressed() {

        finish();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }

}











