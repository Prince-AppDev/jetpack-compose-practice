package com.example.jetpack_compose_practice.chatAppScreens

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(Screens.Chats, Screens.Updates, Screens.Profile)
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    NavigationBar()
    {
        items.forEach { screens ->
            NavigationBarItem(
                selected = currentRoute == screens.route,
                onClick = {
                    navController.navigate(screens.route)
                    {
                        popUpTo(navController.graph.startDestinationId) {  saveState =true}
                        launchSingleTop =true
                        restoreState =true
                    }
                } ,
                icon = {Icon(screens.icon , contentDescription = screens.label)} ,
                label = {Text(screens.label)}
            )
        }
    }
}