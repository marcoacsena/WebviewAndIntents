package com.example.webviewandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebView wvSGPD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvSGPD = findViewById(R.id.wvSGPD);


//        WebSettings webSettings = wvSGPD.getSettings();
//        webSettings.getJavaScriptEnabled();

        String html = "<html><body><h1>Hello, Marco Sena!</h1></body></html>";
        //wvSGPD.loadData(html, "text/html", "UTF-8");
        wvSGPD.loadUrl("https://tiagoaguiar.co");
        wvSGPD.getSettings().setJavaScriptEnabled(true);

    }


    public void abrirSGPD(View view) {
        Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && wvSGPD.canGoBack()) {
            wvSGPD.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}