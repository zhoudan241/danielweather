package com.daniel.weather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;
import org.litepal.util.Const;

public class DanielWeatherApplication extends Application {

    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();

        /**
         * 初始化工作
         */
        //LitePal数据库初始化
        LitePalApplication.initialize(mContext);
    }

    public static Context getContext(){
        return mContext;
    }
}
