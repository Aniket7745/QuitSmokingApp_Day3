import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quitsmokingapp.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    
    Column {
        Text(text = "Hello, Aniket", fontSize = 24.sp)
         Spacer(modifier = Modifier.size(20.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.c2fc55007729a7ecd51c69c360f93473),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.matchParentSize(),
                    
                )
                Column(
                    modifier  = Modifier,
                    Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "No cigarettes",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),

                        Arrangement.Absolute.Right

                    ) {

                        Column {
                            Text(
                                text = "4",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 32.sp,
                                modifier = Modifier.padding(0.dp)
                            )
                            Text(
                                text = "Days",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 24.sp,
                                modifier = Modifier.padding(0.dp
                                , end = 16.dp)
                            )

                        }


                    }
                }

            }
        }
    }
@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
    
