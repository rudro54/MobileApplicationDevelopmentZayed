package com.zayed.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zayed.myapplication.data.DataSource

@Composable
fun LazyRowScreen(modifier: Modifier = Modifier) {
    Scaffold {innerPadding->
        LazyRow(
            modifier = Modifier.padding(innerPadding)
        ){
            items(DataSource.loadData()){ item->
                Card {
                    Image(
                        painter = painterResource(item.image),
                        contentDescription=stringResource(item.title),
                        modifier = Modifier
                            .width(400.dp)
                            .height(200.dp),
                        contentScale= ContentScale.Crop

                    )
                    Text(
                        text = stringResource(item.title)
                    )
                }
                Spacer(modifier= Modifier.padding(5.dp))

            }










//            item {
//                Text(text="MIU")
//            }
//            items(
//                listOf<String>(
//                    "Android", "Kotlin", "Java"
//                )
//            ){
//                item->
//                   Text(text=item)
//            }

        }

    }


}

@Preview(
    showSystemUi = true
)

@Composable
fun LazyRowScreenPreview(modifier: Modifier = Modifier) {
    LazyRowScreen()

}