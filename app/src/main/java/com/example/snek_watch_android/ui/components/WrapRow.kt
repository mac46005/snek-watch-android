package com.example.snek_watch_android.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WrapRow(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val placeables = measurables.map{it.measure(constraints)}
        var xPosition = 0;
        val height = placeables.maxOf { it.height }
        layout(
            constraints.maxWidth, height
        ){
            placeables.forEach{placeble ->
                placeble.place(x = xPosition, y = 0)
                xPosition += placeble.width
            }
        }

    }
}

@Preview
@Composable
fun PreviewWrapRow() {
    WrapRow(
        content = {
            Text(text = "Test")
            Text(text = "Test")
        }
    );
}