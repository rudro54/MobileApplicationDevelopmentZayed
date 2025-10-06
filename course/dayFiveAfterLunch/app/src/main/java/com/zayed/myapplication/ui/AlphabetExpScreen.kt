package com.zayed.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zayed.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AlphabetExpScreen(modifier: Modifier = Modifier) {

}


@Preview(
    showSystemUi = true,
    showBackground = true

)


@Composable
fun AlphabetExpScreenPreview(modifier: Modifier = Modifier) {
    MyApplicationTheme {
        AlphabetExpScreen()
    }
}
