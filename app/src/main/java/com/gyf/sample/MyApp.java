package com.gyf.sample;

import android.app.Application;

import com.gyf.loadview.LoadManager;

/**
 * @author geyifeng
 * @date 2018/7/2 下午12:02
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LoadManager.getInstance().setFailText("加载失败了哦，哈哈哈哈");
    }
}
