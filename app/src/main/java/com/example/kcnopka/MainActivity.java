package com.example.kcnopka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private ImageView startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView)  findViewById(R.id.helloText);
        startButton = (ImageView) findViewById(R.id.startButton) ;
    }

    public void onStartButtonClick(View view) {
        startButton.setImageResource(R.drawable.android);
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }
}