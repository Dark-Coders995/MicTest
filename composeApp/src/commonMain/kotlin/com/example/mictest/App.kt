package com.example.mictest

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.room.RoomDatabase
import com.example.mictest.data.local.TaskDatabase
import com.example.mictest.presentation.AppTheme
import com.example.mictest.presentation.navigation.AppNavigation

@Composable
fun App(
    databaseBuilder: RoomDatabase.Builder<TaskDatabase>
) {
    val database = remember { databaseBuilder.build() }
    val taskDao = remember { database.taskDao() }

    AppTheme {
        AppNavigation(taskDao)
    }
}