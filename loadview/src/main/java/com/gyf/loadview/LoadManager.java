package com.gyf.loadview;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.view.Gravity;

/**
 * The type Load manager.
 *
 * @author geyifeng
 */
public class LoadManager {

    /**
     * The constant mInstance.
     */
    private static LoadManager mInstance = new LoadManager();

    /**
     * The loading layout id.
     */
    @LayoutRes
    private int mLoadingLayoutId = 0;

    /**
     * The fail text.
     */
    private String mFailText = "加载失败,点击重试";
    /**
     * The error net text.
     */
    private String mErrorNetText = "网络错误";
    /**
     * The empty text.
     */
    private String mEmptyText = "数据为空";


    /**
     * The gravity.
     */
    private int mGravity = Gravity.CENTER;
    /**
     * The loading gravity.
     */
    private int mLoadingGravity = mGravity;
    /**
     * The image text gravity.
     */
    private int mImageTextGravity = mGravity;

    /**
     * The margin.
     */
    private int mMargin = 0;

    /**
     * The loading left margin.
     */
    private int mLoadingLeftMargin = mMargin;
    /**
     * The loading top margin.
     */
    private int mLoadingTopMargin = mMargin;
    /**
     * The loading right margin.
     */
    private int mLoadingRightMargin = mMargin;
    /**
     * The loading bottom margin.
     */
    private int mLoadingBottomMargin = mMargin;

    /**
     * The image text left margin.
     */
    private int mImageTextLeftMargin = mMargin;
    /**
     * The image text top margin.
     */
    private int mImageTextTopMargin = mMargin;
    /**
     * The image text right margin.
     */
    private int mImageTextRightMargin = mMargin;
    /**
     * The image text bottom margin.
     */
    private int mImageTextBottomMargin = mMargin;

    /**
     * The image left margin.
     */
    private int mImageLeftMargin = 0;
    /**
     * The image top margin.
     */
    private int mImageTopMargin = 0;
    /**
     * The image right margin.
     */
    private int mImageRightMargin = 0;
    /**
     * The image bottom margin.
     */
    private int mImageBottomMargin = 0;

    /**
     * The text left margin.
     */
    private int mTextLeftMargin = 0;
    /**
     * The text top margin.
     */
    private int mTextTopMargin = 100;
    /**
     * The text right margin.
     */
    private int mTextRightMargin = 0;
    /**
     * The text bottom margin.
     */
    private int mTextBottomMargin = 0;
    /**
     * The fail res.
     */
    @DrawableRes
    private int mFailRes = R.drawable.icon_load_fail;
    /**
     * The error net res.
     */
    @DrawableRes
    private int mErrorNetRes = R.drawable.icon_load_error_net;
    /**
     * The empty res.
     */
    @DrawableRes
    private int mEmptyRes = R.drawable.icon_load_emtpy;
    /**
     * The text color.
     */
    @ColorInt
    private int mTextColor = Color.parseColor("#000000");
    /**
     * The fail text color.
     */
    @ColorInt
    private int mFailTextColor = mTextColor;
    /**
     * The error net text color.
     */
    @ColorInt
    private int mErrorNetTextColor = mTextColor;
    /**
     * The empty text color.
     */
    @ColorInt
    private int mEmptyTextColor = mTextColor;
    /**
     * The image color.
     */
    @ColorInt
    private int mImageColor = Color.parseColor("#000000");
    /**
     * The fail image color.
     */
    @ColorInt
    private int mFailImageColor = mImageColor;
    /**
     * The error net image color.
     */
    @ColorInt
    private int mErrorNetImageColor = mImageColor;
    /**
     * The empty image color.
     */
    @ColorInt
    private int mEmptyImageColor = mImageColor;
    /**
     * The default loading color.
     */
    @ColorInt
    private int mDefaultLoadingColor = 0;

    /**
     * The text size.
     */
    private int mTextSize = 16;

    /**
     * The fail image color enabled.
     */
    private boolean mFailImageColorEnabled = false;
    /**
     * The error net image color enabled.
     */
    private boolean mErrorNetImageColorEnabled = false;
    /**
     * The empty image color enabled.
     */
    private boolean mEmptyImageColorEnabled = false;

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static LoadManager getInstance() {
        return mInstance;
    }

