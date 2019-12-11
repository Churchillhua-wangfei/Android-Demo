package com.example.demo17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity02 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        //获取布局管理器中添加的webView控件
        webView = findViewById(R.id.webbtn);
        webView.loadUrl("https://home.firefoxchina.cn/");//指定要加载的网页

        //使网页具备放大和缩小网页的功能
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        //使体验性更加良好
        webView.setWebViewClient(new WebViewClient());


    }
}
