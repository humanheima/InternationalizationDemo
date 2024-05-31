package com.hm.internationalizationdemo;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by dumingwei on 2018/6/3 0003.
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 此方法先于 onCreate()方法执行
     *
     * @param newBase
     */
    @Override
    protected void attachBaseContext(Context newBase) {
        //获取我们存储的语言环境 比如 "en","zh",等等
        String language = SpUtil.getInstance(App.getContext()).getString(SpUtil.LANGUAGE);
        /**
         * attach对应语言环境下的context
         */
        super.attachBaseContext(LanguageUtil.attachBaseContext(newBase, language));
    }

}
