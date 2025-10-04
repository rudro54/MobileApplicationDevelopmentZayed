package com.zayed.myapplication.ui

data class AlphabetUiState(
    var alphabet :Char,
    var word : String,
    var isCompleted : Boolean = false,
//    var isError : String?=null,
//    var isLoading : Boolean = false

    // if you fetch from external api we must put error
)
