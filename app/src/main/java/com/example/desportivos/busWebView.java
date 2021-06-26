package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class busWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Bus Time Table </font>"));
        setContentView(R.layout.activity_bus_web_view);


        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://drive.google.com/file/d/0B43iHl4y2QTyWkhsY1hId1JBX1dQRDhkY1oxaEVQZlBBTGY4/view?usp=sharing");


    }
}
