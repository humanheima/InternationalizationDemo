package com.hm.internationalizationdemo;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
