package com.example.snek_watch_android.ui.views.home

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.components.LargeContent
import com.example.snek_watch_android.ui.components.MediumContent
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.ui.views.home.components.CallToAction
import com.example.snek_watch_android.ui.views.home.components.InfoCard
import com.example.snek_watch_android.ui.views.home.components.TopBar

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HomeView(
    modifier: Modifier = Modifier
) {
    Scaffold (
        modifier = modifier.padding(horizontal = 20.dp, vertical = 10.dp),
        topBar = {
            TopBar();
        }
    ) {
        LazyColumn (
            modifier = modifier.padding(top = it.calculateTopPadding())
        ) {
            item {
                CallToAction();
            }

            item {
                InfoCard(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Easy Registration",
                    sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork."
                );
            }

            item {
                InfoCard(
                    modifier = Modifier.fillMaxWidth(),
                    title = "Easy Registration",
                    sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork."
                );
            }



        }
    }
}

@Preview
@Composable
fun PreviewHomeView() {
    SnekwatchandroidTheme {
        HomeView();
    }
}