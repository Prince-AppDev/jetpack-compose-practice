package com.example.jetpack_compose_practice.buttons
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun TextButtonExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp).safeDrawingPadding(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Text(text = "Forget password",modifier = Modifier.clickable(onClick = {} ))
    }
}
@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun IconButtonExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp).safeDrawingPadding(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        IconButton(onClick = {})
        {


            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "Account Box",
                modifier = Modifier.clickable(onClick = {})
            )
        }
    }
}


