package com.example.mapstes1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng pom = new LatLng(1.440523, 125.142345);
        mMap.addMarker(new MarkerOptions().position(pom).title("SPBU WANGURER BITUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom));

        LatLng makan = new LatLng(1.447689, 125.127546);
        mMap.addMarker(new MarkerOptions().position(makan).title("RUMAH MAKAN BOGA BOGI"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(makan));

        LatLng sekolah = new LatLng(1.438354, 125.124859);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SMA NEGERI 1 BITUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));

        LatLng masjid = new LatLng(1.452090, 125.127537);
        mMap.addMarker(new MarkerOptions().position(masjid).title("MASJID AL-IKHLAS GIPER"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid));
    }
}
