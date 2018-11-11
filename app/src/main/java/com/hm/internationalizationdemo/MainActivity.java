package com.hm.internationalizationdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;

import com.hm.internationalizationdemo.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.app_name);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_change_language:
                ChangeLanguageActivity.launch(this);
                break;
            case R.id.btn_auto_set_text_size:
                AutoResetTextSizeActivity.launch(this);
                break;
            default:
                break;
        }
    }
}
