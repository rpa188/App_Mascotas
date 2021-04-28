package com.example.appmascotas;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

Button btn_apple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_apple=findViewById(R.id.btn_apple);
        btn_apple.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}