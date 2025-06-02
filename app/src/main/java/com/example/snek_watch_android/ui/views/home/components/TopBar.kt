package com.example.snek_watch_android.ui.views.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.components.SecondaryMediumTextButton
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier
) {
    Row (
        modifier = modifier
            .padding(WindowInsets.statusBars.asPaddingValues())
            .fillMaxWidth()
            .background(color = Color.Black),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Text(
                modifier = Modifier.padding(start = 3.dp),
                text = "Snek Watch",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.titleLarge
            )
        }
        
        Row (
            modifier = Modifier.padding(end = 3.dp)
        ) {

            SecondaryMediumTextButton(text = "Manage Data", modifier = Modifier.padding(end = 5.dp)) {
                
            }

            SecondaryMediumTextButton(text = "Register Snake") {
                
            }
        }
    }
}

@Preview
@Composable
fun PreviewTopBar() {
    SnekwatchandroidTheme {
        TopBar()
    }
}