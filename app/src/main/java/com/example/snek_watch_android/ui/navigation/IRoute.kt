package com.example.snek_watch_android.ui.navigation

interface IRoute {
    val route: String;
    val title: String;
    val arguments: Array<String>
}