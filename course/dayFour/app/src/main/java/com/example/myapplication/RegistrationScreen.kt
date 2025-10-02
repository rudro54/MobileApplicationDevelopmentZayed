package com.example.myapplication

import android.R.attr.data
import android.transition.TransitionManager.go
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier // This should be the ONLY 'Modifier' import
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegistrationScreen(modifier: Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = modifier.padding(paddingValues = innerPadding)
        ) {
            var username = remember { mutableStateOf("") }
            TextField(
                value = "hello",
                onValueChange = {
                    data->username=data
                },
                label = { Text(text="Username") } // older version hint/placeholder
            )
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun RegistrationScreenPreview() {
    // Pass a default Modifier to the preview Composable
    RegistrationScreen(modifier = Modifier)

}
