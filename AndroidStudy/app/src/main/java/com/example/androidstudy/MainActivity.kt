package com.example.androidstudy

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.androidstudy.models.PowerViewModel

class MainActivity : AppCompatActivity() {
    private val powerViewModel: PowerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherIcon : ImageView = findViewById(R.id.weatherIcon)
        var temperatureTextView : TextView = findViewById(R.id.temperatureTextView)
        val currentEnergy : TextView = findViewById(R.id.currentEnergy)
        val todayEnergy : TextView = findViewById(R.id.todayEnergy)
        val lifetimeEnergy : TextView = findViewById(R.id.lifetimeEnergy)
        val co2Reduction : TextView = findViewById(R.id.co2Reduction)
        val pwnm1 : TextView = findViewById(R.id.pwnm1)
        val pwnm2 : TextView = findViewById(R.id.pwnm2)
        val pwnm3 : TextView = findViewById(R.id.pwnm3)
        val pwnm4 : TextView = findViewById(R.id.pwnm4)

        powerViewModel.powerData.observe(this, Observer { powerDataList ->
            Log.d("PowerData", "Received data: $powerDataList")

            val powerData = powerDataList.firstOrNull {it.pwrnm == "태광태양광"}

            if (powerData != null) {
                currentEnergy.text = "${powerData.outp}"
                todayEnergy.text = "${powerData.todaycpg}"
                lifetimeEnergy.text = "${powerData.accmcpg}"
                co2Reduction.text = "${powerData.totalco2}"
                temperatureTextView.text = "${powerData.tempval}°"

                val filename = powerData.sky.substringAfterLast("/").substringBeforeLast(".")

                val imageResId = resources.getIdentifier(filename, "drawable", packageName)
                if (imageResId != 0) {
                    Glide.with(this).load(imageResId).into(weatherIcon)
                } else {
                    Log.e("PowerData", "Image resource not found for $filename")
                }
                } else {
                    Log.e("PowerData", "No matching data for 태광태양광")
                }

            powerDataList.filter { it.pwrnm in listOf("1", "2", "3", "4") }.forEach { powerData ->
                when (powerData.pwrnm) {
                    "1" -> pwnm1.text = "${powerData.todaycpg}"
                    "2" -> pwnm2.text = "${powerData.todaycpg}"
                    "3" -> pwnm3.text = "${powerData.todaycpg}"
                    "4" -> pwnm4.text = "${powerData.todaycpg}"
                    else -> {
                        Log.e("PowerData", "Unexpected pwrnm value: ${powerData.pwrnm}")
                    }
                }
            }
        })



        // 액션바 숨기기
        supportActionBar?.hide()

        // 상태바와 내비게이션 바 모두 숨기기
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN or  // 상태바 숨기기
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or  // 내비게이션 바 숨기기
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY  // 화면을 터치해도 다시 나타나지 않도록
                )


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
