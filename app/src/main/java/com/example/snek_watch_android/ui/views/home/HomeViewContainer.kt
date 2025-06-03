package com.example.snek_watch_android.ui.views.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeViewContainer(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    HomeView(
        modifier = modifier,
        navHostController = navHostController
    )
}

