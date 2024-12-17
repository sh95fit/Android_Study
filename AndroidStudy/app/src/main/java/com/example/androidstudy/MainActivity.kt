package com.example.androidstudy

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 액션바 숨기기
        supportActionBar?.hide()

        // 상태바와 내비게이션 바 모두 숨기기
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN or  // 상태바 숨기기
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or  // 내비게이션 바 숨기기
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY  // 화면을 터치해도 다시 나타나지 않도록
                )

        setContentView(R.layout.activity_main)

        // VideoView 초기화
        val videoView = findViewById<VideoView>(R.id.videoView)

        // 동영상 파일 URI 설정 (res/raw/tk_out.mp4)
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tk_out)

        // VideoView에 동영상 설정
        videoView.setVideoURI(videoUri)

        // VideoView가 준비되었을 때 호출되는 리스너 설정
        videoView.setOnPreparedListener { mediaPlayer ->
            // 반복 재생 설정
            mediaPlayer.isLooping = true
        }

        // 동영상 시작
        videoView.start()
    }
}
