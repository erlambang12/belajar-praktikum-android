package com.praktikum.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends AppCompatActivity {
    Button buttonTest;
    private Object ReceiveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        buttonTest = findViewById(R.id.buttonTest);
    }
    @Override
    protected void onResume() {
        super.onResume();

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ReceiveActivity;class);
                String name;
                Object value;
                intent.putExtra(name "welcome", value "Hello world dari sampleActivity");


                startActivity(intent);

            }
        }