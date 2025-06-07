package com.example.snek_watch_android.models

data class SnakeType(
    val id: Long,
    val commonName: String? = null,
    val taxonomyName: String? = null,
    val careLevel: String? = null,
    val overview: String? = null,
    val averageLifeSpanInYrs: Int = 0,
    val averageAdultLengthInFeet: Double = 0.0,
    val diet: String = "",
    val image: String = ""
)
