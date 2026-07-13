package com.example.jetpack_compose_practice.cards
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
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
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
fun CardsExample2()
{
    Column(
        modifier = Modifier.fillMaxSize().safeDrawingPadding() ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp,
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalAlignment = CenterVertically,
            )
            {
                Box(
                    modifier = Modifier.size(80.dp)
                        .background(
                            color = Color.LightGray,
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center

                )
                {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Person Icon",
                        modifier = Modifier.size(60.dp),
                        tint = Color.Gray
                    )
                }
                Spacer(Modifier.width(10.dp))
                Column() {
                    Text(
                        text = "Krishna Rajput", fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(text = "Hello , I am An Android Developer Currently on Jetpack Compose with kotlin")
                }
            }
        }
             Spacer( Modifier.height(17.dp))

                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp) ,
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp) ,
                        verticalAlignment = CenterVertically,
                    )
                    {
                        Box(
                            modifier = Modifier.size(80.dp)
                                .background(color = Color.LightGray,
                                    shape = CircleShape ),
                            contentAlignment = Alignment.Center

                        )
                        {
                            Icon(imageVector = Icons.Default.Person,
                                contentDescription = "Person Icon" ,
                                modifier = Modifier.size(60.dp),
                                tint = Color.Gray)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column() {
                            Text(text = "Prince Rajput" , fontWeight = FontWeight.Bold ,
                                fontSize = 20.sp)
                            Spacer(Modifier.height(8.dp))
                            Text(text = "Hi , I am An Backend  Engineer Currently on Node.js" )
                        }
                    }
                }
        Spacer( Modifier.height(17.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth()
                            .padding(horizontal = 16.dp) ,
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 10.dp,
                        )
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(16.dp) ,
                            verticalAlignment = CenterVertically,
                        )
                        {
                            Box(
                                modifier = Modifier.size(80.dp)
                                    .background(color = Color.LightGray,
                                        shape = CircleShape ),
                                contentAlignment = Alignment.Center

                            )
                            {
                                Icon(imageVector = Icons.Default.Person,
                                    contentDescription = "Person Icon" ,
                                    modifier = Modifier.size(60.dp),
                                    tint = Color.Gray)
                            }
                            Spacer(Modifier.width(10.dp))
                            Column() {
                                Text(text = "Rahul Kumar" , fontWeight = FontWeight.Bold ,
                                    fontSize = 20.sp)
                                Spacer(Modifier.height(8.dp))
                                Text(text = "Hi , I am  Currently working on full stack Dev" )
                            }
                        }
                    }
        Spacer( Modifier.height(17.dp))
        Card(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 16.dp) ,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp,
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp) ,
                verticalAlignment = CenterVertically,
            )
            {
                Box(
                    modifier = Modifier.size(80.dp)
                        .background(color = Color.LightGray,
                            shape = CircleShape ),
                    contentAlignment = Alignment.Center

                )
                {
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription = "Person Icon" ,
                        modifier = Modifier.size(60.dp),
                        tint = Color.Gray)
                }
                Spacer(Modifier.width(10.dp))
                Column() {
                    Text(text = "Shree Radha" , fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp)
                    Spacer(Modifier.height(8.dp))
                    Text(text = "Hi , I am An Android Developer Currently working on SpringBoot" )
                }
            }
        }

    }
}