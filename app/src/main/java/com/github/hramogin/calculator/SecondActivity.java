package com.github.hramogin.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button openButton;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        openButton = findViewById(R.id.btn_start_calculator);
        openButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    Intent intent = new Intent(this, ThirdActivity.class);
    startActivity(intent);
    }
}

