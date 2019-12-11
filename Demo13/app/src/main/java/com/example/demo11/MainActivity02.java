package com.example.demo11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity02 extends AppCompatActivity {
   private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        webView =findViewById(R.id.webView);
        webView.loadUrl("https://www.bilibili.com/");
        //使体验性更加良好
        webView.setWebViewClient(new WebViewClient());

    }


    }




