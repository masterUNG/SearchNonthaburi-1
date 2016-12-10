package com.example.nitiya.searchnonthaburi;

import java.sql.Blob;

/**
 * Created by nitiya on 17/11/2559.
 */

public class DT_temple011 {
    public static Blob setImage_path;


    {}

    public static String getTABLE() {
        return TABLE;
    }

    public static String getTemple_id() {
        return temple_id;
    }

    public static void setTemple_id(String temple_id) {
        DT_temple011.temple_id = temple_id;
    }

    public static String getTemple_name() {
        return temple_name;
    }

    public static void setTemple_name(String temple_name) {
        DT_temple011.temple_name = temple_name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        DT_temple011.description = description;
    }


    public static String getLatitude() {
        return latitude;
    }

    public static void setLatitude(String latitude) {
        DT_temple011.latitude = latitude;
    }

    public static String getLongitude() {
        return longitude;
    }

    public static void setLongitude(String longitude) {
        DT_temple011.longitude = longitude;
    }

    public static String getDistrict_id() {
        return district_id;
    }

    public static void setDistrict_id(String district_id) {
        DT_temple011.district_id = district_id;
    }

    public int getTp_id() {
        return tp_id;
    }

    public void setTp_id(int tp_id) {
        this.tp_id = tp_id;
    }

    public String getTe_name() {
        return te_name;
    }

    public void setTe_name(String te_name) {
        this.te_name = te_name;
    }

    public String getT_des() {
        return t_des;
    }

    public void setT_des(String t_des) {
        this.t_des = t_des;
    }

    public Blob getI_imag(Blob i_imag) {return i_imag;}

    public void setI_imag(byte[] i_imag) {this.i_imag = i_imag;}


    public String getL_lat() {
        return l_lat;
    }

    public void setL_lat(String l_lat) {
        this.l_lat = l_lat;
    }

    public String getL_long() {
        return l_long;
    }

    public void setL_long(String l_long) {
        this.l_long = l_long;
    }

    public String getT_dis() {
        return t_dis;
    }

    public void setT_dis(String t_dis) {
        this.t_dis = t_dis;
    }

    public static final String TABLE = "Data_Temple";
    public static String temple_id = "Temple_id";
    public static String temple_name = "Temple_name";
    public static String description = "Description";
    public static String image_path = "Image_path";
    public static String latitude ="Latitude";
    public static String longitude ="Longitude";
    public static String district_id ="district_id";
    public static String emple_number = "emple_number";



    // property help us to keep data
    public int tp_id;
    public String te_name;
    public String t_des;
    public byte[] i_imag;
    public String l_lat;
    public String l_long;
    public String t_dis;
    public String e_number;
}
