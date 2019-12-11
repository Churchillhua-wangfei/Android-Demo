package com.example.demo19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Activity中添加Fragment的方式:第二种
        DetailFragment detailFragment =new DetailFragment();//实例化DetaiFragment对象
        FragmentManager fm =getSupportFragmentManager();//获取FragmentManager实例对象
        FragmentTransaction beginTransaction =fm.beginTransaction();//开启FragmentTransaction事务
        beginTransaction.replace(R.id.framelayout,detailFragment);//添加Fragment
        beginTransaction.commit();//提交事务


    }
}
