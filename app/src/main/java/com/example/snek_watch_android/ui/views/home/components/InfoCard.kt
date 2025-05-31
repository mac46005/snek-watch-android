package com.example.snek_watch_android.ui.views.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
    title: String,
    sentence: String
) {

}
@Preview
@Composable
fun PreviewInfoCard() {
    SnekwatchandroidTheme {
        InfoCard();
    }
}


@Composable
fun PrimaryHeadline(
    modifier: Modifier = Modifier,
    headline: String
) {

}

@Preview
@Composable
fun PreviewPrimaryHeadline(){
    SnekwatchandroidTheme {
        PrimaryHeadline()
    }
}