import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopScreen(modifier: Modifier = Modifier) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        Arrangement.SpaceBetween,
        Alignment.CenterVertically,

    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Default.Menu , contentDescription =null,
                modifier= Modifier
                    .size(45.dp)
            )

        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Default.Person , contentDescription =null,
                modifier= Modifier
                    .size(45.dp)
            )

        }
    }

}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TopScreenPrev(){
    TopScreen()
}

