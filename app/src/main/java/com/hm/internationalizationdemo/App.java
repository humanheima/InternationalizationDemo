package com.hm.internationalizationdemo;

import android.app.Application;
import android.content.Context;
import android.os.Build;

/**
 * Created by dumingwei on 2018/5/31 0031.
 */
public class App extends Application {

    private static Context context;
    private final String TAG = getClass().getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        /**
         * 对于7.0以下，需要在Application创建的时候进行语言切换
         */
        String language = SpUtil.getInstance(this).getString(SpUtil.LANGUAGE);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            LanguageUtil.changeAppLanguage(App.getContext(), language);
        }
    }

    public static Context getContext() {
        return context;
    }
}
