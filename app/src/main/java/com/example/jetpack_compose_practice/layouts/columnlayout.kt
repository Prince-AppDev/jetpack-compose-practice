package com.example.jetpack_compose_practice.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize()
        .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = "Apple" , fontWeight = FontWeight.Bold)
        Text(text = "Mango" ,fontWeight = FontWeight.Bold)
        Text(text = "Banana" ,fontWeight = FontWeight.Bold)

    }
}
