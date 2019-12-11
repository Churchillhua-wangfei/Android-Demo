package com.example.demo06;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*//        通过显示意图实现Activity之间的跳转
        Intent intent01 =new  Intent(this,MainActivity.class);
        startActivity(intent01);*/
       //         通过隐式意图实现Activity之间的跳转
        Intent intent =new Intent();
        intent.setAction("android.intent.action.Second");
        intent.addCategory("android.intent.category.DEFAULT");
        startActivity(intent);

    }
    }





