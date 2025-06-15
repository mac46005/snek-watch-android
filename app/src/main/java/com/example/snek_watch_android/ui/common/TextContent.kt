package com.example.snek_watch_android.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme


@Composable
fun DisplayLarge(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(modifier = modifier,text = text, style = MaterialTheme.typography.displayLarge);
}

@Preview
@Composable
fun PreviewDisplayLarge(){
    SnekwatchandroidTheme {
        DisplayLarge(text = "Display Large")
    }
}







@Composable
fun DisplayMedium(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(modifier = modifier,text = text, style = MaterialTheme.typography.displayMedium)
}

@Preview
@Composable
fun PreviewDisplayMedium() {
    SnekwatchandroidTheme {
        DisplayMedium(text = "Display Medium");
    }
}











@Composable
fun DisplaySmall(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(modifier = modifier, text = text, style = MaterialTheme.typography.displaySmall);
}

@Preview
@Composable
fun PreviewDisplaySmall(
    modifier: Modifier = Modifier
){
    SnekwatchandroidTheme {
        DisplaySmall(text = "Display Small");
    }
}












@Composable
fun PrimaryDisplaySmall(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.displaySmall,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        fontWeight = FontWeight.Bold
    )
}




@Preview
@Composable
fun PreviewPrimaryDisplaySmall(

) {
    SnekwatchandroidTheme {
        PrimaryDisplaySmall(text = "Primary Display Large")
    }
}

@Composable
fun SecondaryDisplaySmall(
    modifier: Modifier = Modifier,
    text: String
) {

}
@Preview
@Composable
fun PreviewSecondaryDisplaySmall(

) {
    SnekwatchandroidTheme {
        SecondaryDisplaySmall(text = "Secondary Display Small")
    }
}













@Composable
fun SmallContent(
    modifier: Modifier = Modifier,
    title: String,
    content: Array<String>,
    titleColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    paragraphColor: Color = MaterialTheme.colorScheme.onPrimaryContainer
) {
    Column (
        modifier = modifier
    ) {
        Text(text = title, style = MaterialTheme.typography.titleSmall, color = titleColor)
        Spacer(modifier = Modifier.height(10.dp))
        for (paragraph in content) {
            Text(text = paragraph, style = MaterialTheme.typography.bodySmall, color = paragraphColor)
        }
    }

}

@Preview
@Composable
fun PreviewSmallContent() {
    SnekwatchandroidTheme {
        MediumContent(title = "Medium Content", content = arrayOf("Lorem ipsum dolor sit, amet consectetur adipisicing elit. Voluptate autem dolorum culpa distinctio dolore nobis reiciendis sit illo consectetur pariatur recusandae nostrum odit provident doloribus quibusdam neque, inventore, harum sed."))
    }
}





@Composable
fun MediumContent(
    modifier: Modifier = Modifier,
    title: String,
    content: Array<String>,
    titleColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    paragraphColor: Color = MaterialTheme.colorScheme.onPrimaryContainer
) {
    Column (
        modifier = modifier
    ) {
        Text(text = title, style = MaterialTheme.typography.titleMedium, color = titleColor, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
        for (paragraph in content) {
            Text(text = paragraph, style = MaterialTheme.typography.bodyMedium, color = paragraphColor)
        }
    }

}

@Preview
@Composable
fun PreviewMediumContent() {
    SnekwatchandroidTheme {
        MediumContent(title = "Medium Content", content = arrayOf("Lorem ipsum dolor sit, amet consectetur adipisicing elit. Voluptate autem dolorum culpa distinctio dolore nobis reiciendis sit illo consectetur pariatur recusandae nostrum odit provident doloribus quibusdam neque, inventore, harum sed."))
    }
}







@Composable
fun LargeContent(
    modifier: Modifier = Modifier,
    title: String,
    content: Array<String>,
    titleColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    paragraphColor: Color = MaterialTheme.colorScheme.onPrimaryContainer
) {
    Column (
        modifier = modifier
    ) {
        Text(text = title, style = MaterialTheme.typography.titleLarge, color = titleColor)
        Spacer(modifier = Modifier.height(10.dp))
        for (paragraph in content) {
            Text(text = paragraph, style = MaterialTheme.typography.bodyLarge, color = paragraphColor)
        }
    }

}

@Preview
@Composable
fun PreviewLargeContent() {
    SnekwatchandroidTheme {
        LargeContent(title = "Medium Content", content = arrayOf("Lorem ipsum dolor sit, amet consectetur adipisicing elit. Voluptate autem dolorum culpa distinctio dolore nobis reiciendis sit illo consectetur pariatur recusandae nostrum odit provident doloribus quibusdam neque, inventore, harum sed."))
    }
}



