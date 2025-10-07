package com.zayed.myapplication.ui

import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zayed.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AlphabetExpScreen(modifier: Modifier = Modifier) {

    Scaffold { innerPadding->
        Column(
            modifier = Modifier.padding(innerPadding)
        ){
            //Get view model instance
            // we need the dependency go to gradle script  build.gradle.kts module
            val alphabetViewModel : AlphabetViewModel = viewModel{
                AlphabetViewModel()

            }
            val alphabetUiState = alphabetViewModel.alphabetUiState.collectAsState()
            Text(text="${alphabetUiState.value.alphabet} : ${alphabetUiState.value.word}")
            Text(text="")
            Button(
                onClick = {
                    alphabetViewModel.nextAlphabet()
                }
            ) {

                Text(text = "Next")
            }
        }


    }


}


@Preview(
    showSystemUi = true,
    showBackground = true

)


@Composable
fun AlphabetExpScreenPreview(modifier: Modifier = Modifier) {
    MyApplicationTheme { // this is for dark mode theme
        AlphabetExpScreen()
    }
}
