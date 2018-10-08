package com.calderon.janella;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }


    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnscreen1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnmap2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.594321, 120.970615"));
            chooser = Intent.createChooser(i, "create a map application");
            startActivity(chooser);
        }
    }
}