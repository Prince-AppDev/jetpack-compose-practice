package com.example.jetpack_compose_practice.chatAppScreens.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2.seconds)
        navController.navigate("chats")
        {
            popUpTo("Splash")
            {
                inclusive = true
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Splash Screen", fontSize = 26.sp,
            style = MaterialTheme.typography.headlineMedium
        )
    }

}

