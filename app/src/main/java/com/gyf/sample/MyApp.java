package com.gyf.sample;

import android.app.Application;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

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
        SpannableString spannableString = new SpannableString("加载失败了哦，点我重试");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#3F51B5"));
        spannableString.setSpan(colorSpan, 7, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        LoadManager.getInstance().setFailText(spannableString);
    }
}
