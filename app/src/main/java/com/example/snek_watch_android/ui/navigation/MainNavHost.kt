package com.example.snek_watch_android.ui.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.snek_watch_android.ui.views.add_edit_snake.SnakeEditorContainer
import com.example.snek_watch_android.ui.views.home.HomeViewContainer

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MainNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Routes.home.getRoute()) {
        composable(Routes.home.getRoute()) {
            HomeViewContainer(
                navHostController = navController
            )
        }
        composable(
            route = Routes.snakeEditor.getRoute(),
            arguments = Routes.snakeEditor.getNamedNavArguments()
        ) {
            SnakeEditorContainer(navHostController = navController)
        }
    }
}