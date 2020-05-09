package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 用于和服务器联网交互
 */
public class HttpUtil {
    /**
     * 发送请求
     * @param address 传入请求地址
     * @param callback 注册回调用于处理服务器的响应
     */
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
