package com.example.nitiya.searchnonthaburi;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by nitiya on 16/11/2559.
 */

public class Mydatabase extends SQLiteAssetHelper{

    private static final String DATABASE_NAME = "databasess.db";
    private static final int DATABASE_VERSION = 1;

    public Mydatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
