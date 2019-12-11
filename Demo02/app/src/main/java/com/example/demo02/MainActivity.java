package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//    Logcat练习


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Tag","Verbose");
        Log.d("Tag","Debug");
        Log.i("Tag","Info");
        Log.w("Tag","Warning");
        Log.e("Tag","Error");
        Log.wtf("Tag","Assert");

    }
}
