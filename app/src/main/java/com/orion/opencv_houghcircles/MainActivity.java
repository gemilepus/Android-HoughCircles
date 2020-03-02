package com.orion.opencv_houghcircles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1; // Results code
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                Manifest.permission.CAMERA,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.RECORD_AUDIO
        }, MY_PERMISSIONS_REQUEST_READ_CONTACTS);


        Intent intent = new Intent(getApplication(), OpenCVActivity.class);
        startActivity(intent);

    }
}
