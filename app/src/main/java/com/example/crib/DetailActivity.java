package com.example.crib;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        WebView webView = findViewById(R.id.webView);

        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("https://imagine-dragons.fandom.com/ru/wiki/Imagine_Dragons");
         }
        if (position == 1) {
            webView.loadUrl("https://www.last.fm/ru/music/Imagine+Dragons/+albums");

        }
        if (position == 2) {
            webView.loadUrl("https://smotretklipy.ru/imagine-dragons");

        }
        if (position == 3) {
            webView.loadUrl("https://imagine-dragons.fandom.com/ru/wiki/Дэн_Платцман");

        }
        if (position == 4) {
            webView.loadUrl("https://imagine-dragons.fandom.com/ru/wiki/Дэн_Рейнольдс");

        }
        if (position == 5) {
            webView.loadUrl("https://imagine-dragons.fandom.com/ru/wiki/Бен_Макки?so=search");

        }
        if (position == 6) {
            webView.loadUrl("https://imagine-dragons.fandom.com/ru/wiki/Уэйн_Сермон?so=search");

        }
    }

}