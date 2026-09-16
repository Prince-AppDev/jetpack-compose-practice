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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.jetpack_compose_practice.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
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
                    Text(text = "Main Activity", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(16.dp))
                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, SecondActivity::class.java)
                            startActivity(intent)
                        }

                    ) {
                        Text(
                            text = "go to the Second Activity",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    //implicit activity
                    Button(
                        onClick = {
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data =
                                "https://www.youtube.com/redirect?event=video_description&redir_token=QUZZTVljRVVkckJrRlAwRzlJT1htYlJGaTdHeXxBTl9pYzRmenlXbEJTYk5FYjBEeExtdjczVTlUc3BqemdiTkhwRU5mb1hsenVfdHpMU0QtVDhVYklaVHdYUEx6UWxsUGpqbWlESm5ienJnUnA0TzBUdWNMMDEzcWc2X1FkdUlj&q=https%3A%2F%2Fneatroots.com%2Fandev-formula%2Fcurriculum%2F&v=do9hQC8KuRY".toUri()
                            startActivity(intent)
                        }

                    ) {
                        Text(
                            text = "Go the Website ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Button(
                        onClick = {
                            val intent = Intent(Intent.ACTION_MAIN)

                            try {
                                startActivity(intent)
                            } catch (
                                e: Exception
                            ) {
                                e.printStackTrace()
                            }
                        }

                    ) {
                        Text(
                            text = "Go the google Chrome ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Red
                        )
                    }
                    Button(
                        onClick = {
                            val intent = Intent(Intent.ACTION_SEND)
                            intent.type = "text/plain"
                            intent.putExtra(Intent.EXTRA_TEXT, "Hi I am a prince ")
                            startActivity(Intent.createChooser(intent, "Share Message "))
                        }
                    ) {
                        Text(text = "Choose Apps")
                    }

                }
            }
        }
    }
}