package com.example.demo08;
import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
public class FileSaveQQ {
    //保存QQ账号和登录密码到data.txt文件中
    public static boolean saveUserInfo(Context context, String number,
                                       String password) {
        try {
            FileOutputStream fos = context.openFileOutput("data.txt",
                    Context.MODE_PRIVATE);
            fos.write((number + ":" + password).getBytes());
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //从data.txt文件中获取存储的QQ账号和密码
    public static Map<String, String> getUserInfo(Context context) {
        String content = "";
        try {
            FileInputStream fis = context.openFileInput("data.txt");
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            content = new String(buffer);
            Map<String, String> userMap = new HashMap<String, String>();
            String[] infos = content.split(":");
            userMap.put("number", infos[0]);
            userMap.put("password", infos[1]);
            fis.close();
            return userMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

