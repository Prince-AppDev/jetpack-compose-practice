package com.example.jetpack_compose_practice.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun LazyRowExample()
{
    LazyRow(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .safeDrawingPadding(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    )

    {
       items(count = 10) {
           index ->
           Text(text="block $index" ,
               fontWeight = FontWeight.Bold,
               fontSize = 20.sp,
               color = Color.White,
               modifier = Modifier.background(
                   color = Color.Black,
                   shape = RoundedCornerShape(8.dp)
               )
                   .padding(14.dp)

           )
       }
    }
}
