package com.example.demo09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    private WebView mwebView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mwebView=findViewById(R.id.webviewdemo);


        mwebView.loadUrl("file:///android_asset/Demo02.html");


    }
}
