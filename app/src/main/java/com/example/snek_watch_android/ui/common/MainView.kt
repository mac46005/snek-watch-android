package com.example.snek_watch_android.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun MainView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold (
        modifier = modifier,
        topBar = {
            MainTopBar(
                onClickData = {
                    navHostController.navigate("")
                },
                onClickSnakes = {
                    navHostController.navigate("")
                }
            )
        }
    ) {
        content(it)
    }
}
@Preview
@Composable
fun PreviewMainView(){
    SnekwatchandroidTheme {
        MainView(navHostController = rememberNavController()) {
            Text(
                modifier = Modifier.padding(top = it.calculateTopPadding()),
                text = "Hello Android!"
            )
        }
    }
}









@Composable
fun MainTopBar(
    modifier: Modifier = Modifier,
    onClickData: () -> Unit,
    onClickSnakes: () -> Unit
) {
    Row (
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(WindowInsets.statusBars.asPaddingValues()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(start = 3.dp),
            text = "Snek Watch",
            color = Color.White,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Row (
            modifier = Modifier.padding(end = 3.dp)
        ) {
            SecondarySmallTextButton(
                modifier = Modifier.padding(end = 3.dp),
                text = "Manage Data",
            ) {
                onClickData()
            }

            SecondarySmallTextButton(
                text = "Manage Snakes"
            ) {
                onClickSnakes()
            }
        }
    }

}
@Preview
@Composable
fun PreviewMainTopBar() {
    SnekwatchandroidTheme {
        MainTopBar(onClickData = {}) { }
    }
}