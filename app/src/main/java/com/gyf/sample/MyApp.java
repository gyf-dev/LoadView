package com.gyf.sample;

import android.app.Application;

import com.gyf.loadview.LoadManager;
import com.squareup.leakcanary.LeakCanary;

/**
 * @author geyifeng
 * @date 2018/7/2 下午12:02
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            if (LeakCanary.isInAnalyzerProcess(this)) {
                return;
            }
            LeakCanary.install(this);
        }
        LoadManager.getInstance().setFailText("加载失败了哦，哈哈哈哈");
    }
}
