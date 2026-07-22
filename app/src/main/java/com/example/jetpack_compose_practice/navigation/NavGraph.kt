package com.example.jetpack_compose_practice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {
    //avController -> handles a navigations
    // remember Nav controller -> creates and remembers nav controller
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MyNavRouts.LoginScreen
    )
    {
        composable<MyNavRouts.LoginScreen>
        {
            LoginScreenUi(navController)
        }
        composable<MyNavRouts.HomeScreen>
        {
            HomeScreenUi(navController)
        }
    }
}
