package com.example.snek_watch_android

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.snek_watch_android.viewmodels.SnakeEditorViewModel

object SnekWatchViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            SnakeEditorViewModel()
        }
    }
}

fun CreationExtras.snekWatchApplication(): SnekWatchApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as SnekWatchApplication)