package com.example.snek_watch_android.ui.views.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.ui.views.home.components.TopBar

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
        Column (
            modifier = modifier.padding(top = it.calculateTopPadding())
        ) {

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