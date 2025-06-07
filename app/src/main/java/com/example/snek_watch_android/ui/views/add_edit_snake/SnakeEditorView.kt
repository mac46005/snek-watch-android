package com.example.snek_watch_android.ui.views.add_edit_snake

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.components.CommonView
import com.example.snek_watch_android.ui.components.FormTextField
import com.example.snek_watch_android.ui.components.PrimaryLargeTextButton
import com.example.snek_watch_android.ui.theme.Grey20
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnakeEditorView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    nameState: MutableState<String>,
    dobState: DatePickerState
) {
    CommonView(
        modifier  = modifier,
        navHostController = navHostController
    ) {
        LazyColumn(
            modifier = Modifier.padding(top = it.calculateTopPadding())
        ) {
            item {
                Column {
                    Text(
                        text = "Add Snake",
                        color = Color.Black,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Let's start by adding your snake to the tracker. Please fill out the information as accurately as you can—details like their name, date of birth, and species help us give you better insights over time. Even if you're still getting to know your new reptile friend, every bit of info counts. You can always update things later!")
                }



            }
            item {
                FormTextField(
                    fieldName = "Name",
                    value = nameState.value
                ) { newName ->
                    nameState.value = newName
                }
            }

            item {
                Column {
                    Text(
                        text = "DOB",
                        style = MaterialTheme.typography.labelLarge,
                        color = Grey20
                    )

                    DatePicker(state = rememberDatePickerState())
                }
            }

            item {
                PrimaryLargeTextButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { /*TODO*/ }, text = "Register!"
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewAddEditView(){
    SnekwatchandroidTheme {
        SnakeEditorView(
            navHostController = rememberNavController(),
            nameState = remember {
                mutableStateOf("")
            },
            dobState = rememberDatePickerState()
        );
    }
}