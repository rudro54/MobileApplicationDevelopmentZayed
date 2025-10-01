package com.example.myapplication

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.myapplication.ui.theme.MyApplicationTheme



@Composable
fun MyScreen(modifier: Modifier= Modifier){
    Scaffold { innerPadding->
        Row(
            modifier= Modifier.padding(innerPadding).fillMaxWidth().fillMaxHeight().background(Color.LightGray),
            horizontalArrangement = Arrangement.spacedBy(50.dp),
            verticalAlignment = Alignment.CenterVertically




        ) {




            Text(
                text = "MIU",
                color=Color.White,
                modifier= Modifier.background((Color.Red))


            )
            Text(
                text = "Fairfield",



            )
        }



    }

}

@Preview(
    showSystemUi=true
    )

@Composable
fun MyScreenPreview(){
    MyScreen()
}
