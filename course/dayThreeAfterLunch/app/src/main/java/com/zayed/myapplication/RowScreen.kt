package com.zayed.myapplication

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding->
        Row(
          modifier= modifier
              .padding(innerPadding)
              .fillMaxWidth()
              .fillMaxHeight()
              .background(
                  color= Color.LightGray
              )  ,
            horizontalArrangement = Arrangement.spacedBy(50.dp),
            verticalAlignment = Alignment.Top

        ) {
            Text(
                text="MIU",
                color = Color.White,
                modifier= Modifier.background(Color.Red)
                .weight(1f)

            )
            Text(
                text="Faifield",
                modifier = Modifier.weight(1f)




            )

        }

    }

}

@Preview(
   showSystemUi = true
)

@Composable
fun RowScreenPreview() {
    RowScreen()
    
}

