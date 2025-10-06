package com.zayed.myapplication.ui

data class CounterUiState(
    val count: Int,
    val isLoading : Boolean=false,
    val errorMessage : String ?=null,
    val isCompleted : Boolean = false,
)
