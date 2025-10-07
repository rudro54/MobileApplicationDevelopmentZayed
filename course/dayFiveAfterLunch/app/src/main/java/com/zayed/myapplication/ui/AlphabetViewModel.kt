package com.zayed.myapplication.ui
import com.zayed.myapplication.ui.AlphabetUiState
import androidx.lifecycle.ViewModel
import com.zayed.myapplication.data.AlphabetData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update



// for this no need to add dependency
// we need a data source

class AlphabetViewModel: ViewModel() {
    private val alphabetData = AlphabetData.alphabetData
    //create MutableStateFlow
    // must set some initial value
    private val _alphabetUiState = MutableStateFlow(
        AlphabetUiState(
            alphabet = alphabetData[0].first, // left hand side
            word = alphabetData[0].second // right hand side
        )
    )

    //Expose it as read only state

    val alphabetUiState = _alphabetUiState.asStateFlow()

    fun nextAlphabet() {
        // val currentIndex = alphabetData.indexOfFirst{it.first == _alphabetUiState.value.alphabet}
        val currentIndex = alphabetData.indexOf(_alphabetUiState.value.alphabet to _alphabetUiState.value.word)

        if (currentIndex < alphabetData.size - 1) {//up to current index, 24
            val nextAlphabet = alphabetData[currentIndex + 1]
            _alphabetUiState.update {
                it.copy(
                    alphabet = nextAlphabet.first,
                    word = nextAlphabet.second
                )
            }
        } else {
            _alphabetUiState.update {
                it.copy(
                    alphabet = alphabetData[0].first,
                    word = alphabetData[0].second
                )
            }
        }
        if (currentIndex == alphabetData.size - 2) {
            _alphabetUiState.update {
                it.copy(
                    isCompleted = true
                )
            }
        }
    }
}

