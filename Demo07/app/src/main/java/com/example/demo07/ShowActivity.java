package com.example.demo07;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private ProgressBar mProgressBar3;
    private TextView mLifeTV;
    private TextView mAttackTV;
    private TextView mSpeedTV;
    private TextView tv_name;
    private TextView tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        tv_name = findViewById(R.id.tv_name);
        tv_password = findViewById(R.id.tv_psw);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String password = intent.getStringExtra("password");
        tv_name.setText("用户名:" + name);
        tv_password.setText("密码:" + password);
        mLifeTV = findViewById(R.id.tv_life_progress);
        mAttackTV = findViewById(R.id.tv_attack_progress);
        mSpeedTV = findViewById(R.id.tv_speed_progress);
        initProgress();                    //初始化进度条
    }
    private void initProgress() {
        mProgressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        mProgressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        mProgressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
        mProgressBar1.setMax(1000);        //设置最大值1000
        mProgressBar2.setMax(1000);
        mProgressBar3.setMax(1000);
    }
    // 开启新的activity并获取他的返回值
    public void click(View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivityForResult(intent, 1); // 返回请求结果,请求码为1
    }
    @Override
//
    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            // 判断结果码是否等于1
            if (resultCode == 1) {
                // 继续判断请求码码是否等于1
                if (requestCode == 1) {
                    ItemInfo info =
                            (ItemInfo) data.getSerializableExtra("equipment");
                    //更新ProgressBar的值
                    updateProgress(info);
                }
            }
        }
    }
    //更新ProgressBar的值
    private void updateProgress(ItemInfo info) {
        int progress1 = mProgressBar1.getProgress();
        int progress2 = mProgressBar2.getProgress();
        int progress3 = mProgressBar3.getProgress();
        mProgressBar1.setProgress(progress1 + info.getLife());
        mProgressBar2.setProgress(progress2 + info.getAcctack());
        mProgressBar3.setProgress(progress3 + info.getSpeed());
        mLifeTV.setText(mProgressBar1.getProgress() + "");
        mAttackTV.setText(mProgressBar2.getProgress() + "");
        mSpeedTV.setText(mProgressBar3.getProgress() + "");
    }
}
