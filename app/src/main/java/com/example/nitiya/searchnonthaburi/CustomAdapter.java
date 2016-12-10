package com.example.nitiya.searchnonthaburi;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nitiya on 7/12/2559.
 */

public class CustomAdapter extends BaseAdapter {

    //Explicit
    private Context mContext;
    private ArrayList<HashMap<String, Object>> listdata;

    public CustomAdapter(Context mContext, ArrayList<HashMap<String, Object>> listdata) {
        this.mContext = mContext;
        this.listdata = listdata;
    }

    @Override
    public int getCount() {
        return listdata.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
            view = mInflater.inflate(R.layout.view_temple, parent, false);

        HashMap<String, Object> item = listdata.get(position);

        TextView textView = (TextView) view.findViewById(R.id.temple_name);
        textView.setText(item.get(DT_temple011.temple_name).toString());

        ImageView imageView = (ImageView) view.findViewById(R.id.temple_image);
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(
                (byte[]) item.get(DT_temple011.image_path), 0,((byte[]) item.get(DT_temple011.image_path)).length)
        );

        return view;
    }
}
