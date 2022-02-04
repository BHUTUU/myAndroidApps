package com.bhutuu.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://bhutuu.github.io/calculator");
        WebSettings WebSettings = webView.getSettings();
        WebSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}