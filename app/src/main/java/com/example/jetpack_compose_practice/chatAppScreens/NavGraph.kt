package com.example.jetpack_compose_practice.chatAppScreens
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_compose_practice.chatAppScreens.ui.ChatsScreens
import com.example.jetpack_compose_practice.chatAppScreens.ui.ProfileScreens
import com.example.jetpack_compose_practice.chatAppScreens.ui.UpdateScreens

@Composable
fun MainScreen()
{
    val navController = rememberNavController()
    Scaffold(
        bottomBar =  {BottomNavBar(navController)}
    ) {
        padding ->
        NavHost(
            navController =navController,
            startDestination = Screens.Chats.route,
            modifier = Modifier.padding(padding)
        )
        {
            composable(Screens.Chats.route){ ChatsScreens() }
            composable(Screens.Updates.route){ UpdateScreens() }
            composable(Screens.Profile.route){ ProfileScreens() }
        }
    }
}
