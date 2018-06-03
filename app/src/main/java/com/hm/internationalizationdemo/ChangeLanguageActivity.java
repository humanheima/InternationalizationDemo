package com.hm.internationalizationdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;

public class ChangeLanguageActivity extends BaseActivity {

    private final String TAG = getClass().getSimpleName();

    public static void launch(Context context) {
        Intent intent = new Intent(context, ChangeLanguageActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.app_name);
        }
    }

    public void onClick(View view) {
        String language = null;
        switch (view.getId()) {
            case R.id.btn_chinese:
                language = LanguageType.CHINESE.getLanguage();
                break;
            case R.id.btn_english:
                language = LanguageType.ENGLISH.getLanguage();
                break;
            case R.id.btn_thailand:
                language = LanguageType.THAILAND.getLanguage();
                break;
            default:
                break;

        }
        changeLanguage(language);
    }

    private void changeLanguage(String language) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            LanguageUtil.changeAppLanguage(App.getContext(), language);
        }
        SpUtil.getInstance(this).putString(SpUtil.LANGUAGE, language);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

}
