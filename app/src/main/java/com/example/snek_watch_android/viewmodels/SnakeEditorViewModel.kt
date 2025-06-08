package com.example.snek_watch_android.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.snek_watch_android.models.SnakeType
import com.example.snek_watch_android.services.RetrofitInstance
import kotlinx.coroutines.launch


class SnakeEditorViewModel: ViewModel() {
    var snakeTypes by mutableStateOf<List<SnakeType>>(emptyList())
        private set

    fun fetchSnakeTypes() {
        viewModelScope.launch {
            try {
                snakeTypes = RetrofitInstance.snakeTypesApi.getAllSnakeTypes()
            } catch (e: Exception) {
                Log.e("SnakeEditorViewModel", "Error fetching snake types.")
            }
        }
    }
}