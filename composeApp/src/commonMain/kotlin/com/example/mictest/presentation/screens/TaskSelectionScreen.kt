package com.example.mictest.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mictest.presentation.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun TaskSelectionScreen(
    onRead: () -> Unit,
    onImage: () -> Unit,
    onPhoto: () -> Unit,
    history: () -> Unit
) {

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Select a Task",
                style = MaterialTheme.typography.headlineMedium,
            )

            Spacer(
                modifier = Modifier
                    .height(32.dp)
            )

            TaskButton(
                text = "Text Reading Task",
                onClick = onRead
            )

            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )

            TaskButton(
                text = "Image Description Task",
                onClick = onImage
            )
            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )

            TaskButton(
                text = "Photo Capture Task",
                onClick = onPhoto
            )

            Spacer(
                modifier = Modifier
                    .height(32.dp)
            )

            Button(
                onClick = history,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("View Task History")
            }
        }
    }
}


@Composable
fun TaskButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Text(text)
    }
}

@Preview
@Composable
fun TaskSelectionScreenPreview() {
    AppTheme {
        TaskSelectionScreen(
            onRead = {},
            onImage = {},
            onPhoto = {},
            history = {}
        )

    }
}