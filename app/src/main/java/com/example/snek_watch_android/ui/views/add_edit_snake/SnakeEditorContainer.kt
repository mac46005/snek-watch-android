package com.example.snek_watch_android.ui.views.add_edit_snake

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.SnekWatchViewModelProvider
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme
import com.example.snek_watch_android.viewmodels.SnakeEditorViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnakeEditorContainer(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    snakeEditorViewModel: SnakeEditorViewModel = viewModel(factory = SnekWatchViewModelProvider.Factory)
) {
    val nameState = remember {
        mutableStateOf("")
    }
    val snakeTypeListState = remember {
        snakeEditorViewModel.snakeTypes
    }

    LaunchedEffect(key1 = true) {
        snakeEditorViewModel.fetchSnakeTypes()
    }

    val dobState = rememberDatePickerState()

    SnakeEditorView(modifier = modifier, navHostController = navHostController, nameState = nameState, dobState = dobState)
}

@Preview
@Composable
fun PreviewSnakeEditorContainer() {
    SnekwatchandroidTheme {
        SnakeEditorContainer(navHostController = rememberNavController())
    }
}