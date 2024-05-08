import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quitsmokingapp.R

@Composable
fun EmotionsScreen(modifier: Modifier = Modifier) {
    Text(text = "Emotions", fontSize = 24.sp)
    Spacer(modifier = Modifier.size(20.dp))
    LazyRow(

    ) {
        itemsIndexed(
            items = listOf(
                "Item 1",


                )
        ) { index, item ->
            
    Happy()
            Good()
            Sad()
        }
    }
}

@Composable
fun Happy(modifier: Modifier = Modifier) {

        Box(
            modifier = Modifier
                .height(100.dp)
                .width(
                    140.dp
                )
                .padding(8.dp)
                .background(
                    color = MaterialTheme.colorScheme.primary,
                    shape = RoundedCornerShape(10.dp)
                )
        ){
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        Arrangement.Absolute.Right
                    ) {
                        Icon(painter = painterResource(id = R.drawable.reshot_icon_happy_2xs5b3fyul),
                            contentDescription ="",modifier = Modifier.size(50.dp) )
                    }
                Text(text = "Happy")
            }
        }


}
@Composable
fun Good(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(100.dp)
            .width(
                140.dp
            )
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
    ){
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                Arrangement.Absolute.Right
            ) {
                Icon(painter = painterResource(id = R.drawable.reshot_icon_wonder_emoji_5yzkl4j6dg),
                    contentDescription ="",modifier = Modifier.size(50.dp) )
            }
            Text(text = "Good")
        }
    }


}
@Composable
fun Sad(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(100.dp)
            .width(
                140.dp
            )
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
    ){
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                Arrangement.Absolute.Right
            ) {
                Icon(painter = painterResource(id = R.drawable.reshot_icon_sad_emoji_7qrmlx9uw4),
                    contentDescription ="",modifier = Modifier.size(50.dp) )
            }
            Text(text = "Sad")
        }
    }


}

@Preview
@Composable
fun EmotionsScreenPreview() {

    EmotionsScreen()

}