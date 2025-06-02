package com.example.snek_watch_android.ui.views.home.components

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.components.SecondaryMediumTextButton

@Composable
fun TopBar(
    modifier: Modifier = Modifier
) {
    Row (
        modifier = modifier
            .padding(WindowInsets.statusBars.asPaddingValues())
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Text(
                text = "Snek Watch",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = MaterialTheme.typography.titleLarge
            )
        }
        
        Row {
            SecondaryMediumTextButton(text = "Manage Data", modifier = Modifier.padding(end = 5.dp)) {
                
            }

            SecondaryMediumTextButton(text = "Register Snake") {
                
            }
        }
    }
}