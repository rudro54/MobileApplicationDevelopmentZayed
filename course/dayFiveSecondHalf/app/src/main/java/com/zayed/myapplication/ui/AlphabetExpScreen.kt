package com.zayed.myapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.Text
import com.zayed.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AlphabetExpScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding->
        Column(
            modifier = modifier
                .padding(innerPadding)
        ) {
            //Get view model instance
//        val alphabetViewModel: AlphabetViewModel = viewModel()
            val alphabetViewModel: AlphabetViewModel = viewModel {
                AlphabetViewModel()
            }
            val alphabetUiState = alphabetViewModel.alphabetUiState.collectAsState()
            Text(text = "${alphabetUiState.value.alphabet} : ${alphabetUiState.value.word}")
            Button(
                onClick = {
                    alphabetViewModel.nextAlphabet()
                },
            ) {
                Text(text = "Next")
            }
            when {
                alphabetUiState.value.isCompleted -> {
                    Text(text = "Completed")
                }
            }
        }
    }


}


@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun AlphabetExpScreenPreview(modifier: Modifier = Modifier) {
    MyApplicationTheme {
        AlphabetExpScreen()
    }

}