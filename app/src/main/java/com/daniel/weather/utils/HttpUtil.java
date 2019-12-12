package com.daniel.weather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * http工具类 采用okhttp
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(address)
                .build();

        client.newCall(request).enqueue(callback);
    }
}
