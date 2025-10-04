package com.zayed.myapplication

import android.R
import android.R.attr.fontWeight
import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextstyleScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding->
        Column(
            modifier= Modifier.padding(innerPadding)
        ) {
            Text(
                text ="Bright Varghese",
                color =Color.Red,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize=20.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                style =TextStyle(
                    shadow = Shadow(
                        color =Color.Black,
                        blurRadius = 3f,
                        offset = Offset(
                            x=2f,
                            y=2f
                        )
                    ),
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Blue,
                            Color.Green,
                            Color.Yellow,
                            Color.Red
                        )
                    )

                )
            )
        }

    }
    
}


@Preview(
    showSystemUi = true
)

@Composable
fun TextstyleScreenPreview(){
    TextstyleScreen()
}