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
    PrimaryButton(onClick = onClick) {
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
    PrimaryButton(onClick = onClick) {
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