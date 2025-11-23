package com.example.mictest.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mictest.presentation.screens.NoiseTestScreen
import com.example.mictest.presentation.screens.StartScreen


@Composable

fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destinations.StartScreen.name
    ) {
        composable(Destinations.StartScreen.name) {
            StartScreen()
        }
        composable(Destinations.NoiseTestScreen.name) {
            NoiseTestScreen()
        }

    }
}