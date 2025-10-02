// In app/src/main/java/com/example/myapplication/ui/BoxShapeScreen.kt
package com.example.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size // This was duplicated and one was incorrect
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxShapeScreen() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red) // Example content
    )
}

@Preview(showBackground = true)
@Composable
fun BoxShapeScreenPreview() {
    BoxShapeScreen()
}
