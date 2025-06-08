package com.example.snek_watch_android.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.1.129:8080/api")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val snakeTypesApi: ISnakeTypeAPI = retrofit.create(ISnakeTypeAPI::class.java)
}