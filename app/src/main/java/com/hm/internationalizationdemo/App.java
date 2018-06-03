package com.hm.internationalizationdemo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by dumingwei on 2018/5/31 0031.
 */
public class App extends Application {

    private static Context context;
    private final String TAG = getClass().getSimpleName();

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
