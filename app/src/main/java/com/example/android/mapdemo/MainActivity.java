package com.example.android.mapdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent startIntent = new Intent(getApplicationContext(),MapsActivity1.class);
        startActivity(startIntent);
    }

    public void onClick2(View view) {
        // Creates an Intent that will load a map of San Francisco
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=744+hawthorne+Cloquet");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void onClick3(View view) {
        // Creates an Intent that will load a map of San Francisco
        Uri gmmIntentUri = Uri.parse("google.navigation:q=College+of+St.+Scholastica,+Kenwood+Avenue,+Duluth,+MN");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
