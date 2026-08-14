package com.example.jetpack_compose_practice.chatAppScreens.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreens()
{
    Box(modifier =Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text="Profile Screen" , fontSize = 26.sp)
    }
}