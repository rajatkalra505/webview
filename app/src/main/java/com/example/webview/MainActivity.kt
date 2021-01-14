package com.example.webview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = findViewById<WebView>(R.id.myweb)
        a.webViewClient = WebViewClient()
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            a.loadUrl("https://www.w3schools.com")
            a.settings.javaScriptEnabled = true
            a.addJavascriptInterface(WebAppInterfce(this),"Android")

        }
    }
}

