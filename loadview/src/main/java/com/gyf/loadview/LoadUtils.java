package com.gyf.loadview;

import android.content.Context;
import android.util.TypedValue;

/**
 * The type Load utils.
 *
 * @author geyifeng
 */
class LoadUtils {

    /**
     * 获得colorPrimary颜色
     *
     * @param context the context
     * @return the color primary
     */
    public static int getColorPrimary(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }


    /**
     * 获取colorPrimaryDark颜色
     *
     * @param context the context
     * @return dark color primary
     */
    public static int getDarkColorPrimary(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimaryDark, typedValue, true);
        return typedValue.data;
    }

    /**
     * 获得colorAccent颜色
     *
     * @param context the context
     * @return the dark color accent
     */
    public static int getDarkColorAccent(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    /**
     * sp转像素
     *
     * @param c       the c
     * @param spValue the sp value
     * @return the int
     */
    public static int sp2px(Context c, float spValue) {
        float fontScale = c.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    /**
     * 像素转sp
     *
     * @param c       the c
     * @param pxValue the px value
     * @return the int
     */
    public static int px2sp(Context c, float pxValue) {
        float fontScale = c.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

}
