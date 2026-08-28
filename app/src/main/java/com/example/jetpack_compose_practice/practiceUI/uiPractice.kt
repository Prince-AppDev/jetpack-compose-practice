package com.example.jetpack_compose_practice.practiceUI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_practice.R

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp", backgroundColor = 0xFF131310
)
@Composable
fun CardsExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier
                .size(300.dp, height = 350.dp)
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(32.dp),
            border = BorderStroke(4.dp, color = Color.Transparent),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 4.dp,
                hoveredElevation = 2.dp
            ) ,
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            )
            {
                Box(
                    modifier = Modifier
                        .size(80.dp, height = 20.dp)
                        .background(
                            color = Color.Black.copy(alpha = 0.8f),
                            RoundedCornerShape(4.dp)
                        )
                        .padding(2.dp),
                    contentAlignment = Alignment.Center

                )
                {
                    Text(
                        text = "tensor_boy",
                        color = Color.White,
                        fontSize = 10.sp
                    )
                }
                Box(
                    modifier = Modifier
                        .size(50.dp, height = 20.dp)
                        .background(
                            color = Color.Black.copy(alpha = 0.8f),
                            RoundedCornerShape(4.dp)
                        )
                        .padding(2.dp),
                    contentAlignment = Alignment.CenterStart

                )
                {
                    Text(
                        text = "SITE",
                        color = Color.White,
                        fontSize = 8.sp,
                        textAlign = TextAlign.Center
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(1.dp),
                        horizontalArrangement = Arrangement.Absolute.Right
                    ) {
                        Box(
                            modifier = Modifier
                                .size(20.dp, height = 18.dp)
                                .background(
                                    color = Color.White,
                                    RoundedCornerShape(4.dp)
                                )
                                .padding(0.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "06", color = Color.Black,
                                fontSize = 8.sp
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(0.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Text(
                    text = "Tensorhack", fontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(alpha = 0.8f)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Where you get 147 open hackathons.",
                    fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.DarkGray
                )
                Text(
                    text = "$5.0M in listed prizes.",
                    fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.DarkGray
                )
                Text(
                    text = "Every single listing links back to its source.",
                    fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.DarkGray
                )
                Spacer(Modifier.height(8.dp))

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(220.dp)
                            .clip(shape = RoundedCornerShape(32.dp)),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.mountains),
                            contentDescription = "image",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(32.dp))
                                .size(250.dp)
                                .padding(0.dp)
                        )
                        Text(
                            text = "Hackathons Worth your weekend.",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .align(
                                    Alignment.BottomStart
                                )
                                .padding(start = 16.dp, bottom = 32.dp)
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = "Hackathons Worth your weekend.",
                            color = Color.White,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .align(
                                    Alignment.BottomStart
                                )
                                .padding(start = 16.dp, bottom = 16.dp)
                        )

                    }
                }
            }
        }

    }
}