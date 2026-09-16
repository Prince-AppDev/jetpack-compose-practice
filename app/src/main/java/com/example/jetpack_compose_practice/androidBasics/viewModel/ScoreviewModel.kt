package com.example.jetpack_compose_practice.stateManagement

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScoreAppViewmodel : ViewModel() {
    var score by mutableIntStateOf(0)
        private set

    fun increment() {
        score++
    }

    fun decrement() {
        score--
    }


}
