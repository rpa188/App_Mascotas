package com.example.appmascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() ->{
            mostrarMain();
        },3000);
    }
    private void mostrarMain() {
        startActivity(new Intent(this,OnBoardingActivity.class));
        finish();//Para que cierre el activity
    }
}