package com.example.snek_watch_android.ui.views.snake_editor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.SnekWatchViewModelProvider
import com.example.snek_watch_android.models.SnakeType
import com.example.snek_watch_android.ui.common.DatePickerField
import com.example.snek_watch_android.ui.common.FormTextField
import com.example.snek_watch_android.ui.common.MainView
import com.example.snek_watch_android.ui.common.PrimaryLargeTextButton
import com.example.snek_watch_android.ui.theme.Grey20
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.ui.views.snake_editor.components.DropdownImage
import com.example.snek_watch_android.viewmodels.SnakeEditorViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnakeEditorView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    //snakeEditorViewModel: SnakeEditorViewModel = viewModel(factory = SnekWatchViewModelProvider.Factory)
) {

    val nameState = remember {
        mutableStateOf("")
    }
    val dobState = rememberDatePickerState()

    val snakeTypeListState = remember {
//        snakeEditorViewModel.snakeTypes
        mutableStateListOf<SnakeType>()
    }

    MainView(
        modifier = modifier,
        navHostController = navHostController
    ) {
        LazyColumn (
            modifier = Modifier.padding(top = it.calculateTopPadding())
        ) {
            item {
                Column {
                    Text(
                        text = "\uD83D\uDC0D Add Snake",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Text(
                        text = "Add your snake to the tracker. Enter details like name, birth date, and species to get better insights. Don’t worry—you can update this info anytime!",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodyLarge
                    )
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
                DatePickerField(
                    fieldName = "\uD83C\uDF82 DOB",
                    state = dobState
                )
            }

            item {
                DropdownImage()
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
@Preview
@Composable
fun PreviewSnakeEditorView() {
    SnekwatchandroidTheme {
        SnakeEditorView(
            navHostController =  rememberNavController()
        )
    }
}