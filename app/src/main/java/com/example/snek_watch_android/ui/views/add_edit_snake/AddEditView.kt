package com.example.snek_watch_android.ui.views.add_edit_snake

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.components.CommonView
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun AddEditView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    name: MutableState<String>
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
                    Text(text = "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Voluptate autem dolorum culpa distinctio dolore nobis reiciendis sit illo consectetur pariatur recusandae nostrum odit provident doloribus quibusdam neque, inventore, harum sed.")
                }



            }
            item {
                Column (
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    Text(
                        text = "Name",
                        style = MaterialTheme.typography.labelLarge,
                        color = Color(0xFF5C5C5C)
                    )

                    TextField(
                        value = name.value,
                        onValueChange = {it -> name.value = it;},
                        shape = RoundedCornerShape(14.dp),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        )
                    )
                }
            }


        }
    }
}

@Preview
@Composable
fun PreviewAddEditView(){
    SnekwatchandroidTheme {
        AddEditView(
            navHostController = rememberNavController(),
            name = remember {
                mutableStateOf("")
            }
        );
    }
}