package com.example.mictest

import androidx.compose.runtime.Composable
import com.example.mictest.presentation.AppTheme
import com.example.mictest.presentation.navigation.AppNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    AppTheme {
        AppNavigation()
    }
}