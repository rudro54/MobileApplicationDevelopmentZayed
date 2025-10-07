package com.zayed.myapplication.ui

data class AlphabetUiState(

    val alphabet : Char,
    val word : String,
    val isCompleted : Boolean = false,
    // val isLoading : Boolean = false,
    // val isError : String? = null // if fetch from external api then needed


)
