package com.example.session_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Button btn;
        Button btn2;
        btn = findViewById(R.id.btnRelativeLayout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearLayout.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.btnGridLayout);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearLayout.this, GridLayout.class);
                startActivity(intent);
            }
        });
    }
}