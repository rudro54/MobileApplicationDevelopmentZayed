package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme



@Composable
fun MyScreen(modifier: Modifier= Modifier){
    Scaffold { innerPadding->
        Text(
            text = "MIU",
            modifier= Modifier.padding(innerPadding)

        )
        Text(
            text = "Fairfield",
            modifier= Modifier.padding(innerPadding)


        )


    }

}

@Preview(
    showSystemUi=true
    )

@Composable
fun MyScreenPreview(){
    MyScreen()
}
