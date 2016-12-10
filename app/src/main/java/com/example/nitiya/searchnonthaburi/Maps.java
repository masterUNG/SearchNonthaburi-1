package com.example.nitiya.searchnonthaburi;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }






    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng thailand = new LatLng(13.8595518, 100.4796695);
        mMap.addMarker(new MarkerOptions()
                .position(thailand)
                .title("จังหวัดนนทบุรี")
                .snippet("อำเภอเมือง")
                .snippet(getString(R.string.app_name))
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.goloaoo))
        );
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.8595518, 100.4796695), 14));

        GoogleMap mMap = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();
//ตำบลบางเขน
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.832051, 100.507046))
                .title("วัดกำแพง")
                .snippet("ตำบลบางเขน")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map02))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.834311, 100.522133))
                .title("วัดทางหลวง")
                .snippet("ตำบลบางเขน")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map02))
        );

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.826436, 100.509988))
                .title("วัดฝาง")
                .snippet("ตำบลบางเขน")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map02))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.836045, 100.523555))
                .title("วัดโพธิ์ทองล่าง")
                .snippet("ตำบลบางเขน")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map02))
        );
        ///ตำบลบางกร่าง
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.851281, 100.456811))
                .title("วัดขวัญเมือง")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.839601, 100.439579))
                .title("วัดแคใน")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.847994, 100.466748))
                .title("วัดโตนด")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03)))
        ;
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.834905, 100.464153))
                .title("วัดบางกร่าง")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.847308, 100.461544))
                .title("วัดบางระโหง")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.849706, 100.444355))
                .title("วัดโบสถ์ดอนพรหม")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.863901, 100.446753))
                .title("วัดประชารังสรรค์")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.839566, 100.452153))
                .title("วัดปราสาท")
                .snippet("ตำบลบางกร่าง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map03))
        );
        //บางกระสอ
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.861545, 100.523555))
                .title("วัดกลางบางซื่อ")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.878523, 100.484608))
                .title("วัดแคนอก")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.868231, 100.481975))
                .title("วัดแจ้งศิริสัมพันธ์")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.870726, 100.480096))
                .title("วัดน้อยนอก")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.870526, 100.534935))
                .title("วัดบัวขวัญ")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.860048, 100.498946))
                .title("วัดสมรโกฎิ")
                .snippet("ตำบลบางกระสอ")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map04))
        );
        //ตำบลบางไผ่
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.808066, 100.496443))
                .title("วััดเขียน")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.828066, 100.499348))
                .title("วัดค้างคาว")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.819911, 100.488808))
                .title("วัดโชติการาม")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.824264, 100.498183))
                .title("วัดตึก")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.813583, 100.491463))
                .title("วัดทองนาปรัง")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.825276, 100.497239))
                .title("วัดศาลารี")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.826623, 100.492245))
                .title("วัดสังฆทาน")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))

        );
        mMap.addMarker(new MarkerOptions()
                .position(
                new LatLng(13.836243, 100.488188))
                .title("วัดอมฤต")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.846631, 100.483731))
                .title("วัดเฉลิมพระเกรียรติ")
                .snippet("ตำบลบางไผ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map05))

        );
        //บางรักน้อย
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.863066, 100.453828))
                .title("วัดเบางรักน้อย")
                .snippet("ตำบลบางรักน้อย")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map06))
        );
        //ตำบลบางศรีเมือง
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.840455, 100.478047))
                .title("วัดบางศรีเมือง")
                .snippet("ตำบลบางศรีเมือง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map07))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.837693, 100.477193))
                .title("วัดป่าเรไร")
                .snippet("ตำบลบางศรีเมือง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.840541, 100.840548))
                .title("วัดพุฒิปรางค์ปราโมทย์")
                .snippet("ตำบลบางศรีเมือง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.845065, 100.487148))
                .title("วัดสลักใต้")
                .snippet("ตำบลบางศรีเมือง")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))
        );
        //ตำบลไทรม้า
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.885803, 100.482603))
                .title("วัดแดงธรรมชาติ")
                .snippet("ตำบลไทรม้า")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.861645, 100.476064))
                .title("วัดไทรม้าใต้")
                .snippet("ตำบลไทรม้า")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.863236, 100.475821))
                .title("วัดไทรม้าเหนือ")
                .snippet("ตำบลไทรม้า")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.864913, 100.466801))
                .title("วัดบางนา")
                .snippet("ตำบลไทรม้า")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.857983, 100.466801))
                .title("วัดเพลง")
                .snippet("ตำบลไทรม้า")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map08))
        );
//ตำบลสวนใหญ่
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.856291, 100.480123))
                .title("วัดท้ายเมือง")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.843708, 100.498161))
                .title("วัดทินกรนิมิต")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.833474, 100.499046))
                .title("วัดนครอินทร์")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.841685, 100.494144))
                .title("วัดบางขวาง")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.849256, 100.493058))
                .title("วัดบางแพรกใต้")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.851401, 100.494451))
                .title("วัดบางแพรกเหนือ")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))

        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.820621, 100.505971))
                .title("วัดปากน้ำ")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.820576, 100.505971))
                .title("วัดพลับพลา")
                .snippet("ตำบลสวนใหญ่")

                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.820576, 100.508918))
                .title("วัดลานนาบุญ")
                .snippet("ตำบลสวนใหญ่")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map09))
        );
//ตำบลท่าทราย
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.883096, 100.494183))
                .title("วัดชมพูเวก")
                .snippet("ตำบลท่าทราย")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map10))
        );
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(13.887376, 100.495411))
                .title("วัดตำหนักใต้")
                .snippet("ตำบลท่าทราย")
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map10))

        );

    }
}
