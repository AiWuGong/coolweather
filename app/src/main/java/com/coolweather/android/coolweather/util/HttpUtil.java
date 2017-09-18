package com.coolweather.android.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Administrator on 2017/9/18.
 */

public class HttpUtil {
    /**
     * 发送Http请求
     */
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
//        Log.d("fragment", "okhttp is good ");
        client.newCall(request).enqueue(callback);
    }
}
