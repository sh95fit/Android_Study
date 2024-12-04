package com.example.fullscreenapp

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebView 초기화
        val webView: WebView = findViewById(R.id.webview)

        // WebView 디버깅 활성화 (크롬에서 디버깅 가능)
        WebView.setWebContentsDebuggingEnabled(true)

        // WebView 설정
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true // JavaScript 활성화
        webSettings.domStorageEnabled = true // 로컬 스토리지 활성화
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        // WebViewClient 설정 (새로운 창에서 링크를 여는 것을 방지)
        webView.webViewClient = WebViewClient()

        // React 웹 앱 URL 로드 (배포된 URL)
        webView.loadUrl("https://monitoring.itsmore.co.kr/ikea")

        // 상태 바와 내비게이션 바 숨기기
        hideSystemUI()
    }

    // 상태 바와 내비게이션 바 숨기기 함수
    private fun hideSystemUI() {
        // 전체 화면 모드로 설정 (상태 바와 내비게이션 바 숨김)
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )
        actionBar?.hide()  // 액션 바 숨기기
    }

}