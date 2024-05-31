package com.hm.internationalizationdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AutoResetTextSizeActivity extends BaseActivity {


    public static void launch(Context context) {
        Intent intent = new Intent(context, AutoResetTextSizeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_auto_reset_text_size);
    }
}
