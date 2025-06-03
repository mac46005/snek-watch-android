package com.example.snek_watch_android.ui.views.home

import androidx.annotation.experimental.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.components.LargeContent
import com.example.snek_watch_android.ui.components.MediumContent
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.ui.views.home.components.CallToAction
import com.example.snek_watch_android.ui.views.home.components.InfoCard
import com.example.snek_watch_android.ui.components.CommonView;

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HomeView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    CommonView(navHostController = navHostController) {
        LazyColumn (
            modifier = modifier.padding(top = it.calculateTopPadding())
        ) {
            item {
                CallToAction();
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
        );
    }
}