package com.example.webtoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mwebview = findViewById(R.id.mwebview);



        mwebview.getSettings().setJavaScriptEnabled(true);

        mwebview.loadUrl("https://www.daraz.com.bd/");

    }
}