package com.praktikum.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    String welcomeMessage;
    TextView textViewwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent intent = getIntent();

        textViewwelcome = findViewById(R.id.textviewwelcome);
        String name;
        welcomeMessage = intent.getStringExtra("welcome");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textViewwelcome.setText(welcomeMessage);

    }
}