    /**
     * Sets loading layout id.
     *
     * @param layoutId the layout id
     * @return the loading layout id
     */
    public LoadManager setLoadingLayoutId(@LayoutRes int layoutId) {
        this.mLoadingLayoutId = layoutId;
        return this;
    }

    /**
     * Gets loading layout id.
     *
     * @return the loading layout id
     */
    public int getLoadingLayoutId() {
        return mLoadingLayoutId;
    }

    /**
     * Sets fail.
     *
     * @param failText the fail text
     * @param failRes  the fail res
     * @return the fail
     */
    public LoadManager setFail(String failText, @DrawableRes int failRes) {
        mFailText = failText;
        mFailRes = failRes;
        return this;
    }

    /**
     * Sets error net.
     *
     * @param errorNetText the error net text
     * @param errorNetRes  the error net res
     * @return the error net
     */
    public LoadManager setErrorNet(String errorNetText, @DrawableRes int errorNetRes) {
        mErrorNetText = errorNetText;
        mErrorNetRes = errorNetRes;
        return this;
    }

    /**
     * Sets empty.
     *
     * @param emptyText the empty text
     * @param emptyRes  the empty res
     * @return the empty
     */
    public LoadManager setEmpty(String emptyText, @DrawableRes int emptyRes) {
        mEmptyText = emptyText;
        mEmptyRes = emptyRes;
        return this;
    }

    /**
     * Sets fail res.
     *
     * @param failRes the fail res
     * @return the fail res
     */
    public LoadManager setFailRes(@DrawableRes int failRes) {
        this.mFailRes = failRes;
        return this;
    }

    /**
     * Gets fail res.
     *
     * @return the fail res
     */
    public int getFailRes() {
        return mFailRes;
    }

    /**
     * Sets error net res.
     *
     * @param errorNetRes the error net res
     * @return the error net res
     */
    public LoadManager setErrorNetRes(@DrawableRes int errorNetRes) {
        this.mErrorNetRes = errorNetRes;
        return this;
    }

    /**
     * Gets error net res.
     *
     * @return the error net res
     */
    public int getErrorNetRes() {
        return mErrorNetRes;
    }

    /**
     * Sets empty res.
     *
     * @param emptyRes the empty res
     * @return the empty res
     */
    public LoadManager setEmptyRes(@DrawableRes int emptyRes) {
        this.mEmptyRes = emptyRes;
        return this;
    }

    /**
     * Gets empty res.
     *
     * @return the empty res
     */
    public int getEmptyRes() {
        return mEmptyRes;
    }

    /**
     * Sets fail text.
     *
     * @param failText the fail text
     * @return the fail text
     */
    public LoadManager setFailText(String failText) {
        this.mFailText = failText;
        return this;
    }

    /**
     * Gets fail text.
     *
     * @return the fail text
     */
    public String getFailText() {
        return mFailText;
    }

    /**
     * Sets error net text.
     *
     * @param errorNetText the error net text
     * @return the error net text
     */
    public LoadManager setErrorNetText(String errorNetText) {
        this.mErrorNetText = errorNetText;
        return this;
    }

    /**
     * Gets error net text.
     *
     * @return the error net text
     */
    public String getErrorNetText() {
        return mErrorNetText;
    }

    /**
     * Sets empty text.
     *
     * @param emptyText the empty text
     * @return the empty text
     */
    public LoadManager setEmptyText(String emptyText) {
        this.mEmptyText = emptyText;
        return this;
    }

    /**
     * Gets empty text.
     *
     * @return the empty text
     */
    public String getEmptyText() {
        return mEmptyText;
    }

    /**
     * Sets text color.
     *
     * @param textColor the text color
     * @return the text color
     */
    public LoadManager setTextColor(@ColorInt int textColor) {
        mTextColor = textColor;
        mFailTextColor = textColor;
        mErrorNetTextColor = textColor;
        mEmptyTextColor = textColor;
        return this;
    }

