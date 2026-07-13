package com.example.jetpack_compose_practice.images_icons
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddChart
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun IconsExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon" ,
            modifier = Modifier.size(100.dp),
            tint = Color.Red
        )
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "Person Icon" ,
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )
        Icon(
            imageVector = Icons.Default.AddChart,
            contentDescription = "Person Icon" ,
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )
        Icon(
            imageVector = Icons.Default.Alarm,
            contentDescription = "Person Icon" ,
            modifier = Modifier.size(100.dp),
            tint = Color.Black
        )
    }
}


