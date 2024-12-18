package com.example.androidstudy.models

data class PowerData(
    val pwrnm: String,
    val tempval: Int,
    val tempmin: Int,
    val sky: String,
    val outp: Double,
    val totalco2: Double,
    val capacity: Double,
    val todaycpg: Double,
    val accmcpg: Double
)