package com.zayed.myapplication.ui

import android.R.attr.text
import android.util.Log.v
import androidx.compose.runtime.getValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.flow.StateFlow


@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // val counterViewModel: CounterViewModel = viewModel()
            val counterViewModel: CounterViewModel = viewModel()
            val counterUiState: CounterUiState by counterViewModel.counterUiState.collectAsState()
            Text(text="${counterUiState.count}")
            Spacer(modifier= Modifier.padding(20.dp))
            Row {
                Button(
                    onClick = {
                        counterViewModel.decrement()
                    }

                ){
                    Text(text = "Decrement")
                }
                Spacer(modifier= Modifier.padding(10.dp))
                Button(
                    onClick = {
                        counterViewModel.increment()
                    }
                ){
                    Text(text = "Increment")
                }
            }
            when{
                counterUiState.isLoading->{
                    CircularProgressIndicator()
                }
                counterUiState.isCompleted->{
                    Text(text="Completed")
                }
                counterUiState.errorMessage!=null->{
                    Text(text= counterUiState.errorMessage!!)
                }

            }

        }

    }

    
}

@Preview(
    showSystemUi = true
)


@Composable
fun CounterScreenPreview(modifier: Modifier = Modifier) {
    CounterScreen()

}






