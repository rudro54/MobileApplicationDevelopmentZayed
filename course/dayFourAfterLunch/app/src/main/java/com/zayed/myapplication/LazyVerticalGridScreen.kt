package com.zayed.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.zayed.myapplication.data.DataSource

@Composable
fun LazyVerticalGridScreen(modifier: Modifier = Modifier) {

    Scaffold { innerPadding->
        LazyVerticalGrid(

            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(DataSource.loadData()){
                Image(
                    painter = painterResource(it.image),
                    contentDescription = stringResource(it.title),
                    modifier = Modifier
                        .aspectRatio(2f),
                    contentScale = ContentScale.Crop

                )
            }

        }

    }

}

@Preview(
    showSystemUi = true
)

@Composable
fun LazyVerticalGridScreenPreview(modifier: Modifier = Modifier) {

    LazyVerticalGridScreen()

}