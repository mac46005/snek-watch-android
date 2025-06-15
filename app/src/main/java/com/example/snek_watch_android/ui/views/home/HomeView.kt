package com.example.snek_watch_android.ui.views.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.common.MainView
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.ui.views.home.components.CallToAction
import com.example.snek_watch_android.ui.views.home.components.InfoCard

@Composable
fun HomeView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    MainView(
        modifier = modifier,
        navHostController = navHostController
    ) {
        LazyColumn (
            modifier = Modifier
                .padding(top = it.calculateTopPadding())
        ) {
            item {
                CallToAction(navHostController = navHostController)
            }

            item {
                InfoCard(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Easy registration.",
                    sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork.",
                    painter = painterResource(id = com.example.snek_watch_android.R.drawable.python_1)
                );
            }

            item {
                InfoCard(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Feeding log.",
                    sentence = "Record and review every meal, feeding times, and preferences to support healthy growth.",
                    painter = painterResource(id = com.example.snek_watch_android.R.drawable.snake_eating_1)
                );
            }

            item {
                InfoCard(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Care reminders.",
                    sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork.",
                    painter = painterResource(id = com.example.snek_watch_android.R.drawable.snake_in_hand)
                );
            }


        }
    }
}
@Preview
@Composable
fun PreviewHomeView() {
    SnekwatchandroidTheme {
        HomeView(
            navHostController = rememberNavController()
        )
    }
}