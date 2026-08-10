package com.example.jetpack_compose_practice.navigationScreens

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRouts {
    @Serializable
    object Home : NavBarRouts()

    @Serializable
    object Search : NavBarRouts()

    @Serializable
    object Notification : NavBarRouts()

    @Serializable
    object Profile : NavBarRouts()
}
