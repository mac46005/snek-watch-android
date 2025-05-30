package com.example.snek_watch_android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "home") {

    }
}