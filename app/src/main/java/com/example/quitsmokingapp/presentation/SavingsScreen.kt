import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quitsmokingapp.R

@Composable
fun SavingsScreen(modifier: Modifier = Modifier) {

    LazyRow(

    ) {
        itemsIndexed(
            items = listOf(
                "Item 1",


                )
        ) { index, item ->
           NotSmoked()
            Saved()

        }
    }

}
@Composable
fun NotSmoked(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(250.dp)
            .width(
                180.dp
            )
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {
                Text(text = "Saved", fontSize = 22.sp)
                Text(text = "Money", fontSize = 22.sp)
                Text(text = "With this money you could buy gym membership", fontSize = 12.sp)
                Spacer(modifier = Modifier.size(30.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    Arrangement.Absolute.Right

                ) {

                    Column {
                        Text(
                            text = "Rs 700",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 32.sp,
                            modifier = Modifier.padding(0.dp)
                        )

                    }
                }

            }

        }

    }
}
@Composable
fun Saved(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(250.dp)
            .width(
                180.dp
            )
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {
                Text(text = "Not", fontSize = 22.sp)
                Text(text = "Smoked", fontSize = 22.sp)
                Text(text = "0.6 mg nicotine", fontSize = 12.sp)
                Spacer(modifier = Modifier.size(40.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),

                    Arrangement.Absolute.Right

                ) {

                    Column {
                        Text(
                            text = "7",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 32.sp,
                            modifier = Modifier.padding(0.dp)
                        )
                        Text(
                            text = "Packs",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 24.sp,
                            modifier = Modifier.padding(
                                0.dp, end = 16.dp
                            )
                        )

                    }
                }

            }

        }

    }
}


@Preview
@Composable
fun PreviewNotSmoked() {
    SavingsScreen()
}


