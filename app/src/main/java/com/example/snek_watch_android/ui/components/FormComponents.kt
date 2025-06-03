package com.example.snek_watch_android.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.theme.Grey20
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun FormTextField(
    modifier: Modifier = Modifier,
    fieldName: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    Column (
        modifier = modifier
    ) {
        Text(
            text = fieldName,
            style = MaterialTheme.typography.labelLarge,
            color = Grey20
        )

        TextField(
            value = value,
            onValueChange = onValueChange,
            shape = RoundedCornerShape(14.dp),
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            )
        )


    }
}

@Preview
@Composable
fun PreviewFormTextField(){
    SnekwatchandroidTheme {
        FormTextField(
            fieldName = "Field Name",
            value = "",
            onValueChange = {

            }
        )
    }
}