package com.zayed.myapplication

import android.R.attr.contentDescription
import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ColumnScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding->
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxWidth()




        ){
            Image(
                painter = painterResource(R.drawable.miu),
                contentDescription =null,
                modifier = Modifier
                   .border(
                       width=2.dp,
                       color = Color.White,
                       shape = CircleShape
                   )
                .clip(CircleShape)
                .size(200.dp)

            )
            Text(
                text = "Maharishi International University"
            )

        }
    }

}

@Preview(
    showSystemUi = true
)

@Composable
fun ColumnScreenPreview(){
    ColumnScreen()
}


