package com.example.jetpack_compose_practice.navigationScreens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationBarGraph() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MyNavBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavBarRouts.Home,
            modifier = Modifier.padding(innerPadding)
        )
        {
            composable<NavBarRouts.Home> { NavBarHomeScreen(navController) }
            composable<NavBarRouts.Search> { NavBarSearchScreen(navController) }
            composable<NavBarRouts.Notification> { NavBarNotificationScreen(navController) }
            composable<NavBarRouts.Profile> { NavBarProfileScreen(navController) }
        }
    }
}

