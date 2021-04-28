package com.example.appmascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OnBoardDosActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView optionUno, cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board_dos);
        optionUno = findViewById(R.id.optionUno);
        cerrar = findViewById(R.id.cerrar);
        optionUno.setOnClickListener(this);
        cerrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.optionUno:
                Intent intent = new Intent(this, OnBoardingActivity.class);
                startActivity(intent);
                break;
            case R.id.cerrar:
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
        }

    }
}