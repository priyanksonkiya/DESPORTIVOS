package com.example.desportivos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Gallery </font>"));
        setContentView(R.layout.activity_bus_web_view);

        WebView webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://photos.google.com/share/AF1QipPoKaExxu_MdcDCe0hwqQo6conDuaA5Fs4j18EBGDgLYL2JfFPKgU8mo7O4GAG7QQ?key=V29DVno4TGoyQ1VXV21Uc1ZaOG8yS193RG5EOW5R");
    }
}
