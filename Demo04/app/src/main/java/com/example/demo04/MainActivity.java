package com.example.demo04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//    用LogCat日志查看Activity的生命周期

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ActivityLife", "调用Oncreat()方法");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLife", "调用Onstart()方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLife", "调用onResume方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLife", "调用onPause()方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLife", "调用onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLife", "调用onDestroy()方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLife", "调用onRestart()");
    }
}

