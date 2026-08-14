package com.example.jetpack_compose_practice.chatAppScreens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Update
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route : String,val label: String,val icon: ImageVector)
{
    object Chats : Screens("chats","Chats", Icons.Default.ChatBubbleOutline)
    object Updates : Screens("update","Update",Icons.Default.Update)
    object Profile : Screens("profile","Profile",Icons.Default.Person)
}
