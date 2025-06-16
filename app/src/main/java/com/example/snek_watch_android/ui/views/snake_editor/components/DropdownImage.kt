package com.example.snek_watch_android.ui.views.snake_editor.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.snek_watch_android.ui.common.OnSecondaryLabelLarge
import com.example.snek_watch_android.ui.theme.Grey20
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun DropdownImage(
    modifier: Modifier = Modifier
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Column {

        OnSecondaryLabelLarge(text = "Snake Type")

        Box (
            modifier = modifier
                .fillMaxWidth()
                .height(150.dp)
        ){
            Text(text = "Bald Python")
            AsyncImage(
                model = "https://picsum.photos/200/300",
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        expanded = true
                    }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {
                var selectedOption by remember {
                    mutableStateOf("")
                }

                listOf(
                    "Option 1",
                    "Option 2",
                    "Option 3"
                ).forEach { item ->
                    DropdownMenuItem(
                        text = {
                            Text(text = item)
                        },
                        onClick = {
                            selectedOption = item
                        }
                    )
                }
            }
        }
    }
}
@Preview
@Composable
fun PreviewDropdownImage() {
    SnekwatchandroidTheme {
        DropdownImage()
    }
}