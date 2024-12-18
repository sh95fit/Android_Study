package com.example.androidstudy.api

import com.example.androidstudy.models.PowerData
import retrofit2.http.GET

interface ApiService {
    @GET("api/board/tk")
    suspend fun getPowerData(): List<PowerData>
}