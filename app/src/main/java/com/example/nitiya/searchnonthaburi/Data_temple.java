package com.example.nitiya.searchnonthaburi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nitiya on 21/11/2559.
 */

public class Data_temple {

    //Explicit
    private Mydatabase dbHelper;

    public Data_temple(Context context) {
        dbHelper = new Mydatabase(context);
    }

    public ArrayList<HashMap<String, Object>> getTypeList() {

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + DT_temple011.TABLE;

        ArrayList<HashMap<String, Object>> typeList = new ArrayList<HashMap<String, Object>>();

        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {

            do {
                HashMap<String, Object> type = new HashMap<String, Object>();

                type.put(DT_temple011.temple_id, cursor.getString(cursor.getColumnIndex(DT_temple011.temple_id)));
                type.put(DT_temple011.temple_name, cursor.getString(cursor.getColumnIndex(DT_temple011.temple_name)));
                type.put(DT_temple011.description, cursor.getString(cursor.getColumnIndex(DT_temple011.description)));
                type.put(DT_temple011.image_path, cursor.getBlob(cursor.getColumnIndex(DT_temple011.image_path)));
                type.put(DT_temple011.latitude, cursor.getString(cursor.getColumnIndex(DT_temple011.latitude)));
                type.put(DT_temple011.longitude, cursor.getString(cursor.getColumnIndex(DT_temple011.longitude)));
                type.put(DT_temple011.district_id, cursor.getString(cursor.getColumnIndex(DT_temple011.district_id)));

                typeList.add(type);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return typeList;

    }   // ArrayList

    public DT_temple011 dataTemple(int templeid) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        DT_temple011 dt_temple011 = new DT_temple011();

        String selectQuery = "SELECT * FROM " + DT_temple011.TABLE + " WHERE " + DT_temple011.temple_id + " = " + templeid;

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) do {
            dt_temple011.tp_id = cursor.getInt(cursor.getColumnIndex(DT_temple011.temple_id));
            dt_temple011.te_name = cursor.getString(cursor.getColumnIndex(DT_temple011.temple_name));
            dt_temple011.t_des = cursor.getString(cursor.getColumnIndex(DT_temple011.description));
            dt_temple011.i_imag = cursor.getBlob(cursor.getColumnIndex(DT_temple011.image_path));
            dt_temple011.l_lat = cursor.getColumnName(cursor.getColumnIndex(DT_temple011.latitude));
            dt_temple011.l_long = cursor.getColumnName(cursor.getColumnIndex(DT_temple011.latitude));
            dt_temple011.t_dis = cursor.getColumnName(cursor.getColumnIndex(DT_temple011.district_id));

        } while (cursor.moveToNext());

        cursor.close();
        db.close();

        return dt_temple011;
    }
}