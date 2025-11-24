package com.example.mictest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mictest.database.getTaskDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        val database = getTaskDatabase(applicationContext)

        setContent {
            App(database)
        }
    }
}

/*
@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
 */