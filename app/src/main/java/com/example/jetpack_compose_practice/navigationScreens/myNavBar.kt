package com.example.jetpack_compose_practice.navigationScreens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val navBarItem = listOf(
        NavBarItem(
            title = "Home",
            icon = Icons.Default.Home, routes = NavBarRouts.Home
        ),
        NavBarItem(
            title = "Search",
            icon = Icons.Default.Search, routes = NavBarRouts.Search
        ),
        NavBarItem(
            title = "Notification",
            icon = Icons.Default.NotificationsActive, routes = NavBarRouts.Notification
        ),
        NavBarItem(
            title = "Profile",
            icon = Icons.Default.Person, routes = NavBarRouts.Profile
        )
    )

    NavigationBar {
        navBarItem.forEach { item ->
            NavigationBarItem(
                selected = currentDestination?.hasRoute(item.routes::class) == true,
                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(
    name = "previewScreen", showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun MyNavBarPreview() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            MyNavBar(navController = navController)
        }
    ) { innerPadding ->
        Text(
            text = "Main Content Area",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

data class NavBarItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRouts
) {
// all
}
