package com.example.nitiya.searchnonthaburi;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class Manu01 extends AppCompatActivity {

    //Explicit
    ImageButton img01, img02, img03;
    private LocationManager locationManager;
    private Criteria criteria;
    private double latADouble, lngADouble;
    private double[] lengthDoubles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu01);

        img01 = (ImageButton) findViewById(R.id.manu001);


        //Setup Location
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        criteria = new Criteria();
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false); // ไม่นำระยะห่างจากระดับน้ำทะเล มาคำนวน

        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0011.class);
                startActivity(i);
            }

        });

        img02 = (ImageButton) findViewById(R.id.manu002);

        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Maps.class);
                startActivity(i);
            }

        });

        img03 = (ImageButton) findViewById(R.id.btn03_shr9);
        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0012.class);
                startActivity(i);
            }

        });






    }   // Main Method

    private void calculateLengthAll() {

        //Get lat2, lon2 from SQLite
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("databasess.db",
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Data_Temple", null);
        cursor.moveToFirst();
        int i = cursor.getCount();
        Log.d("10decV2", "cursor Count ==> " + i);

        lengthDoubles = new double[i];
        double[] douLat = new double[i];
        double[] douLng = new double[i];

        for (int i1=0;i1<i;i1++) {

            douLat[i1] = cursor.getDouble(4);
            douLng[i1] = cursor.getDouble(5);

            Log.d("10decV2", "(lat, lng) == " + "(" + douLat[i1] + ", " + douLng[i1] + ")");

            CalculateLength calculateLength = new CalculateLength(Manu01.this,
                    latADouble, lngADouble, douLat[i1], douLng[i1]);
            lengthDoubles[i1] = calculateLength.myLength();
            Log.d("10decV2", "length (" + i1 + ") ==> " + lengthDoubles[i1]);

            cursor.moveToNext();

        }   // for



    }   // calculate

    @Override
    protected void onResume() {
        super.onResume();

        latADouble = 0;
        lngADouble = 0;

        //Find Location by Network
        Location networkLocation = myFindLocation(LocationManager.NETWORK_PROVIDER);
        if (networkLocation != null) {
            latADouble = networkLocation.getLatitude();
            lngADouble = networkLocation.getLongitude();
        }

        //Find Location by GPS
        Location gpsLocation = myFindLocation(LocationManager.GPS_PROVIDER);
        if (gpsLocation != null) {
            latADouble = gpsLocation.getLatitude();
            lngADouble = gpsLocation.getLongitude();

        }

        Log.d("10decV1", "lat ==> " + latADouble);
        Log.d("10decV1", "lng ==> " + lngADouble);

        //Test Length
        double lat1 = 13.832051;
        double lng2 = 100.507046;
        CalculateLength calculateLength = new CalculateLength(Manu01.this,
                latADouble, lngADouble, lat1, lng2);
        Log.d("10decV1", "Length ==> " + calculateLength.myLength());

        //Calculate Length All
        calculateLengthAll();



    }   // onResume

    @Override
    protected void onStop() {
        super.onStop();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.removeUpdates(locationListener);
    }

    public Location myFindLocation(String strProvider) {

        Location location = null;

        if (locationManager.isProviderEnabled(strProvider)) {

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return null;
            }
            locationManager.requestLocationUpdates(strProvider, 1000, 10, locationListener);
            location = locationManager.getLastKnownLocation(strProvider);

        }

        return location;
    }


    public LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            latADouble = location.getLatitude();
            lngADouble = location.getLongitude();
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    };


}   // Main Class
