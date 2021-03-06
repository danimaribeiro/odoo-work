package com.odoo.work;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.odoo.work.core.support.OdooActivity;
import com.odoo.work.core.support.account.DeviceAccountUtils;

public class SplashScreen extends OdooActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_splash_screen);
        if (DeviceAccountUtils.get(this).hasAnyAccount()) {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                    finish();
                }
            }, 700);
        }
    }
}
