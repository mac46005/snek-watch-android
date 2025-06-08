package com.example.snek_watch_android

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.viewModelFactory

object SnekWatchViewModelProvider {
    val Factory = viewModelFactory {

    }
}

fun CreationExtras.snekWatchApplication(): SnekWatchApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as SnekWatchApplication)