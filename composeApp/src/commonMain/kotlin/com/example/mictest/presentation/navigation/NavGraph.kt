package com.example.mictest.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mictest.data.local.TaskDao
import com.example.mictest.presentation.screens.HistoryScreen
import com.example.mictest.presentation.screens.ImageScreen
import com.example.mictest.presentation.screens.NoiseTestScreen
import com.example.mictest.presentation.screens.PhotoScreen
import com.example.mictest.presentation.screens.ReadingScreen
import com.example.mictest.presentation.screens.StartScreen
import com.example.mictest.presentation.screens.TaskSelectionScreen


@Composable

fun AppNavigation(
    taskDao: TaskDao
) {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destinations.StartScreen.name
    ) {
        composable(Destinations.StartScreen.name) {
            StartScreen(
                onNext = {
                    navController.navigate(Destinations.NoiseTestScreen.name)
                }
            )
        }
        composable(Destinations.NoiseTestScreen.name) {
            NoiseTestScreen()
        }

        composable(Destinations.TaskSelectionScreen.name) {
            TaskSelectionScreen(
                onRead = {
                    navController.navigate(Destinations.TextReadingScreen.name)
                },
                onImage = {
                    navController.navigate(Destinations.ImageDescriptionScreen.name)
                },
                onPhoto = {
                    navController.navigate(Destinations.PhotoCaptureScreen.name)
                },
                history = {
                    navController.navigate(Destinations.TaskHistory.name)
                }
            )
        }
        composable(Destinations.TextReadingScreen.name) {
            ReadingScreen(
                onBack = {
                    navController.navigate(Destinations.TaskSelectionScreen.name)
                },

                onSuccess = {
                    navController.navigate(Destinations.TaskHistory.name)
                }
            )
        }
        composable(Destinations.ImageDescriptionScreen.name) {
            ImageScreen(
                onBack = {
                    navController.navigate(Destinations.TaskSelectionScreen.name)
                },

                onSuccess = {
                    navController.navigate(Destinations.TaskHistory.name)
                }
            )
        }
        composable(Destinations.PhotoCaptureScreen.name) {
            PhotoScreen(
                onBack = {
                    navController.navigate(Destinations.TaskSelectionScreen.name)
                },

                onSuccess = {
                    navController.navigate(Destinations.TaskHistory.name)
                }
            )
        }
        composable(Destinations.TaskHistory.name) {
            HistoryScreen(
                onBack = {
                    navController.navigate(Destinations.TaskSelectionScreen.name)
                },

                onSuccess = {
                    navController.navigate(Destinations.TaskHistory.name)
                }
            )
        }


    }
}