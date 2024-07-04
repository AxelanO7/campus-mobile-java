package com.dyon.crudkampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnStart = findViewById(R.id.button);

        btnStart.setOnClickListener(v -> {
            Intent i = new Intent(Welcome.this, MainActivity.class);
            startActivity(i);
        });
    }
}
