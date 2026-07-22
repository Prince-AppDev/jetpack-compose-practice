package com.example.jetpack_compose_practice.navigation

import kotlinx.serialization.Serializable

// seal class create a recruited hierarchy ,so its subclass can be defined in the same file
// its own data and behavior
@Serializable
sealed class MyNavRouts {
    @Serializable
    object LoginScreen : MyNavRouts()

    @Serializable
    object HomeScreen : MyNavRouts()

}
