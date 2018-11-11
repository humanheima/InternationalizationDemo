package com.hm.internationalizationdemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.hm.internationalizationdemo.databinding.ActivityAutoResetTextSizeBinding;

public class AutoResetTextSizeActivity extends BaseActivity {

    ActivityAutoResetTextSizeBinding binding;

    public static void launch(Context context) {
        Intent intent = new Intent(context, AutoResetTextSizeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auto_reset_text_size);
        binding.btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvDescription.setText("Hello world.");
            }
        });
    }
}
