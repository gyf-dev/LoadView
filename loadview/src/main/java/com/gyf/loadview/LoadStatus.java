package com.gyf.loadview;

/**
 * The enum Load status.
 *
 * @author geyifeng
 */
public enum LoadStatus {
    /**
     * 默认状态
     */
    UNDO,
    /**
     * 加载中状态
     */
    LOADING,
    /**
     * 失败状态
     */
    FAIL,
    /**
     * 网络错误状态
     */
    ERROR_NET,
    /**
     * 数据为空状态
     */
    EMPTY,
    /**
     * 成功状态
     */
    SUCCESS
}
