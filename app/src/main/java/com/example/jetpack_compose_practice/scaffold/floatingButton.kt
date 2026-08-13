package com.example.jetpack_compose_practice.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun AppFloatingActionButton() {

    FloatingActionButton(onClick = {} ,
        containerColor = androidx.compose.ui.graphics.Color(0xFFAEB9E8),

        ) {
       Icon(imageVector = Icons.Default.Add, contentDescription = "Add Icon" )
    }
}