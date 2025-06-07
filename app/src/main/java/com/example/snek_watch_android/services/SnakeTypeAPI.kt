package com.example.snek_watch_android.services

import com.example.snek_watch_android.models.SnakeType
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface SnakeTypeAPI {
    @GET("api/snake-types")
    suspend fun getAllSnakeTypes(): List<SnakeType>

    @GET("api/snake-types/{id}")
    suspend fun getSnakeType(@Path("id") id: Long): SnakeType

    @POST("api/snake-types")
    suspend fun createSnakeType(@Body snakeType: SnakeType): SnakeType

    @PUT("api/snake-types/{id")
    suspend fun updateSnakeType(@Path("id") id: Long, @Body snakeType: SnakeType): SnakeType

    @DELETE("api/snake-types/{id}")
    suspend fun deleteSnakeType(@Path("id") id: Long): Response<Unit>
}