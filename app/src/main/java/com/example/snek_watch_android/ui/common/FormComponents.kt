package com.example.snek_watch_android.ui.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.snek_watch_android.models.SnakeType
import com.example.snek_watch_android.ui.theme.Grey20
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun FormField(
    modifier: Modifier = Modifier,
    label: String,
    field: @Composable () -> Unit
) {
    Column (
        modifier = modifier
    ){
        OnSecondaryLabelLarge(
            modifier = Modifier.padding(bottom = 3.dp),
            text = label
        )
        field()
    }
}
@Preview
@Composable
fun PreviewFormField() {
    SnekwatchandroidTheme {
        FormField(label = "Label") {
        }
    }
}












@Composable
fun FormTextField(
    modifier: Modifier = Modifier,
    fieldName: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    FormField(
        modifier = modifier,
        label = fieldName
    ) {
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













@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerField(
    modifier: Modifier = Modifier,
    fieldName: String,
    state: DatePickerState
) {
    FormField(
        modifier = modifier,
        label = fieldName
    ) {
        DatePicker(
            state = state,
            title = null,
            headline = null
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewDatePickerField() {
    SnekwatchandroidTheme {
        DatePickerField(
            fieldName = "Field Name",
            state = rememberDatePickerState()
        )
    }
}











@Composable
fun DropdownImageMenuField(
    modifier: Modifier = Modifier,
    fieldName: String,
    snakeTypeList: List<SnakeType>,
    snakeTypeValue: SnakeType?,
    onSnakeTypeChange: (SnakeType) -> Unit
) {

    var expanded by remember {
        mutableStateOf(false)
    }


    FormField(
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp),
        label = fieldName
    ) {
        Box (
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(text = if (snakeTypeValue == null) "Select an Option" else snakeTypeValue!!.commonName!!)
            AsyncImage(
                model = snakeTypeValue!!.image,
                contentDescription = snakeTypeValue!!.commonName,
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


                snakeTypeList.forEach { snakeType ->
                    DropdownMenuItem(
                        text = {
                            Text(text = snakeType.commonName!!)
                        },
                        onClick = {
                            expanded = false
                            onSnakeTypeChange(snakeType)
                        }
                    )
                }
            }

        }
    }
}
@Preview
@Composable
fun PreviewDropdowmImageMenuField() {
    SnekwatchandroidTheme {
        DropdownImageMenuField(
            fieldName = "Field Name",
            snakeTypeList = listOf(
                SnakeType(
                    1,
                    "Bald Python"
                )
            )
        )
    }
}