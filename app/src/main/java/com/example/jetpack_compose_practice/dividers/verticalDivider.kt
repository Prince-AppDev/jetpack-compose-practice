package com.example.jetpack_compose_practice.dividers
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun VerticalDividerExample()
{

Row(
    modifier = Modifier.fillMaxSize().padding(16.dp) ,
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically
)
{
    Text(text="Hello i am prince ")
    VerticalDivider(
        modifier = Modifier.height(500.dp).padding(horizontal = 16.dp),
        thickness = 5.dp,
        color =Color.Blue
    )
    Text(text ="Hello i am Krishna ")
}

}