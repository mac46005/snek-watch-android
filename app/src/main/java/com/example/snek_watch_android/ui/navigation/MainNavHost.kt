package com.example.snek_watch_android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.snek_watch_android.ui.views.home.HomeView

@Composable
fun MainNavHost(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Routes.home.getRoute()) {
        composable(Routes.home.getRoute()) {
            HomeView(
                navHostController = navHostController
            )
        }
    }
}