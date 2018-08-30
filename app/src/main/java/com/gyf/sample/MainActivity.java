package com.gyf.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.gastudio.gabottleloading.library.GABottleLoadingView;
import com.gyf.loadview.LoadStatus;
import com.ldoublem.loadingviewlib.view.LVBattery;
import com.ldoublem.loadingviewlib.view.LVBlazeWood;
import com.ldoublem.loadingviewlib.view.LVBlock;
import com.ldoublem.loadingviewlib.view.LVCircularSmile;
import com.ldoublem.loadingviewlib.view.LVEatBeans;
import com.ldoublem.loadingviewlib.view.LVFinePoiStar;
import com.ldoublem.loadingviewlib.view.LVFunnyBar;
import com.ldoublem.loadingviewlib.view.LVGhost;
import com.ldoublem.loadingviewlib.view.base.LVBase;
import com.roger.catloadinglibrary.CatLoadingView;

import me.wangyuwei.loadingview.LoadingView;
import me.wangyuwei.slackloadingview.SlackLoadingView;
import scut.carson_ho.kawaii_loadingview.Kawaii_LoadingView;

/**
 * @author geyifeng
 */
public class MainActivity extends BaseActivity {

    private int mCurrentLoadingId;
    private LVBase mLVBase;
    private RecyclerView mRecyclerView;
    private CatLoadingView mCatLoadingView;
    private LoadingView mLoadingView;
    private GABottleLoadingView mGaBottleLoadingView;
    private SlackLoadingView mSlackLoadingView;
    private Kawaii_LoadingView mKawaiiLoadingView;
    private LottieAnimationView mLottieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData(mData);
//        mLoadView = findViewById(R.id.load_view);
//        mLoadView.setOnFailClickListener(this);
//        mLoadView.setOnLoadingListener(this);
//        mLoadView.setOnErrorNetClickListener(this);
//        mLoadView.setImageViewSize(400,400);
//        mLoadView.setLoadingViewSize(200,400);
        mLoadView.setCurrentStatus(LoadStatus.FAIL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.loading, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (!mLoadView.isLoading()) {
            switch (item.getItemId()) {
                case R.id.lVFunnyBar:
                    mLVBase = new LVFunnyBar(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVGhost:
                    mLVBase = new LVGhost(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVBattery:
                    mLVBase = new LVBattery(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVBlock:
                    mLVBase = new LVBlock(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVEatBeans:
                    mLVBase = new LVEatBeans(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVCircularSmile:
                    mLVBase = new LVCircularSmile(this);
                    ((LVCircularSmile) mLVBase).setViewColor(Color.parseColor("#8CE793"));
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVFinePoiStar:
                    mLVBase = new LVFinePoiStar(this);
                    ((LVFinePoiStar) mLVBase).setViewColor(Color.parseColor("#8CE793"));
                    ((LVFinePoiStar) mLVBase).setCircleColor(Color.parseColor("#C3CC63"));
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.lVBlazeWood:
                    mLVBase = new LVBlazeWood(this);
                    mLoadView.setLoadingView(mLVBase, 200, 200);
                    break;
                case R.id.catLoadingView:
                    mCatLoadingView = new CatLoadingView();
                    break;
                case R.id.viscousCircleView:
                    View view = LayoutInflater.from(this).inflate(R.layout.loading_viscous_circle, mLoadView, false);
                    mLoadingView = (LoadingView) view;
                    mLoadView.setLoadingView(mLoadingView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                    break;
                case R.id.gABottleLoadingView:
                    mGaBottleLoadingView = new GABottleLoadingView(this);
                    mLoadView.setLoadingView(mGaBottleLoadingView, 200, 200);
                    break;
                case R.id.slackLoadingView:
                    mSlackLoadingView = new SlackLoadingView(this);
                    mLoadView.setLoadingView(mSlackLoadingView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    break;
                case R.id.squareLoading:
                    mLoadView.setLoadingView(R.layout.loading_square, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    break;
                case R.id.kawaii_LoadingView:
                    mKawaiiLoadingView = new Kawaii_LoadingView(this);
                    mLoadView.setLoadingView(mKawaiiLoadingView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    break;
                case R.id.loadingView58:
                    mLoadView.setLoadingView(R.layout.loading_58);
                    break;
                case R.id.lottie_android:
                    if (mLottieView == null) {
                        mLottieView = (LottieAnimationView) LayoutInflater.from(this).inflate(R.layout.loading_lottie, mLoadView, false);
                    }
                    mLottieView.setAnimation("AndroidWave.json");
                    mLoadView.setLoadingView(mLottieView, 400, 400);
                    break;
                case R.id.lottie_a:
                    if (mLottieView == null) {
                        mLottieView = (LottieAnimationView) LayoutInflater.from(this).inflate(R.layout.loading_lottie, mLoadView, false);
                    }
                    mLottieView.setAnimation("A.json");
                    mLoadView.setLoadingView(mLottieView, 400, 400);
                    break;
                case R.id.lottie_b:
                    if (mLottieView == null) {
                        mLottieView = (LottieAnimationView) LayoutInflater.from(this).inflate(R.layout.loading_lottie, mLoadView, false);
                    }
                    mLottieView.setAnimation("B.json");
                    mLoadView.setLoadingView(mLottieView, 400, 400);
                    break;
                default:
                    break;
            }
            mCurrentLoadingId = item.getItemId();
            new Handler().post(new Runnable() {
                @Override
                public void run() {
                    mLoadView.setCurrentStatus(LoadStatus.LOADING);
                }
            });
            setStatus();
        } else {
            Toast.makeText(this, "加载结束在切换动画", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onLoadFailClick() {
        super.onLoadFailClick();
        setStatus();
    }

    @Override
    public void onLoadErrorNetClick() {
        super.onLoadErrorNetClick();
        setStatus();
    }

    private void setStatus() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int i = (int) (1 + Math.random() * (5));
                switch (i) {
                    case 1:
                        mLoadView.setCurrentStatus(LoadStatus.UNDO);
                        mAdapter.addData("默认(undo)");
                        break;
                    case 2:
                        mLoadView.setCurrentStatus(LoadStatus.SUCCESS);
                        mAdapter.addData("成功(success)");
                        break;
                    case 3:
                        mLoadView.setCurrentStatus(LoadStatus.EMPTY);
                        mAdapter.addData("数据为空(empty)");
                        break;
                    case 4:
                        mLoadView.setCurrentStatus(LoadStatus.FAIL);
                        mAdapter.addData("失败(fail)");
                        break;
                    case 5:
                        mLoadView.setCurrentStatus(LoadStatus.ERROR_NET);
                        mAdapter.addData("网络错误(error_net)");
                        break;
                    default:
                        break;
                }
                mRecyclerView.smoothScrollToPosition(mAdapter.getItemCount() - 1);
            }
        }, 3000);
    }

    @Override
    public void onLoadingStart(View loadingView) {
        super.onLoadingStart(loadingView);
        switch (mCurrentLoadingId) {
            case R.id.catLoadingView:
                loadingView.setVisibility(View.GONE);
                mCatLoadingView.show(getSupportFragmentManager(), "");
                break;
            case R.id.viscousCircleView:
                mLoadingView.start();
                break;
            case R.id.gABottleLoadingView:
                mGaBottleLoadingView.performAnimation();
                break;
            case R.id.slackLoadingView:
                mSlackLoadingView.start();
                break;
            case R.id.squareLoading:
                break;
            case R.id.kawaii_LoadingView:
                mKawaiiLoadingView.startMoving();
                break;
            case R.id.loadingView58:
                break;
            case R.id.lottie_android:
            case R.id.lottie_a:
            case R.id.lottie_b:
                break;
            default:
                if (mLVBase != null) {
                    mLVBase.startAnim();
                }
                break;
        }
        mRecyclerView.smoothScrollToPosition(mAdapter.getItemCount() - 1);
    }

    @Override
    public void onLoadingEnd(View loadingView) {
        super.onLoadingEnd(loadingView);
        switch (mCurrentLoadingId) {
            case R.id.catLoadingView:
                mCatLoadingView.dismiss();
                break;
            case R.id.viscousCircleView:
                mLoadingView.stop();
                break;
            case R.id.gABottleLoadingView:
                mGaBottleLoadingView.cancel();
                break;
            case R.id.slackLoadingView:
                mSlackLoadingView.reset();
                break;
            case R.id.squareLoading:
                break;
            case R.id.kawaii_LoadingView:
                mKawaiiLoadingView.stopMoving();
                break;
            case R.id.loadingView58:
                break;
            case R.id.lottie_android:
            case R.id.lottie_a:
            case R.id.lottie_b:
                break;
            default:
                if (mLVBase != null) {
                    mLVBase.stopAnim();
                }
                break;
        }
        mRecyclerView.smoothScrollToPosition(mAdapter.getItemCount() - 1);
    }
}
