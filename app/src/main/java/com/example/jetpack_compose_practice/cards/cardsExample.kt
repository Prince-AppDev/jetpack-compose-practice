package com.example.jetpack_compose_practice.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun CardsExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .safeDrawingPadding()
            ,

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier.fillMaxWidth().padding(16.dp) ,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                contentColor = Color.Black,
                containerColor = Color.Green.copy(alpha = 5f)),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 20.dp,
                pressedElevation = 20.dp
            ),
            border = BorderStroke(width = 1.dp ,color = Color.Black)

            )
        {
            Text(
                text = "Hello this is Card ",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(all = 15.dp)
            )
        }
    }
}

