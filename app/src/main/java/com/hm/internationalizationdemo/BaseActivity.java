package com.hm.internationalizationdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by dumingwei on 2018/6/3 0003.
 */
public class BaseActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void attachBaseContext(Context newBase) {
        String language = SpUtil.getInstance(App.getContext()).getString(SpUtil.LANGUAGE);
        super.attachBaseContext(LanguageUtil.attachBaseContext(newBase, language));
    }

}
