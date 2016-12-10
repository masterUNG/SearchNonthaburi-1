package com.example.nitiya.searchnonthaburi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 12/10/2016 AD.
 */

public class MyManage {

    //Explicit
    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String table_eve = "eveTABLE";
    public static final String column_id = "_id";
    public static final String column_length = "Length";

    public MyManage(Context context) {
        this.context = context;

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    }

    public long addLength(double douLength) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_length, douLength);

        return sqLiteDatabase.insert(table_eve, null, contentValues);
    }

}   // Main Class
