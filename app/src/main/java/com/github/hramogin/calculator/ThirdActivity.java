package com.github.hramogin.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String KEY = "key";
    private Button button1;
    private Button button2;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        button1 = findViewById(R.id.btn_number_1);
        button2 = findViewById(R.id.btn_number_2);
        text = findViewById(R.id.tv_screen);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        if (v.getId() == R.id.btn_number_1) {
            text.setText(str + "1");
        } else if (v.getId() == R.id.btn_number_2) {
            text.setText(str + "2");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY, text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text.setText(savedInstanceState.getString(KEY));
    }
}
