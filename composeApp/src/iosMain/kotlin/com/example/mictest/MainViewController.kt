package com.example.mictest

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.example.mictest.database.getTaskDatabase

fun MainViewController() = ComposeUIViewController {
    val database = remember { getTaskDatabase() }
    App(database)
}