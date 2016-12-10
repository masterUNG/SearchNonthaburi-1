package com.example.nitiya.searchnonthaburi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 12/10/2016 AD.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private Context context;
    public static final String database_name = "eve.db";
    private static final int database_version = 1;

    private static final String create_eveTABLE = "create table eveTABLE (" +
            "_id integer primary key," +
            "Length REAL);";

    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_eveTABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
