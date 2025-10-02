package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LazyColumnScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = modifier.padding(innerPadding)
        ) {
            // First item
            item {
                Text(text = "MIU")
            }

            // List items
            items(
                listOf("Android", "Java", "Swift")
            ) { item ->
                Text(text = item)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnScreenPreview() {
    LazyColumnScreen()
}
