package com.example.demo16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity02 extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        webView=findViewById(R.id.webView);
//        WebSettings settings =webView.getSettings();
//        settings.setJavaScriptEnabled(true);
        //设置支持JavaScript的第2种写法
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setUseWideViewPort(true);      //设置缩放后不会变形
        webSettings.setBuiltInZoomControls(true);     //设置可以缩放
        webView.loadUrl("file:///android_asset/www/index.html");
    }
}
