package com.example.nitiya.searchnonthaburi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 12/24/2016 AD.
 */

public class NineAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] templeStrings, lengthStrings;
    private TextView templeTextView, lengthTextView;
    private ImageView imageView;

    public NineAdapter(Context context, String[] templeStrings, String[] lengthStrings) {
        this.context = context;
        this.templeStrings = templeStrings;
        this.lengthStrings = lengthStrings;
    }

    @Override
    public int getCount() {
        return templeStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.nine_listview, viewGroup, false);

        //Bind Widget
        templeTextView = (TextView) view1.findViewById(R.id.temple_name1);
        lengthTextView = (TextView) view1.findViewById(R.id.textView41);
        imageView = (ImageView) view1.findViewById(R.id.temple_image1);

        //Show View
        templeTextView.setText(templeStrings[i]);
        lengthTextView.setText(lengthStrings[i]);

        return view1;
    }
}   // Main Class
