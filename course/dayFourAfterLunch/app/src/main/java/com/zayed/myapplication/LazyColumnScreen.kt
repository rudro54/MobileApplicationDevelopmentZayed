import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.zayed.myapplication.data.DataSource

@Composable
fun LazyColumnScreen(modifier: Modifier = Modifier) {
    Scaffold {innerPadding->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ){
            items(DataSource.loadData()){ item->
                Column {
                    Image(
                        painter = painterResource(item.image),
                        contentDescription=stringResource(item.title)

                    )
                    Text(
                        text = stringResource(item.title)
                    )
                }

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
fun LazyColumnScreenPreview(modifier: Modifier = Modifier) {
    LazyColumnScreen()

}