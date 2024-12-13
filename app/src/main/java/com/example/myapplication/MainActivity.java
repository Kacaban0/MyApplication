package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonColor, buttonText, buttonHide, buttonOpenActivity, buttonIncreaseSize;
    private float textSize = 15f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonColor = findViewById(R.id.buttonColor);
        buttonText = findViewById(R.id.buttonText);
        buttonHide = findViewById(R.id.buttonHide);
        buttonOpenActivity = findViewById(R.id.buttonOpenActivity);
        buttonIncreaseSize = findViewById(R.id.buttonIncreaseSize);

        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.GREEN);
            }
        });

        buttonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Nowy tekst yipieeeeeee!");
            }
        });

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
            }
        });

        buttonOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        buttonIncreaseSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize += 5f;
                textView.setTextSize(textSize);
            }
        });
    }
}
