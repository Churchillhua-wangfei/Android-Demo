package com.example.demo14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import java.util.HashMap;

public class MainActivity02 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        webView = findViewById(R.id.webview);
//        StringBuilder sb = new StringBuilder();
//        sb.append("<div>最新编程语言排行榜(娱乐消遣)</div>");
//        sb.append("<ol>");
//        sb.append("<li>JAVA</li>");
//        sb.append("<li>SQL</li>");
//        sb.append("<li>Python</li>");
//        sb.append("<li>JavaScript</li>");
//        sb.append("<li>Swift</li>");
//        sb.append("</ol>");
        String body = "示例：这里有个img标签，地址是相对路径<img src='/uploads/allimg/130923/1FP02V7-0.png' />";
        webView.loadDataWithBaseURL(null, body, "text/html", "utf-8",null);


        //第一个参数表示：基础网页，第二个表示：要加载的内容,第三个表示要加载的网页类型（默认text/html），
        // 第四个参数是编码格式：”utf-8“,第五个参数默认（null）
//        webView.loadDataWithBaseURL(null, sb.toString(), "text/html", "utf-8", null);


    }
}
