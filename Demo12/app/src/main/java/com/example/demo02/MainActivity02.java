package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        Log.i("MainActivity02", "Tag");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity02", "Tag");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity02", "Tag");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity02", "Tag");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity02", "Tag");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity02", "Tag");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity02", "Tag");
    }
}
