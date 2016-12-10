package com.example.nitiya.searchnonthaburi;

import android.content.Context;

/**
 * Created by masterUNG on 12/10/2016 AD.
 */

public class CalculateLength {

    //Explicit
    private Context context;
    private double lat1, lon1, lat2, lon2;

    public CalculateLength(Context context, double lat1, double lon1, double lat2, double lon2) {
        this.context = context;
        this.lat1 = lat1;
        this.lon1 = lon1;
        this.lat2 = lat2;
        this.lon2 = lon2;
    }

    public double myLength() {

        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515 * 1.609344;


        return (dist);
    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

}   // Main Class
