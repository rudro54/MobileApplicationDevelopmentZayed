package com.zayed.myapplication.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.update

//view model has ui state what is the relationship association
// view model factory will come later
// one view model for one screen
// reactive stream  -> stream is a flow of data
// emit -> produces the data
// producer -> who produces the data, producer can keep producing data
// consumer -> who consumes the data
// when in mutable state flow it maintains only most recent data
// who ever is subscribed-like a cable  to the producer ( whatever screen connected to the veiw model )
// it can consume most recent data -> Reactive stream
// coroutine
// hot flow -> no matter accessing or not it keeps producing data
// cold flow -> only when consumer access data it produces data

class CounterViewModel {
    private val _counterUiState =
        MutableStateFlow(CounterUiState(count = 0, isLoading = false)) // emits the data
    val counterUiState = _counterUiState.asStateFlow() // it exposes data as readonly


    fun increment() {
        // update MutableStateFlow object
        _counterUiState.update { counterUiState ->
            counterUiState.copy(
                count = counterUiState.count + 1,
                errorMessage = null,
            )
        }
    }


    fun decrement() {

         if(counterUiState.value.count==0){
             _counterUiState.update { counterUiState ->
                 counterUiState.copy(
                     errorMessage = "Count can't be negative"
                 )
             }
         }else{
             _counterUiState.update { counterUiState ->
                 counterUiState.copy(
                     count = counterUiState.count - 1,
                     errorMessage = null,
                 )
             }
         }





    }

}

// flow is stream api stream generates data
// flow cold stream the moment connected people access it it will execute
// state flow is hot stream it will keep producing data














