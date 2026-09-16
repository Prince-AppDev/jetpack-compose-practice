package com.example.jetpack_compose_practice.androidBasics.intents

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_practice.ui.theme.MyApplicationTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Second Activity", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(16.dp))
                    Button(
                        onClick = {
                            val intent = Intent(this@SecondActivity, MainActivity::class.java)
                            startActivity(intent)
                        }
                    ) {
                        Text(
                            text = "go to the Main Activity",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
        }
    }
}