    /**
     * Gets text color.
     *
     * @return the text color
     */
    public int getTextColor() {
        return mTextColor;
    }

    /**
     * Sets fail text color.
     *
     * @param failTextColor the fail text color
     * @return the fail text color
     */
    public LoadManager setFailTextColor(@ColorInt int failTextColor) {
        mFailTextColor = failTextColor;
        return this;
    }

    /**
     * Gets fail text color.
     *
     * @return the fail text color
     */
    public int getFailTextColor() {
        return mFailTextColor;
    }

    /**
     * Sets error net text color.
     *
     * @param errorNetTextColor the error net text color
     * @return the error net text color
     */
    public LoadManager setErrorNetTextColor(@ColorInt int errorNetTextColor) {
        mErrorNetTextColor = errorNetTextColor;
        return this;
    }

    /**
     * Gets error net text color.
     *
     * @return the error net text color
     */
    public int getErrorNetTextColor() {
        return mErrorNetTextColor;
    }

    /**
     * Sets empty text color.
     *
     * @param emptyTextColor the empty text color
     * @return the empty text color
     */
    public LoadManager setEmptyTextColor(@ColorInt int emptyTextColor) {
        mEmptyTextColor = emptyTextColor;
        return this;
    }

    /**
     * Gets empty text color.
     *
     * @return the empty text color
     */
    public int getEmptyTextColor() {
        return mEmptyTextColor;
    }

    /**
     * Sets image color.
     *
     * @param imageColor the image color
     * @return the image color
     */
    public LoadManager setImageColor(@ColorInt int imageColor) {
        this.mImageColor = imageColor;
        this.mFailImageColor = imageColor;
        this.mErrorNetImageColor = imageColor;
        this.mEmptyImageColor = imageColor;
        return this;
    }

    /**
     * Gets image color.
     *
     * @return the image color
     */
    public int getImageColor() {
        return mImageColor;
    }

    /**
     * Sets fail image color.
     *
     * @param failImageColor the fail image color
     * @return the fail image color
     */
    public LoadManager setFailImageColor(@ColorInt int failImageColor) {
        this.mFailImageColor = failImageColor;
        return this;
    }

    /**
     * Gets fail image color.
     *
     * @return the fail image color
     */
    public int getFailImageColor() {
        return mFailImageColor;
    }

    /**
     * Sets error net image color.
     *
     * @param errorNetImageColor the error net image color
     * @return the error net image color
     */
    public LoadManager setErrorNetImageColor(@ColorInt int errorNetImageColor) {
        this.mErrorNetImageColor = errorNetImageColor;
        return this;
    }

    /**
     * Gets error net image color.
     *
     * @return the error net image color
     */
    public int getErrorNetImageColor() {
        return mErrorNetImageColor;
    }

    /**
     * Sets empty image color.
     *
     * @param emptyImageColor the empty image color
     * @return the empty image color
     */
    public LoadManager setEmptyImageColor(@ColorInt int emptyImageColor) {
        this.mEmptyImageColor = emptyImageColor;
        return this;
    }

    /**
     * Gets empty image color.
     *
     * @return the empty image color
     */
    public int getEmptyImageColor() {
        return mEmptyImageColor;
    }

    /**
     * Sets default loading color.
     *
     * @param defaultLoadingColor the default loading color
     * @return the default loading color
     */
    public LoadManager setDefaultLoadingColor(@ColorInt int defaultLoadingColor) {
        this.mDefaultLoadingColor = defaultLoadingColor;
        return this;
    }

    /**
     * Gets default loading color.
     *
     * @return the default loading color
     */
    public int getDefaultLoadingColor() {
        return mDefaultLoadingColor;
    }

    /**
     * Sets text size.
     *
     * @param textSize the text size
     * @return the text size
     */
    public LoadManager setTextSize(int textSize) {
        this.mTextSize = textSize;
        return this;
    }

    /**
     * Gets text size.
     *
     * @return the text size
     */
    public int getTextSize() {
        return mTextSize;
    }

    /**
     * Sets gravity.
     *
     * @param gravity the gravity
     * @return the gravity
     */
    public LoadManager setGravity(int gravity) {
        this.mGravity = gravity;
        this.mLoadingGravity = gravity;
        this.mImageTextGravity = gravity;
        return this;
    }

