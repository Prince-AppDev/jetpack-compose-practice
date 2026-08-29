package com.example.jetpack_compose_practice.glassMorphUi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp", backgroundColor = 0xFFFFFFFF
)
@Composable
fun GlassCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    listOf(
                        // gradient color background
                        Color(0xFF158CE7),
                        Color(0xFF1128A4)
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Card(
            modifier = Modifier
                .size(300.dp, height = 350.dp)
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                // glass card code
                containerColor = Color.White.copy(alpha = 0.18f)
            ),
            shape = RoundedCornerShape(32.dp),
            // card border
            border = BorderStroke(
                1.dp,
                color = Color.White.copy(alpha = 0.10f)
            ),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 2.dp,
                hoveredElevation = 2.dp
            ),
        )


        {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Glass Card",
                    color = Color.White,
                    fontSize = 20.sp
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Beautiful glass UI ✨",
                    color = Color.White.copy(alpha = 0.8f)
                )
            }
        }
    }
}




