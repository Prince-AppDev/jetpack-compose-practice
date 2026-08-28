package com.example.jetpack_compose_practice.cards

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_practice.R

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun CardsExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .padding(24.dp),
            shape = RoundedCornerShape(32.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 1.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            border = BorderStroke(4.dp, Color.LightGray)

        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(64.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Box(
                    Modifier
                        .size(70.dp)
                        .height(90.dp)
                        .background(
                            color = Color.Red.copy(alpha = 0.9f),
                            RoundedCornerShape(12.dp)
                        ),
                    contentAlignment = Alignment.Center

                )
                {
                    Column(
                        modifier = Modifier.padding(1.dp)
                    ) {
                        Text(
                            text = "20%", fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold, color = Color.White
                        )


                        Text(
                            text = "OFF", fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold, color = Color.White
                        )
                    }
                }

                Box(
                    Modifier
                        .size(50.dp)
                        .height(50.dp)
                        .background(
                            color = Color.LightGray.copy(alpha = 0.9f),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center

                )
                {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "like", Modifier.size(30.dp)
                    )
                }


            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .padding(0.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(300.dp)
                        .padding(8.dp)
                        .background(color = Color.White),
                    contentAlignment = Alignment.Center,

                    ) {
                    Image(
                        painter = painterResource(R.drawable.shoes),
                        contentDescription = "shoes" ,
                        contentScale = ContentScale.Crop
                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(vertical = 4.dp),
                thickness = 1.dp,
                color = Color.LightGray


            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    text = "Nike Air Max 270", fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "Men Shoes", fontSize = 18.sp, fontWeight = FontWeight.Light,
                    color = Color.DarkGray
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "$129.99", fontWeight = FontWeight.Bold, color = Color.Red,
                    fontSize = 24.sp
                )
                Spacer(Modifier.height(12.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF8E2DE7),
                        contentColor = Color.White
                    )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_bag),
                        contentDescription = "bag"
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = "Buy Now", fontSize = 20.sp)
                }

            }


        }

    }
}

