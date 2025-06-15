package com.example.snek_watch_android

import android.app.Application

class SnekWatchApplication: Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(this)
    }
}