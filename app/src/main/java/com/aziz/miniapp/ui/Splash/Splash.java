package com.aziz.miniapp.ui.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.aziz.miniapp.R;
import com.aziz.miniapp.ui.product.ProductActivity;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        CountDownTimer timer = new CountDownTimer(5000,5000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("checktick", "ticked");
            }

            @Override
            public void onFinish() {

                Intent intent = new Intent(Splash.this, ProductActivity.class);
                startActivity(intent);
                finish();


            }
        };
        timer.start();

    }
}

