package com.gyf.sample;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.gyf.loadview.LoadStatus;

/**
 * @author geyifeng
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoadView.setCurrentStatus(LoadStatus.FAIL);
    }

    @Override
    public void onLoadFailClick() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setStatus();
            }
        },3000);
    }

    private void setStatus() {
        int i = (int) (1 + Math.random() * (5 - 1 + 1));
        switch (i) {
            case 1:
                mLoadView.setCurrentStatus(LoadStatus.UNDO);
                Toast.makeText(this, "默认", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                mLoadView.setCurrentStatus(LoadStatus.SUCCESS);
                Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                mLoadView.setCurrentStatus(LoadStatus.EMPTY);
                Toast.makeText(this, "数据为空", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                mLoadView.setCurrentStatus(LoadStatus.FAIL);
                Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                mLoadView.setCurrentStatus(LoadStatus.ERROR_NET);
                Toast.makeText(this, "网络错误", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
