package com.example.maichel.detectingmessages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("In on create", "activty started..");

        //start the service to listen
        startService(new Intent(getBaseContext(),ListenSmsMmsService.class));
    }
}
