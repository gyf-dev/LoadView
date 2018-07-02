package com.gyf.sample;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.gyf.loadview.LoadView;

/**
 * @author geyifeng
 * @date 2018/7/2 下午12:24
 */
public class BaseActivity extends AppCompatActivity implements LoadView.OnLoadFailClickListener,
        LoadView.OnLoadingListener {

    public LoadView mLoadView;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        FrameLayout frameLayout = getWindow().getDecorView().findViewById(android.R.id.content);
        mLoadView = new LoadView(this);
        mLoadView.setOnFailClickListener(this);
        mLoadView.setOnLoadingListener(this);
        frameLayout.addView(mLoadView);
    }

    @Override
    public void onLoadFailClick() {

    }

    @Override
    public void onLoadingStart(View loadingView) {

    }

    @Override
    public void onLoadingEnd(View loadingView) {

    }
}