    /**
     * Gets gravity.
     *
     * @return the gravity
     */
    public int getGravity() {
        return mGravity;
    }

    /**
     * Sets loading gravity.
     *
     * @param loadingGravity the loading gravity
     * @return the loading gravity
     */
    public LoadManager setLoadingGravity(int loadingGravity) {
        this.mLoadingGravity = loadingGravity;
        return this;
    }

    /**
     * Gets loading gravity.
     *
     * @return the loading gravity
     */
    public int getLoadingGravity() {
        return mLoadingGravity;
    }

    /**
     * Sets image text gravity.
     *
     * @param imageTextGravity the image text gravity
     * @return the image text gravity
     */
    public LoadManager setImageTextGravity(int imageTextGravity) {
        this.mImageTextGravity = imageTextGravity;
        return this;
    }

    /**
     * Gets image text gravity.
     *
     * @return the image text gravity
     */
    public int getImageTextGravity() {
        return mImageTextGravity;
    }

    /**
     * Sets margins.
     *
     * @param margin the margin
     * @return the margins
     */
    public LoadManager setMargins(int margin) {
        return setMargins(margin, margin, margin, margin);
    }

    /**
     * Sets margins.
     *
     * @param left   the left
     * @param top    the top
     * @param right  the right
     * @param bottom the bottom
     * @return the margins
     */
    public LoadManager setMargins(int left, int top, int right, int bottom) {
        mImageTextLeftMargin = left;
        mImageTextTopMargin = top;
        mImageTextRightMargin = right;
        mImageTextBottomMargin = bottom;

        mLoadingLeftMargin = left;
        mLoadingTopMargin = top;
        mLoadingRightMargin = right;
        mLoadingBottomMargin = bottom;
        return this;
    }

    /**
     * Sets image text margins.
     *
     * @param left   the left
     * @param top    the top
     * @param right  the right
     * @param bottom the bottom
     * @return the image text margins
     */
    public LoadManager setImageTextMargins(int left, int top, int right, int bottom) {
        mImageTextLeftMargin = left;
        mImageTextTopMargin = top;
        mImageTextRightMargin = right;
        mImageTextBottomMargin = bottom;
        return this;
    }

    /**
     * Sets loading margins.
     *
     * @param left   the left
     * @param top    the top
     * @param right  the right
     * @param bottom the bottom
     * @return the loading margins
     */
    public LoadManager setLoadingMargins(int left, int top, int right, int bottom) {
        mLoadingLeftMargin = left;
        mLoadingTopMargin = top;
        mLoadingRightMargin = right;
        mLoadingBottomMargin = bottom;
        return this;
    }

    /**
     * Gets loading left margin.
     *
     * @return the loading left margin
     */
    public int getLoadingLeftMargin() {
        return mLoadingLeftMargin;
    }

    /**
     * Gets loading top margin.
     *
     * @return the loading top margin
     */
    public int getLoadingTopMargin() {
        return mLoadingTopMargin;
    }

    /**
     * Gets loading right margin.
     *
     * @return the loading right margin
     */
    public int getLoadingRightMargin() {
        return mLoadingRightMargin;
    }

    /**
     * Gets loading bottom margin.
     *
     * @return the loading bottom margin
     */
    public int getLoadingBottomMargin() {
        return mLoadingBottomMargin;
    }

    /**
     * Gets image text left margin.
     *
     * @return the image text left margin
     */
    public int getImageTextLeftMargin() {
        return mImageTextLeftMargin;
    }

    /**
     * Gets image text top margin.
     *
     * @return the image text top margin
     */
    public int getImageTextTopMargin() {
        return mImageTextTopMargin;
    }

    /**
     * Gets image text right margin.
     *
     * @return the image text right margin
     */
    public int getImageTextRightMargin() {
        return mImageTextRightMargin;
    }

    /**
     * Gets image text bottom margin.
     *
     * @return the image text bottom margin
     */
    public int getImageTextBottomMargin() {
        return mImageTextBottomMargin;
    }

