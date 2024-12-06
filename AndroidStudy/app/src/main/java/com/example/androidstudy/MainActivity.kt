package com.example.androidstudy

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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