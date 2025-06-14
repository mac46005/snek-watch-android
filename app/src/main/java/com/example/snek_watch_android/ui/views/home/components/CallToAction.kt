package com.example.snek_watch_android.ui.views.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.common.PrimaryLargeTextButton
import com.example.snek_watch_android.ui.navigation.Routes
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun CallToAction(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp),
        contentAlignment = Alignment.Center
    ) {
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally
        ) {
            Text(
                text = "Track. Register. Care.",
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
            PrimaryLargeTextButton(
                modifier = Modifier
                    .padding(top = 30.dp),
                onClick = {
                    navHostController.navigate(Routes.snakeEditor.getRoute())
                },
                text = "Register My Snake"
            )
        }
    }
}
@Preview
@Composable
fun PreviewCallToAction() {
    SnekwatchandroidTheme {
        CallToAction(
            navHostController = rememberNavController()
        )
    }
}