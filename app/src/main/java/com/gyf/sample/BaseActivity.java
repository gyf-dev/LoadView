package com.gyf.sample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.gyf.loadview.LoadView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author geyifeng
 * @date 2018/7/2 下午12:24
 */
public class BaseActivity extends AppCompatActivity implements LoadView.OnLoadFailClickListener,
        LoadView.OnLoadingListener, LoadView.OnLoadErrorNetClickListener {

    public RecordAdapter mAdapter = new RecordAdapter();
    public List<String> mData = new ArrayList<>();

    public LoadView mLoadView;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setElevation(0);
        }
        FrameLayout frameLayout = getWindow().getDecorView().findViewById(android.R.id.content);
        mLoadView = new LoadView(this);
        mLoadView.setOnFailClickListener(this);
        mLoadView.setOnLoadingListener(this);
        mLoadView.setOnErrorNetClickListener(this);
        frameLayout.addView(mLoadView);
    }

    @Override
    public void onLoadFailClick() {
        mAdapter.addData("加载失败点击事件");
    }

    @Override
    public void onLoadingStart(View loadingView) {
        mAdapter.addData("加载开始");
    }

    @Override
    public void onLoadingEnd(View loadingView) {
        mAdapter.addData("加载结束");
    }

    @Override
    public void onLoadErrorNetClick() {
        mAdapter.addData("网络错误点击事件");
    }
}
