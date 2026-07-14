package com.example.jetpack_compose_practice.stateManagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun StateManagementExample() {
var score by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Counter : $score", fontSize = 40.sp , fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(20.dp))
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Button(onClick = {score++}) {
                Text(text = "Increment", fontSize = 20.sp , fontWeight = FontWeight.Bold)
            }
            Spacer(Modifier.width(35.dp))

            Button(onClick = {score--}) {
                Text(text = "Decrement",fontSize = 20.sp , fontWeight = FontWeight.Bold)

            }
        }
    }
}
