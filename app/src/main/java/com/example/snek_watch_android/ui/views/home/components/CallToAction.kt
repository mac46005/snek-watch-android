package com.example.snek_watch_android.ui.views.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.components.DisplayLarge
import com.example.snek_watch_android.ui.components.DisplaySmall
import com.example.snek_watch_android.ui.components.PrimaryLargeTextButton
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun CallToAction(
    modifier: Modifier = Modifier
) {
    Box (
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp),
        contentAlignment = Alignment.Center
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Track. Regsiter. Care.",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Text(
                text = "Your all-in-one snake manager.",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF999999)
            )
            PrimaryLargeTextButton(onClick = { /*TODO*/ }, text = "Register My Snake")
        }
    }
}

@Preview
@Composable
fun PreviewCallToAction(

) {
    SnekwatchandroidTheme {
        CallToAction()
    }
}