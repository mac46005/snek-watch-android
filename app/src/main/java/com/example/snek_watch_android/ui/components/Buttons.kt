package com.example.snek_watch_android.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snek_watch_android.ui.theme.SnekwatchandroidTheme

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp),
        onClick = onClick
    ) {
        content();
    }
}

@Preview
@Composable
fun PreviewPrimaryButton() {
    SnekwatchandroidTheme {
        PrimaryButton(onClick = {}) {

        }
    }
}


@Composable
fun PrimaryLargeTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    PrimaryButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Text(text = text, style = MaterialTheme.typography.labelLarge)
    }
}

@Preview
@Composable
fun PreviewPrimaryLargeTextButton() {
    SnekwatchandroidTheme {
        PrimaryLargeTextButton(onClick = { /*TODO*/ }, text = "L Press me");
    }

}

@Composable
fun PrimaryMediumTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    PrimaryButton(onClick = onClick) {
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}

@Preview
@Composable
fun PreviewPrimaryMediumTextButton() {
    SnekwatchandroidTheme {
        PrimaryMediumTextButton(onClick = { /*TODO*/ }, text = "M Press me");
    }

}
@Composable
fun PrimarySmallTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    PrimaryButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Text(text = text, style = MaterialTheme.typography.labelSmall)
    }
}

@Preview
@Composable
fun PreviewPrimarySmallTextButton() {
    SnekwatchandroidTheme {
        PrimarySmallTextButton(onClick = { /*TODO*/ }, text = "S Press me");
    }

}

















@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary
        ),
        contentPadding = PaddingValues(5.dp)
    ) {
        content();
    }
}

@Preview
@Composable
fun PreviewSecondaryButton(){
    SnekwatchandroidTheme {
        SecondaryButton(onClick = {}) {

        }
    }
}







@Composable
fun SecondaryLargeTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
) {
    SecondaryButton (
        modifier = modifier,
        onClick = onClick
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }

}

@Preview
@Composable
fun PreviewSecondaryLargeButton(){
    SnekwatchandroidTheme {
        SecondaryLargeTextButton(onClick = {},text = "Secondary Large Button")
    }
}

@Composable
fun SecondaryMediumTextButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    SecondaryButton (
        modifier = modifier,
        onClick
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }

}

@Preview
@Composable
fun PreviewSecondarySmallButton(){
    SnekwatchandroidTheme {
        SecondaryMediumTextButton(onClick = {},text = "Secondary Large Button")
    }
}

@Composable
fun SecondarySmallTextButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    SecondaryButton (
        modifier = modifier,
        onClick
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }

}

@Preview
@Composable
fun PreviewSecondaryMediumButton(){
    SnekwatchandroidTheme {
        SecondaryMediumTextButton(onClick = {},text = "Secondary Large Button")
    }
}