package com.example.snek_watch_android.ui.views.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
    title: String,
    sentence: String
) {
    FlowRow (
        modifier = modifier
    ) {
        Column {
            Image(painter = painterResource(id = R.), contentDescription = )
            Text(
                text = title,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
            //Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = sentence,
                fontSize = 24.sp,
                color = Color(0xFF9E9E9E),
                lineHeight = 35.sp
            )
        }

    }
}
@Preview
@Composable
fun PreviewInfoCard() {
    SnekwatchandroidTheme {
        InfoCard(
            modifier = Modifier.fillMaxWidth(),
            title = "Easy Registration",
            sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork."
        );
    }
}


//@Composable
//fun PrimaryHeadline(
//    modifier: Modifier = Modifier,
//    headline: String
//) {
//
//}
//
//@Preview
//@Composable
//fun PreviewPrimaryHeadline(){
//    SnekwatchandroidTheme {
//        PrimaryHeadline()
//    }
//}