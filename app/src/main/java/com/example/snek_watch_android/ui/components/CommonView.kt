package com.example.snek_watch_android.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun CommonView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold (
        modifier = modifier,
        topBar = {
            CommonTopBar()
        }
    ) {
        content(it)
    }
}

@Preview
@Composable
fun PreviewCommonView() {
    SnekwatchandroidTheme {
        CommonView(
            navHostController = rememberNavController()
        ){
            Text(text = "Hello", modifier = Modifier.padding(top = it.calculateTopPadding()))
        }
    }
}


@Composable
private  fun CommonTopBar(
    modifier: Modifier = Modifier
){
    Row (
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(start = 3.dp),
            text = "Snek Watch",
            color = Color.White,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Row (
            modifier = Modifier.padding(end = 3.dp)
        ) {
            SecondarySmallTextButton(
                text = "Manage Data",
                modifier = Modifier.padding(end = 3.dp)
            ) {
                
            }
            SecondarySmallTextButton(text = "Manage Snakes") {
                
            }
        }
    }
}
@Preview
@Composable
fun PreviewCommonTopBar(){
    SnekwatchandroidTheme {
        CommonTopBar()
    }
}