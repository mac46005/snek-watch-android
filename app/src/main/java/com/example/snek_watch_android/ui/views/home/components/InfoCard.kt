package com.example.snek_watch_android.ui.views.home.components

import android.view.accessibility.AccessibilityNodeInfo.RangeInfo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snek_watch_android.R
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
    title: String,
    sentence: String,
    painter: Painter
) {
    FlowRow (
        modifier = modifier
    ) {
//        Spacer(modifier = Modifier.width(300.dp).height(300.dp))
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp)),
            painter = painter,
            contentDescription = "Bald",
            contentScale = ContentScale.FillWidth
        )
        Column {
//            Image(painter = painterResource(id = R.), contentDescription = )
            Text(
                text = title,
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
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
            sentence = "Add your snake's details quickly and securely so you can focus on case, not paperwork.",
            painter = painterResource(id = R.drawable.python_1)
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