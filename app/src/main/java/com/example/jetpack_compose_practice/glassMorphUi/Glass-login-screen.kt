package com.example.jetpack_compose_practice.glassMorphUi

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp", backgroundColor = 0xFFFFFFFF
)
@Composable
fun GlassLoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF184B6C),
                        Color(0xFF277A83),
                        Color(0xFF254552)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth(0.88f)
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                // glass card code
                containerColor = Color.White.copy(alpha = 0.18f)
            ),
            shape = RoundedCornerShape(32.dp),
            // card border
            border = BorderStroke(
                1.5.dp,
                color = Color(0xFFB8F3FF).copy(alpha = 0.65f)
            ),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 0.dp,
                hoveredElevation = 0.dp
            ),
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth().padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Spacer(Modifier.height(12.dp))
                Text(
                    text = "Login", fontSize = 32.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )

                Spacer(Modifier.height(12.dp))


                TextField(
                    value = username,
                    onValueChange = { username = it },
                    placeholder = {
                        Text("Username", fontWeight = FontWeight.Light)
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFFB8F3FF),
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.4f),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        focusedPlaceholderColor = Color.White.copy(alpha = 0.7f),
                        unfocusedPlaceholderColor = Color.White.copy(alpha = 0.7f)


                    )
                )



                Spacer(Modifier.height(16.dp))

                TextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = {
                        Text("Password", fontWeight = FontWeight.Light)
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFFB8F3FF),
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.4f),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        focusedPlaceholderColor = Color.White.copy(alpha = 0.7f),
                        unfocusedPlaceholderColor = Color.White.copy(alpha = 0.7f)

                    )
                )
                Spacer(Modifier.height(45.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.size(200.dp, 50.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF153941))
                ) {
                    Text(text = "Sign In", fontSize = 20.sp, fontWeight = FontWeight.Light)
                }
                Spacer(Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().height(50.dp).padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Forget password?",
                        color = Color.Black.copy(alpha = 0.6f),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
    }
}

