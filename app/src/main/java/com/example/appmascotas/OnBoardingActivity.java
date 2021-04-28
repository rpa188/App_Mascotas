package com.example.appmascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class OnBoardingActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView optionDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        optionDos = findViewById(R.id.optionDos);
        optionDos.setClickable(true);
        optionDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, OnBoardDosActivity.class);
        startActivity(intent);
    }
}