    /**
     * Sets image margins.
     *
     * @param left   the left
     * @param top    the top
     * @param right  the right
     * @param bottom the bottom
     * @return the image margins
     */
    public LoadManager setImageMargins(int left, int top, int right, int bottom) {
        mImageLeftMargin = left;
        mImageTopMargin = top;
        mImageRightMargin = right;
        mImageBottomMargin = bottom;
        return this;
    }

    /**
     * Sets text margins.
     *
     * @param left   the left
     * @param top    the top
     * @param right  the right
     * @param bottom the bottom
     * @return the text margins
     */
    public LoadManager setTextMargins(int left, int top, int right, int bottom) {
        mTextLeftMargin = left;
        mTextTopMargin = top;
        mTextRightMargin = right;
        mTextBottomMargin = bottom;
        return this;
    }

    /**
     * Gets image left margin.
     *
     * @return the image left margin
     */
    public int getImageLeftMargin() {
        return mImageLeftMargin;
    }

    /**
     * Gets image top margin.
     *
     * @return the image top margin
     */
    public int getImageTopMargin() {
        return mImageTopMargin;
    }

    /**
     * Gets image right margin.
     *
     * @return the image right margin
     */
    public int getImageRightMargin() {
        return mImageRightMargin;
    }

    /**
     * Gets image bottom margin.
     *
     * @return the image bottom margin
     */
    public int getImageBottomMargin() {
        return mImageBottomMargin;
    }

    /**
     * Gets text left margin.
     *
     * @return the text left margin
     */
    public int getTextLeftMargin() {
        return mTextLeftMargin;
    }

    /**
     * Gets text top margin.
     *
     * @return the text top margin
     */
    public int getTextTopMargin() {
        return mTextTopMargin;
    }

    /**
     * Gets text right margin.
     *
     * @return the text right margin
     */
    public int getTextRightMargin() {
        return mTextRightMargin;
    }

    /**
     * Gets text bottom margin.
     *
     * @return the text bottom margin
     */
    public int getTextBottomMargin() {
        return mTextBottomMargin;
    }

    /**
     * Sets image color enabled.
     *
     * @param imageColorEnabled the image color enabled
     * @return the image color enabled
     */
    public LoadManager setImageColorEnabled(boolean imageColorEnabled) {
        this.mFailImageColorEnabled = imageColorEnabled;
        this.mErrorNetImageColorEnabled = imageColorEnabled;
        this.mEmptyImageColorEnabled = imageColorEnabled;
        return this;
    }

    /**
     * Sets fail image color enabled.
     *
     * @param failImageColorEnabled the fail image color enabled
     * @return the fail image color enabled
     */
    public LoadManager setFailImageColorEnabled(boolean failImageColorEnabled) {
        this.mFailImageColorEnabled = failImageColorEnabled;
        return this;
    }

    /**
     * Is fail image color enabled boolean.
     *
     * @return the boolean
     */
    public boolean isFailImageColorEnabled() {
        return mFailImageColorEnabled;
    }

    /**
     * Sets error net image color enabled.
     *
     * @param errorNetImageColorEnabled the error net image color enabled
     * @return the error net image color enabled
     */
    public LoadManager setErrorNetImageColorEnabled(boolean errorNetImageColorEnabled) {
        this.mErrorNetImageColorEnabled = errorNetImageColorEnabled;
        return this;
    }

    /**
     * Is error net image color enabled boolean.
     *
     * @return the boolean
     */
    public boolean isErrorNetImageColorEnabled() {
        return mErrorNetImageColorEnabled;
    }

    /**
     * Sets empty image color enabled.
     *
     * @param emptyImageColorEnabled the empty image color enabled
     * @return the empty image color enabled
     */
    public LoadManager setEmptyImageColorEnabled(boolean emptyImageColorEnabled) {
        this.mEmptyImageColorEnabled = emptyImageColorEnabled;
        return this;
    }

    /**
     * Is empty image color enabled boolean.
     *
     * @return the boolean
     */
    public boolean isEmptyImageColorEnabled() {
        return mEmptyImageColorEnabled;
    }
}
