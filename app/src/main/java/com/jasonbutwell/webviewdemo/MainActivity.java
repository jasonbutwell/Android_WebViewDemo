package com.jasonbutwell.webviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);     // obtain resource ID of web View

        webView.getSettings().setJavaScriptEnabled(true);           // Enable the Java script
        webView.setWebViewClient(new WebViewClient());              // Stops the default browser opening behaviour
        webView.loadUrl("http://www.google.com");                   // Tell the webview which URL to look at
        
    }
}
