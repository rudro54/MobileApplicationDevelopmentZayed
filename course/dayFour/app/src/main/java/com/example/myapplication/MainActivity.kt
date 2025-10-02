// In app/src/main/java/com/example/myapplication/MainActivity.kt
package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myapplication.ui.BoxShapeScreen
import com.example.myapplication.ui.TextstyleScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colorScheme.background) {
                Column {
                    TextstyleScreen()
                    BoxShapeScreen()
                    RegistrationScreen()

                // This should now be resolved
                }
            }
        }
    }
}
