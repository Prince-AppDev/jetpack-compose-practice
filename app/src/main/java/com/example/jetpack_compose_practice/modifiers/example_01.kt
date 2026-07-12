package com.example.jetpack_compose_practice.modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
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
    device = "spec:width=411dp,height=891dp,navigation=buttons"
)
@Composable
fun ModifiersExample()
{
    Column(
        modifier = Modifier.fillMaxWidth().background(color = Color.Cyan)
            .padding(all =10.dp).safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth().background(color =Color.Red,
                shape = RoundedCornerShape(30.dp))
                .height(100.dp),
            horizontalArrangement =  Arrangement.SpaceAround,


        ) {
            Text(text="button1" ,fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
            Text(text="button2",fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
            Text(text="button3",fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
        }



        Box(
            modifier = Modifier.background(color = Color.Green ,
                shape = RoundedCornerShape(30.dp))
                .height(150.dp)
                .width(150.dp)
                .clickable(onClick = {  })
                .border(width = 5.dp, color = Color.Black , shape = RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.Center

            )
        {
            Text(text="Center",fontSize = 20.sp , fontWeight = FontWeight.Bold
            ,color=Color.Black)
        }



        Row(
            modifier = Modifier.fillMaxWidth().background(color = Color.Red,
                shape = RoundedCornerShape(30.dp))
                .safeDrawingPadding().height(100.dp),
            horizontalArrangement =  Arrangement.SpaceAround,
        ) {
            Text(text="one" ,fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
            Text(text="two",fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
            Text(text="three",fontSize = 20.sp, modifier = Modifier.padding(all =30.dp))
        }
    }
}