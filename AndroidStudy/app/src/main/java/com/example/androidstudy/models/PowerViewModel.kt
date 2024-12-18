package com.example.androidstudy.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.androidstudy.api.ApiClient
import kotlinx.coroutines.Dispatchers
import android.util.Log

class PowerViewModel : ViewModel() {
    val powerData = liveData(Dispatchers.IO) {
        while (true) {
            try {
                val response = ApiClient.apiService.getPowerData()
                emit(response) // 데이터를 UI에 방출
            } catch (e: Exception) {
                Log.e("PowerViewModel", "Error fetching data", e)
            }
            kotlinx.coroutines.delay(60000) // 1분마다 API 호출
        }
    }
}